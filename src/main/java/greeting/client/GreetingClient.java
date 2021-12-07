package greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Stub");

        // old and dummt
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);

        //For an asynchronous sum.client:
        //DummyServiceGrpc.DummyServiceFutureStub aSyncClient = DummyServiceGrpc.newFutureStub(channel);


        //create a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);


        //Unary
       /* //created a protobuf greeting message
        Greeting greeting = Greeting.newBuilder().
                setFirstName("Ricardo").
                setLastName("Nogueira").
                build();

        //created a protobuf GreetRequest using our Greeting
        GreetRequest greetRequest = GreetRequest.newBuilder().
                setGreeting(greeting).
                build();

        // call the rpc and get back a GreetResponse
        GreetResponse greetResponse = greetClient.greet(greetRequest);*/


        //Server Streaming
        //We prepare the request
        GreetManyTimesRequest greetManyTimesRequest = GreetManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Ricardo"))
                .build();

        // we stream the responses (in a blocking manner)
        greetClient.greetManyTimes(greetManyTimesRequest)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });

        //print response (Unary)
        //System.out.println(greetResponse.getResult());


        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
