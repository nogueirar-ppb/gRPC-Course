package primeDecomp.client;

import com.proto.primeDecomp.PrimeDecompRequest;
import com.proto.primeDecomp.PrimeDecompServiceGrpc;
import com.proto.primeDecomp.PrimeNumber;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import primeDecomp.service.PrimeDecompServiceImpl;

public class primeDecompClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        System.out.println("Creating stub");

        PrimeDecompServiceGrpc.PrimeDecompServiceBlockingStub primeClient = PrimeDecompServiceGrpc.newBlockingStub(channel);


        PrimeDecompRequest primeDecompRequest = PrimeDecompRequest.newBuilder()
                .setPrimeNumber(PrimeNumber.newBuilder().setPrimeNumberValue(426))
                .build();

        primeClient.decomposePrimeNumber(primeDecompRequest)
                .forEachRemaining(primeDecompResponse -> {
                    System.out.println(primeDecompResponse.getPrimeDecompResponse());
                });


        System.out.println("Shutting down channel");
        channel.shutdown();
    }
}
