package com.proto.max;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: max/max.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FindMaxServiceGrpc {

  private FindMaxServiceGrpc() {}

  public static final String SERVICE_NAME = "max.FindMaxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.max.MaxRequest,
      com.proto.max.MaxResponse> getFindMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMax",
      requestType = com.proto.max.MaxRequest.class,
      responseType = com.proto.max.MaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.max.MaxRequest,
      com.proto.max.MaxResponse> getFindMaxMethod() {
    io.grpc.MethodDescriptor<com.proto.max.MaxRequest, com.proto.max.MaxResponse> getFindMaxMethod;
    if ((getFindMaxMethod = FindMaxServiceGrpc.getFindMaxMethod) == null) {
      synchronized (FindMaxServiceGrpc.class) {
        if ((getFindMaxMethod = FindMaxServiceGrpc.getFindMaxMethod) == null) {
          FindMaxServiceGrpc.getFindMaxMethod = getFindMaxMethod =
              io.grpc.MethodDescriptor.<com.proto.max.MaxRequest, com.proto.max.MaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindMax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.max.MaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.max.MaxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FindMaxServiceMethodDescriptorSupplier("FindMax"))
              .build();
        }
      }
    }
    return getFindMaxMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FindMaxServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceStub>() {
        @java.lang.Override
        public FindMaxServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaxServiceStub(channel, callOptions);
        }
      };
    return FindMaxServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FindMaxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceBlockingStub>() {
        @java.lang.Override
        public FindMaxServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaxServiceBlockingStub(channel, callOptions);
        }
      };
    return FindMaxServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FindMaxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FindMaxServiceFutureStub>() {
        @java.lang.Override
        public FindMaxServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FindMaxServiceFutureStub(channel, callOptions);
        }
      };
    return FindMaxServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FindMaxServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.max.MaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.proto.max.MaxResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindMaxMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindMaxMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.max.MaxRequest,
                com.proto.max.MaxResponse>(
                  this, METHODID_FIND_MAX)))
          .build();
    }
  }

  /**
   */
  public static final class FindMaxServiceStub extends io.grpc.stub.AbstractAsyncStub<FindMaxServiceStub> {
    private FindMaxServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaxServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaxServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.max.MaxRequest> findMax(
        io.grpc.stub.StreamObserver<com.proto.max.MaxResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFindMaxMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FindMaxServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FindMaxServiceBlockingStub> {
    private FindMaxServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaxServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaxServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class FindMaxServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FindMaxServiceFutureStub> {
    private FindMaxServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FindMaxServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FindMaxServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND_MAX = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FindMaxServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FindMaxServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMax(
              (io.grpc.stub.StreamObserver<com.proto.max.MaxResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FindMaxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FindMaxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.max.Max.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FindMaxService");
    }
  }

  private static final class FindMaxServiceFileDescriptorSupplier
      extends FindMaxServiceBaseDescriptorSupplier {
    FindMaxServiceFileDescriptorSupplier() {}
  }

  private static final class FindMaxServiceMethodDescriptorSupplier
      extends FindMaxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FindMaxServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FindMaxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FindMaxServiceFileDescriptorSupplier())
              .addMethod(getFindMaxMethod())
              .build();
        }
      }
    }
    return result;
  }
}
