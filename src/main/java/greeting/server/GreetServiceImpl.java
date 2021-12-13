package greeting.server;

import com.proto.greet.*;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {


    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //extract the fields we need
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        //create the response
        String result = "Hello " + firstName;
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        //send the response
        responseObserver.onNext(response);


        //complete the RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {

        String firstName = request.getGreeting().getFirstName();
        try {
            for (int i = 0; i < 10; i++) {
                String result = "Hello " + firstName + ", response number: " + i;
                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<LongGreetRequest>() {
            String result = "";

            @Override
            public void onNext(LongGreetRequest value) {
                // client sends a message
                result += "Hello " + value.getGreeting().getFirstName() + "! ";
            }

            @Override
            public void onError(Throwable t) {
                //client sends an error

            }

            @Override
            public void onCompleted() {
                //client is done
                responseObserver.onNext(
                        LongGreetResponse.newBuilder()
                                .setResult(result)
                                .build()
                );

                responseObserver.onCompleted();
                //this is when we want to return a response (responseObserver)


            }
        };
        return requestObserver;
    }

    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {
        StreamObserver<GreetEveryoneRequest> requestObserver = new StreamObserver<GreetEveryoneRequest>() {
            @Override
            public void onNext(GreetEveryoneRequest value) {
                String response = "Hello " + value.getGreeting().getFirstName();
                GreetEveryoneResponse greetEveryoneResponse = GreetEveryoneResponse.newBuilder()
                        .setResponse(response)
                        .build();

                responseObserver.onNext(greetEveryoneResponse);
            }

            @Override
            public void onError(Throwable t) {
                //do nothing
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }

    @Override
    public void greetWithDeadline(GreetWithDealineRequest request, StreamObserver<GreetWithDeadlineResponse> responseObserver) {
        Context current = Context.current();
        try {
            for (int i = 0; i < 3; i++) {
                if (!current.isCancelled()) {
                    System.out.println("Sleep for 100 millisecond");
                    Thread.sleep(100);
                } else {
                    return;
                }
            }
            System.out.println("Send response");
            responseObserver.onNext(
                    GreetWithDeadlineResponse.newBuilder()
                            .setResponse("Hello " + request.getGreeting().getFirstName())
                            .build()
            );

            responseObserver.onCompleted();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
