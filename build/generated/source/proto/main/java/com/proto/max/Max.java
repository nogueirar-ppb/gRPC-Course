// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: max/max.proto

package com.proto.max;

public final class Max {
  private Max() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_max_MaxRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_max_MaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_max_MaxResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_max_MaxResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmax/max.proto\022\003max\"\034\n\nMaxRequest\022\016\n\006nu" +
      "mber\030\001 \001(\005\"\"\n\013MaxResponse\022\023\n\013current_max" +
      "\030\001 \001(\0052D\n\016FindMaxService\0222\n\007FindMax\022\017.ma" +
      "x.MaxRequest\032\020.max.MaxResponse\"\000(\0010\001B\021\n\r" +
      "com.proto.maxP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_max_MaxRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_max_MaxRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_max_MaxRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_max_MaxResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_max_MaxResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_max_MaxResponse_descriptor,
        new java.lang.String[] { "CurrentMax", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
