package max.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class FindMaxServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new FindMaxServiceImpl())
                .build();

        server.start();
        System.out.println("Server started");
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("Received shutdown request");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
