package primeDecomp.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class PrimeDecompServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new PrimeDecompServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Recieved shutdownrequest");
            server.shutdown();
            System.out.println("Server successfully stopped");
        }));

        server.awaitTermination();
    }


}
