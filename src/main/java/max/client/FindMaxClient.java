package max.client;

import com.proto.max.FindMaxServiceGrpc;
import com.proto.max.MaxRequest;
import com.proto.max.MaxResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class FindMaxClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        FindMaxServiceGrpc.FindMaxServiceStub asycClient = FindMaxServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<MaxRequest> requestObserver = asycClient.findMax(new StreamObserver<MaxResponse>() {
            @Override
            public void onNext(MaxResponse value) {
                System.out.println("The current max value is: " + value.getCurrentMax());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList(1, 5, 3, 6, 2, 1, 5, 2, 4, 20, 3, 2, 13).forEach(
                number -> {
                    System.out.println("Sending: " + number);
                    requestObserver.onNext(MaxRequest.newBuilder()
                            .setNumber(number)
                            .build());
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
