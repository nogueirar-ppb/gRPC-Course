package com.proto.average;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: average/average.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculateAverageServiceGrpc {

  private CalculateAverageServiceGrpc() {}

  public static final String SERVICE_NAME = "average.CalculateAverageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.average.AverageRequest,
      com.proto.average.AverageResult> getCalculateAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateAverage",
      requestType = com.proto.average.AverageRequest.class,
      responseType = com.proto.average.AverageResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.average.AverageRequest,
      com.proto.average.AverageResult> getCalculateAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.average.AverageRequest, com.proto.average.AverageResult> getCalculateAverageMethod;
    if ((getCalculateAverageMethod = CalculateAverageServiceGrpc.getCalculateAverageMethod) == null) {
      synchronized (CalculateAverageServiceGrpc.class) {
        if ((getCalculateAverageMethod = CalculateAverageServiceGrpc.getCalculateAverageMethod) == null) {
          CalculateAverageServiceGrpc.getCalculateAverageMethod = getCalculateAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.average.AverageRequest, com.proto.average.AverageResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateAverage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.AverageResult.getDefaultInstance()))
              .setSchemaDescriptor(new CalculateAverageServiceMethodDescriptorSupplier("CalculateAverage"))
              .build();
        }
      }
    }
    return getCalculateAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.average.SquareRootRequest,
      com.proto.average.SquareRootResponse> getSquareRootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SquareRoot",
      requestType = com.proto.average.SquareRootRequest.class,
      responseType = com.proto.average.SquareRootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.average.SquareRootRequest,
      com.proto.average.SquareRootResponse> getSquareRootMethod() {
    io.grpc.MethodDescriptor<com.proto.average.SquareRootRequest, com.proto.average.SquareRootResponse> getSquareRootMethod;
    if ((getSquareRootMethod = CalculateAverageServiceGrpc.getSquareRootMethod) == null) {
      synchronized (CalculateAverageServiceGrpc.class) {
        if ((getSquareRootMethod = CalculateAverageServiceGrpc.getSquareRootMethod) == null) {
          CalculateAverageServiceGrpc.getSquareRootMethod = getSquareRootMethod =
              io.grpc.MethodDescriptor.<com.proto.average.SquareRootRequest, com.proto.average.SquareRootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SquareRoot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.SquareRootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.average.SquareRootResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculateAverageServiceMethodDescriptorSupplier("SquareRoot"))
              .build();
        }
      }
    }
    return getSquareRootMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculateAverageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceStub>() {
        @java.lang.Override
        public CalculateAverageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateAverageServiceStub(channel, callOptions);
        }
      };
    return CalculateAverageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculateAverageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceBlockingStub>() {
        @java.lang.Override
        public CalculateAverageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateAverageServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculateAverageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculateAverageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculateAverageServiceFutureStub>() {
        @java.lang.Override
        public CalculateAverageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculateAverageServiceFutureStub(channel, callOptions);
        }
      };
    return CalculateAverageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculateAverageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.average.AverageRequest> calculateAverage(
        io.grpc.stub.StreamObserver<com.proto.average.AverageResult> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCalculateAverageMethod(), responseObserver);
    }

    /**
     * <pre>
     *this will throw an exception if the sent number is negative
     * </pre>
     */
    public void squareRoot(com.proto.average.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.average.SquareRootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSquareRootMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.average.AverageRequest,
                com.proto.average.AverageResult>(
                  this, METHODID_CALCULATE_AVERAGE)))
          .addMethod(
            getSquareRootMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.average.SquareRootRequest,
                com.proto.average.SquareRootResponse>(
                  this, METHODID_SQUARE_ROOT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculateAverageServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculateAverageServiceStub> {
    private CalculateAverageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateAverageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateAverageServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.average.AverageRequest> calculateAverage(
        io.grpc.stub.StreamObserver<com.proto.average.AverageResult> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCalculateAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *this will throw an exception if the sent number is negative
     * </pre>
     */
    public void squareRoot(com.proto.average.SquareRootRequest request,
        io.grpc.stub.StreamObserver<com.proto.average.SquareRootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSquareRootMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculateAverageServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculateAverageServiceBlockingStub> {
    private CalculateAverageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateAverageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateAverageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *this will throw an exception if the sent number is negative
     * </pre>
     */
    public com.proto.average.SquareRootResponse squareRoot(com.proto.average.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSquareRootMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculateAverageServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculateAverageServiceFutureStub> {
    private CalculateAverageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculateAverageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculateAverageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *this will throw an exception if the sent number is negative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.average.SquareRootResponse> squareRoot(
        com.proto.average.SquareRootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSquareRootMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SQUARE_ROOT = 0;
  private static final int METHODID_CALCULATE_AVERAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculateAverageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculateAverageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SQUARE_ROOT:
          serviceImpl.squareRoot((com.proto.average.SquareRootRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.average.SquareRootResponse>) responseObserver);
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
        case METHODID_CALCULATE_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateAverage(
              (io.grpc.stub.StreamObserver<com.proto.average.AverageResult>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculateAverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculateAverageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.average.Average.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculateAverageService");
    }
  }

  private static final class CalculateAverageServiceFileDescriptorSupplier
      extends CalculateAverageServiceBaseDescriptorSupplier {
    CalculateAverageServiceFileDescriptorSupplier() {}
  }

  private static final class CalculateAverageServiceMethodDescriptorSupplier
      extends CalculateAverageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculateAverageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculateAverageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculateAverageServiceFileDescriptorSupplier())
              .addMethod(getCalculateAverageMethod())
              .addMethod(getSquareRootMethod())
              .build();
        }
      }
    }
    return result;
  }
}
