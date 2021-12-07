package average.server;

import com.proto.average.AverageRequest;
import com.proto.average.AverageResult;
import com.proto.average.CalculateAverageServiceGrpc;
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
                totalCount ++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        AverageResult.newBuilder()
                                .setAverage(totalSum/totalCount)
                                .build()
                );

                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }
}
