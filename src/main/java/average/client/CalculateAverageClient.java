package average.client;

import com.proto.average.AverageRequest;
import com.proto.average.AverageResult;
import com.proto.average.CalculateAverageServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculateAverageClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

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
