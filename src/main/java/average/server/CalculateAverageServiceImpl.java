package average.server;

import com.proto.average.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class CalculateAverageServiceImpl extends CalculateAverageServiceGrpc.CalculateAverageServiceImplBase {
    @Override
    public StreamObserver<AverageRequest> calculateAverage(StreamObserver<AverageResult> responseObserver) {
        StreamObserver<AverageRequest> requestObserver = new StreamObserver<AverageRequest>() {

            double totalCount = 0;
            int totalSum = 0;

            @Override
            public void onNext(AverageRequest value) {
                totalSum += value.getNumber();
                totalCount++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        AverageResult.newBuilder()
                                .setAverage(totalSum / totalCount)
                                .build()
                );

                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }


    @Override
    public void squareRoot(SquareRootRequest request, StreamObserver<SquareRootResponse> responseObserver) {
        Integer number = request.getNumber();
        if (number >= 0) {
            double root = Math.sqrt(number);
            responseObserver.onNext(SquareRootResponse.newBuilder()
                    .setNumberRoot(root)
                    .build());
            responseObserver.onCompleted();
        } else {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT
                            .withDescription("The number being sent is not positive")
                            .augmentDescription("Additional error line. Number sent was: " + number)
                            .asRuntimeException()
            );
        }
    }
}
