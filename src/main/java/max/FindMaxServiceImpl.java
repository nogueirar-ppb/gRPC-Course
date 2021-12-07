package max;

import com.google.api.Service;
import com.proto.max.FindMaxServiceGrpc;
import com.proto.max.MaxRequest;
import com.proto.max.MaxResponse;
import io.grpc.stub.StreamObserver;

public class FindMaxServiceImpl extends FindMaxServiceGrpc.FindMaxServiceImplBase {

    @Override
    public StreamObserver<MaxRequest> findMax(StreamObserver<MaxResponse> responseObserver) {
        StreamObserver<MaxRequest> requestObserver = new StreamObserver<MaxRequest>() {

            int currentMax = 0;

            @Override
            public void onNext(MaxRequest value) {

                if(value.getNumber()>currentMax){
                    currentMax = value.getNumber();
                }

                MaxResponse maxResponse = MaxResponse.newBuilder()
                        .setCurrentMax(currentMax)
                        .build();

                responseObserver.onNext(maxResponse);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
        return requestObserver;
    }
}
