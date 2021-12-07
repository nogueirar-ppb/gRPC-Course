package primeDecomp.service;


import com.proto.primeDecomp.PrimeDecompRequest;
import com.proto.primeDecomp.PrimeDecompResponse;
import com.proto.primeDecomp.PrimeDecompServiceGrpc.*;
import io.grpc.stub.StreamObserver;

public class PrimeDecompServiceImpl extends PrimeDecompServiceImplBase {


    @Override
    public void decomposePrimeNumber(PrimeDecompRequest request, StreamObserver<PrimeDecompResponse> responseObserver) {
        int primeNumber = request.getPrimeNumber().getPrimeNumberValue();
        int k = 2;

        while (primeNumber > 1) {
            if (primeNumber % k == 0) {
                PrimeDecompResponse response = PrimeDecompResponse.newBuilder()
                        .setPrimeDecompResponse(k)
                        .build();
                responseObserver.onNext(response);
                primeNumber = primeNumber / k;
            } else {
                k++;
            }
        }

        responseObserver.onCompleted();

    }
}
