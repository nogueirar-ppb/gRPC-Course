package greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext()
                        .build();

        System.out.println("Creating Stub");
        DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        //For an asynchronous client:
        //DummyServiceGrpc.DummyServiceFutureStub aSyncClient = DummyServiceGrpc.newFutureStub(channel);

        //do something


        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
