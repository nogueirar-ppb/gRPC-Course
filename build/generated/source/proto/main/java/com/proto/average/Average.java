// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: average/average.proto

package com.proto.average;

public final class Average {
  private Average() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_average_AverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_average_AverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_average_AverageResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_average_AverageResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025average/average.proto\022\007average\" \n\016Aver" +
      "ageRequest\022\016\n\006number\030\001 \001(\005\" \n\rAverageRes" +
      "ult\022\017\n\007average\030\001 \001(\0012b\n\027CalculateAverage" +
      "Service\022G\n\020CalculateAverage\022\027.average.Av" +
      "erageRequest\032\026.average.AverageResult\"\000(\001" +
      "B\025\n\021com.proto.averageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_average_AverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_average_AverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_average_AverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_average_AverageResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_average_AverageResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_average_AverageResult_descriptor,
        new java.lang.String[] { "Average", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}