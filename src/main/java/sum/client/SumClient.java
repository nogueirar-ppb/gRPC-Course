package sum.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import sum.SumOuterClass.*;
import sum.SumServiceGrpc;

public class SumClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating Stub...");

        SumServiceGrpc.SumServiceBlockingStub sumClient = SumServiceGrpc.newBlockingStub(channel);

        Sum sum = Sum.newBuilder().
                setFirstNumber(10).
                setSecondNumber(59).
                build();

        SumRequest sumRequest = SumRequest.newBuilder().
                setSum(sum).
                build();

        SumResponse response = sumClient.doSum(sumRequest);

        System.out.println("The result of " + sum.getFirstNumber() + " + " + sum.getSecondNumber() + " is " +
                response.getSumResult());

        System.out.println("Shutting down channel");

        channel.shutdown();

    }
}
