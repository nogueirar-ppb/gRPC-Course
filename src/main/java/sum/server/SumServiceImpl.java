package sum.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import sum.SumOuterClass.*;
import sum.SumServiceGrpc;


public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {

    public void doSum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        Sum sum = request.getSum();
        int firstNumber = sum.getFirstNumber();
        int secondNumber = sum.getSecondNumber();

        int result = firstNumber + secondNumber;

        SumResponse response = SumResponse.newBuilder()
                .setSumResult(result)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
