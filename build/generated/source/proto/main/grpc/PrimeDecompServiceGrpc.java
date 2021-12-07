import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: primeDecomp/prime.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PrimeDecompServiceGrpc {

  private PrimeDecompServiceGrpc() {}

  public static final String SERVICE_NAME = "PrimeDecompService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Prime.PrimeDecompRequest,
      Prime.PrimeDecompResponse> getDecomposePrimeNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecomposePrimeNumber",
      requestType = Prime.PrimeDecompRequest.class,
      responseType = Prime.PrimeDecompResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Prime.PrimeDecompRequest,
      Prime.PrimeDecompResponse> getDecomposePrimeNumberMethod() {
    io.grpc.MethodDescriptor<Prime.PrimeDecompRequest, Prime.PrimeDecompResponse> getDecomposePrimeNumberMethod;
    if ((getDecomposePrimeNumberMethod = PrimeDecompServiceGrpc.getDecomposePrimeNumberMethod) == null) {
      synchronized (PrimeDecompServiceGrpc.class) {
        if ((getDecomposePrimeNumberMethod = PrimeDecompServiceGrpc.getDecomposePrimeNumberMethod) == null) {
          PrimeDecompServiceGrpc.getDecomposePrimeNumberMethod = getDecomposePrimeNumberMethod =
              io.grpc.MethodDescriptor.<Prime.PrimeDecompRequest, Prime.PrimeDecompResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecomposePrimeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Prime.PrimeDecompRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Prime.PrimeDecompResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrimeDecompServiceMethodDescriptorSupplier("DecomposePrimeNumber"))
              .build();
        }
      }
    }
    return getDecomposePrimeNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrimeDecompServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceStub>() {
        @java.lang.Override
        public PrimeDecompServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompServiceStub(channel, callOptions);
        }
      };
    return PrimeDecompServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrimeDecompServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceBlockingStub>() {
        @java.lang.Override
        public PrimeDecompServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompServiceBlockingStub(channel, callOptions);
        }
      };
    return PrimeDecompServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrimeDecompServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrimeDecompServiceFutureStub>() {
        @java.lang.Override
        public PrimeDecompServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrimeDecompServiceFutureStub(channel, callOptions);
        }
      };
    return PrimeDecompServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PrimeDecompServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void decomposePrimeNumber(Prime.PrimeDecompRequest request,
        io.grpc.stub.StreamObserver<Prime.PrimeDecompResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecomposePrimeNumberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDecomposePrimeNumberMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                Prime.PrimeDecompRequest,
                Prime.PrimeDecompResponse>(
                  this, METHODID_DECOMPOSE_PRIME_NUMBER)))
          .build();
    }
  }

  /**
   */
  public static final class PrimeDecompServiceStub extends io.grpc.stub.AbstractAsyncStub<PrimeDecompServiceStub> {
    private PrimeDecompServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompServiceStub(channel, callOptions);
    }

    /**
     */
    public void decomposePrimeNumber(Prime.PrimeDecompRequest request,
        io.grpc.stub.StreamObserver<Prime.PrimeDecompResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDecomposePrimeNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrimeDecompServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrimeDecompServiceBlockingStub> {
    private PrimeDecompServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Prime.PrimeDecompResponse> decomposePrimeNumber(
        Prime.PrimeDecompRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDecomposePrimeNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrimeDecompServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrimeDecompServiceFutureStub> {
    private PrimeDecompServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrimeDecompServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrimeDecompServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DECOMPOSE_PRIME_NUMBER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrimeDecompServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrimeDecompServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECOMPOSE_PRIME_NUMBER:
          serviceImpl.decomposePrimeNumber((Prime.PrimeDecompRequest) request,
              (io.grpc.stub.StreamObserver<Prime.PrimeDecompResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PrimeDecompServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrimeDecompServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Prime.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrimeDecompService");
    }
  }

  private static final class PrimeDecompServiceFileDescriptorSupplier
      extends PrimeDecompServiceBaseDescriptorSupplier {
    PrimeDecompServiceFileDescriptorSupplier() {}
  }

  private static final class PrimeDecompServiceMethodDescriptorSupplier
      extends PrimeDecompServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrimeDecompServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PrimeDecompServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrimeDecompServiceFileDescriptorSupplier())
              .addMethod(getDecomposePrimeNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
