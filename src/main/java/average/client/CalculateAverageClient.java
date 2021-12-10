package average.client;

import com.proto.average.AverageRequest;
import com.proto.average.AverageResult;
import com.proto.average.CalculateAverageServiceGrpc;
import com.proto.average.SquareRootRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculateAverageClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();


        //calculateAverage(channel);
        doErrorCall(channel);
        System.out.println("Channel shutting down");
        channel.shutdown();

    }

    private static void doErrorCall(ManagedChannel channel) {
        CalculateAverageServiceGrpc.CalculateAverageServiceBlockingStub blockingStub = CalculateAverageServiceGrpc.newBlockingStub(channel);

        int number = -1;

        try {
            blockingStub.squareRoot(SquareRootRequest.newBuilder()
                    .setNumber(number)
                    .build());
        } catch (StatusRuntimeException e) {
            System.out.println("Got an exception for square root");
            e.printStackTrace();
        }
    }

    private static void calculateAverage(ManagedChannel channel) {
        CalculateAverageServiceGrpc.CalculateAverageServiceStub asyncClient = CalculateAverageServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> requestObserver = asyncClient.calculateAverage(new StreamObserver<AverageResult>() {

            @Override
            public void onNext(AverageResult value) {
                System.out.println("The average is " + value.getAverage());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Average calculated. Finishing...");
                latch.countDown();
            }
        });

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(6)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(3)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(3)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(12)
                .build());


        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
