package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.45.0)",
        comments = "Source: generate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RemoteDBGrpc {

  private RemoteDBGrpc() {}

  public static final String SERVICE_NAME = "org.example.RemoteDB";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.GetRowsRequest,
          org.example.GetRowsResponse> getGetRowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetRows",
          requestType = org.example.GetRowsRequest.class,
          responseType = org.example.GetRowsResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.GetRowsRequest,
          org.example.GetRowsResponse> getGetRowsMethod() {
    io.grpc.MethodDescriptor<org.example.GetRowsRequest, org.example.GetRowsResponse> getGetRowsMethod;
    if ((getGetRowsMethod = RemoteDBGrpc.getGetRowsMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getGetRowsMethod = RemoteDBGrpc.getGetRowsMethod) == null) {
          RemoteDBGrpc.getGetRowsMethod = getGetRowsMethod =
                  io.grpc.MethodDescriptor.<org.example.GetRowsRequest, org.example.GetRowsResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRows"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetRowsRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetRowsResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("GetRows"))
                          .build();
        }
      }
    }
    return getGetRowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.GetColumnsRequest,
          org.example.GetColumnsResponse> getGetColumnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetColumns",
          requestType = org.example.GetColumnsRequest.class,
          responseType = org.example.GetColumnsResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.GetColumnsRequest,
          org.example.GetColumnsResponse> getGetColumnsMethod() {
    io.grpc.MethodDescriptor<org.example.GetColumnsRequest, org.example.GetColumnsResponse> getGetColumnsMethod;
    if ((getGetColumnsMethod = RemoteDBGrpc.getGetColumnsMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getGetColumnsMethod = RemoteDBGrpc.getGetColumnsMethod) == null) {
          RemoteDBGrpc.getGetColumnsMethod = getGetColumnsMethod =
                  io.grpc.MethodDescriptor.<org.example.GetColumnsRequest, org.example.GetColumnsResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetColumns"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetColumnsRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetColumnsResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("GetColumns"))
                          .build();
        }
      }
    }
    return getGetColumnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.GetTablesDataRequest,
          org.example.GetTablesDataResponse> getGetTablesDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "GetTablesData",
          requestType = org.example.GetTablesDataRequest.class,
          responseType = org.example.GetTablesDataResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.GetTablesDataRequest,
          org.example.GetTablesDataResponse> getGetTablesDataMethod() {
    io.grpc.MethodDescriptor<org.example.GetTablesDataRequest, org.example.GetTablesDataResponse> getGetTablesDataMethod;
    if ((getGetTablesDataMethod = RemoteDBGrpc.getGetTablesDataMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getGetTablesDataMethod = RemoteDBGrpc.getGetTablesDataMethod) == null) {
          RemoteDBGrpc.getGetTablesDataMethod = getGetTablesDataMethod =
                  io.grpc.MethodDescriptor.<org.example.GetTablesDataRequest, org.example.GetTablesDataResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTablesData"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetTablesDataRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.GetTablesDataResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("GetTablesData"))
                          .build();
        }
      }
    }
    return getGetTablesDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.CreateTableRequest,
          org.example.CreateTableResponse> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateTable",
          requestType = org.example.CreateTableRequest.class,
          responseType = org.example.CreateTableResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CreateTableRequest,
          org.example.CreateTableResponse> getCreateTableMethod() {
    io.grpc.MethodDescriptor<org.example.CreateTableRequest, org.example.CreateTableResponse> getCreateTableMethod;
    if ((getCreateTableMethod = RemoteDBGrpc.getCreateTableMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getCreateTableMethod = RemoteDBGrpc.getCreateTableMethod) == null) {
          RemoteDBGrpc.getCreateTableMethod = getCreateTableMethod =
                  io.grpc.MethodDescriptor.<org.example.CreateTableRequest, org.example.CreateTableResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTable"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.CreateTableRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.CreateTableResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("CreateTable"))
                          .build();
        }
      }
    }
    return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.AddRowRequest,
          org.example.AddRowResponse> getAddRowMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "AddRow",
          requestType = org.example.AddRowRequest.class,
          responseType = org.example.AddRowResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.AddRowRequest,
          org.example.AddRowResponse> getAddRowMethod() {
    io.grpc.MethodDescriptor<org.example.AddRowRequest, org.example.AddRowResponse> getAddRowMethod;
    if ((getAddRowMethod = RemoteDBGrpc.getAddRowMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getAddRowMethod = RemoteDBGrpc.getAddRowMethod) == null) {
          RemoteDBGrpc.getAddRowMethod = getAddRowMethod =
                  io.grpc.MethodDescriptor.<org.example.AddRowRequest, org.example.AddRowResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRow"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.AddRowRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.AddRowResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("AddRow"))
                          .build();
        }
      }
    }
    return getAddRowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.AddColumnRequest,
          org.example.AddColumnResponse> getAddColumnMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "AddColumn",
          requestType = org.example.AddColumnRequest.class,
          responseType = org.example.AddColumnResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.AddColumnRequest,
          org.example.AddColumnResponse> getAddColumnMethod() {
    io.grpc.MethodDescriptor<org.example.AddColumnRequest, org.example.AddColumnResponse> getAddColumnMethod;
    if ((getAddColumnMethod = RemoteDBGrpc.getAddColumnMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getAddColumnMethod = RemoteDBGrpc.getAddColumnMethod) == null) {
          RemoteDBGrpc.getAddColumnMethod = getAddColumnMethod =
                  io.grpc.MethodDescriptor.<org.example.AddColumnRequest, org.example.AddColumnResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddColumn"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.AddColumnRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.AddColumnResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("AddColumn"))
                          .build();
        }
      }
    }
    return getAddColumnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.DeleteTableRequest,
          org.example.DeleteTableResponse> getDeleteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteTable",
          requestType = org.example.DeleteTableRequest.class,
          responseType = org.example.DeleteTableResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.DeleteTableRequest,
          org.example.DeleteTableResponse> getDeleteTableMethod() {
    io.grpc.MethodDescriptor<org.example.DeleteTableRequest, org.example.DeleteTableResponse> getDeleteTableMethod;
    if ((getDeleteTableMethod = RemoteDBGrpc.getDeleteTableMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getDeleteTableMethod = RemoteDBGrpc.getDeleteTableMethod) == null) {
          RemoteDBGrpc.getDeleteTableMethod = getDeleteTableMethod =
                  io.grpc.MethodDescriptor.<org.example.DeleteTableRequest, org.example.DeleteTableResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTable"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteTableRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteTableResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("DeleteTable"))
                          .build();
        }
      }
    }
    return getDeleteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.DeleteColumnRequest,
          org.example.DeleteColumnResponse> getDeleteColumnMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteColumn",
          requestType = org.example.DeleteColumnRequest.class,
          responseType = org.example.DeleteColumnResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.DeleteColumnRequest,
          org.example.DeleteColumnResponse> getDeleteColumnMethod() {
    io.grpc.MethodDescriptor<org.example.DeleteColumnRequest, org.example.DeleteColumnResponse> getDeleteColumnMethod;
    if ((getDeleteColumnMethod = RemoteDBGrpc.getDeleteColumnMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getDeleteColumnMethod = RemoteDBGrpc.getDeleteColumnMethod) == null) {
          RemoteDBGrpc.getDeleteColumnMethod = getDeleteColumnMethod =
                  io.grpc.MethodDescriptor.<org.example.DeleteColumnRequest, org.example.DeleteColumnResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteColumn"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteColumnRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteColumnResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("DeleteColumn"))
                          .build();
        }
      }
    }
    return getDeleteColumnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.DeleteRowRequest,
          org.example.DeleteRowResponse> getDeleteRowMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeleteRow",
          requestType = org.example.DeleteRowRequest.class,
          responseType = org.example.DeleteRowResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.DeleteRowRequest,
          org.example.DeleteRowResponse> getDeleteRowMethod() {
    io.grpc.MethodDescriptor<org.example.DeleteRowRequest, org.example.DeleteRowResponse> getDeleteRowMethod;
    if ((getDeleteRowMethod = RemoteDBGrpc.getDeleteRowMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getDeleteRowMethod = RemoteDBGrpc.getDeleteRowMethod) == null) {
          RemoteDBGrpc.getDeleteRowMethod = getDeleteRowMethod =
                  io.grpc.MethodDescriptor.<org.example.DeleteRowRequest, org.example.DeleteRowResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRow"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteRowRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.DeleteRowResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("DeleteRow"))
                          .build();
        }
      }
    }
    return getDeleteRowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.EditCellRequest,
          org.example.EditCellResponse> getEditCellMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "EditCell",
          requestType = org.example.EditCellRequest.class,
          responseType = org.example.EditCellResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.EditCellRequest,
          org.example.EditCellResponse> getEditCellMethod() {
    io.grpc.MethodDescriptor<org.example.EditCellRequest, org.example.EditCellResponse> getEditCellMethod;
    if ((getEditCellMethod = RemoteDBGrpc.getEditCellMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getEditCellMethod = RemoteDBGrpc.getEditCellMethod) == null) {
          RemoteDBGrpc.getEditCellMethod = getEditCellMethod =
                  io.grpc.MethodDescriptor.<org.example.EditCellRequest, org.example.EditCellResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditCell"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.EditCellRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.EditCellResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("EditCell"))
                          .build();
        }
      }
    }
    return getEditCellMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.CreateTestTableRequest,
          org.example.CreateTestTableResponse> getCreateTestTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "CreateTestTable",
          requestType = org.example.CreateTestTableRequest.class,
          responseType = org.example.CreateTestTableResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.CreateTestTableRequest,
          org.example.CreateTestTableResponse> getCreateTestTableMethod() {
    io.grpc.MethodDescriptor<org.example.CreateTestTableRequest, org.example.CreateTestTableResponse> getCreateTestTableMethod;
    if ((getCreateTestTableMethod = RemoteDBGrpc.getCreateTestTableMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getCreateTestTableMethod = RemoteDBGrpc.getCreateTestTableMethod) == null) {
          RemoteDBGrpc.getCreateTestTableMethod = getCreateTestTableMethod =
                  io.grpc.MethodDescriptor.<org.example.CreateTestTableRequest, org.example.CreateTestTableResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTestTable"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.CreateTestTableRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.CreateTestTableResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("CreateTestTable"))
                          .build();
        }
      }
    }
    return getCreateTestTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.MergeTablesRequest,
          org.example.MergeTablesResponse> getMergeTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "MergeTables",
          requestType = org.example.MergeTablesRequest.class,
          responseType = org.example.MergeTablesResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.MergeTablesRequest,
          org.example.MergeTablesResponse> getMergeTablesMethod() {
    io.grpc.MethodDescriptor<org.example.MergeTablesRequest, org.example.MergeTablesResponse> getMergeTablesMethod;
    if ((getMergeTablesMethod = RemoteDBGrpc.getMergeTablesMethod) == null) {
      synchronized (RemoteDBGrpc.class) {
        if ((getMergeTablesMethod = RemoteDBGrpc.getMergeTablesMethod) == null) {
          RemoteDBGrpc.getMergeTablesMethod = getMergeTablesMethod =
                  io.grpc.MethodDescriptor.<org.example.MergeTablesRequest, org.example.MergeTablesResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MergeTables"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.MergeTablesRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.example.MergeTablesResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new RemoteDBMethodDescriptorSupplier("MergeTables"))
                          .build();
        }
      }
    }
    return getMergeTablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteDBStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteDBStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RemoteDBStub>() {
              @java.lang.Override
              public RemoteDBStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RemoteDBStub(channel, callOptions);
              }
            };
    return RemoteDBStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteDBBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteDBBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RemoteDBBlockingStub>() {
              @java.lang.Override
              public RemoteDBBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RemoteDBBlockingStub(channel, callOptions);
              }
            };
    return RemoteDBBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteDBFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RemoteDBFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<RemoteDBFutureStub>() {
              @java.lang.Override
              public RemoteDBFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new RemoteDBFutureStub(channel, callOptions);
              }
            };
    return RemoteDBFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RemoteDBImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRows(org.example.GetRowsRequest request,
                        io.grpc.stub.StreamObserver<org.example.GetRowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRowsMethod(), responseObserver);
    }

    /**
     */
    public void getColumns(org.example.GetColumnsRequest request,
                           io.grpc.stub.StreamObserver<org.example.GetColumnsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetColumnsMethod(), responseObserver);
    }

    /**
     */
    public void getTablesData(org.example.GetTablesDataRequest request,
                              io.grpc.stub.StreamObserver<org.example.GetTablesDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTablesDataMethod(), responseObserver);
    }

    /**
     */
    public void createTable(org.example.CreateTableRequest request,
                            io.grpc.stub.StreamObserver<org.example.CreateTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     */
    public void addRow(org.example.AddRowRequest request,
                       io.grpc.stub.StreamObserver<org.example.AddRowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRowMethod(), responseObserver);
    }

    /**
     */
    public void addColumn(org.example.AddColumnRequest request,
                          io.grpc.stub.StreamObserver<org.example.AddColumnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddColumnMethod(), responseObserver);
    }

    /**
     */
    public void deleteTable(org.example.DeleteTableRequest request,
                            io.grpc.stub.StreamObserver<org.example.DeleteTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteColumn(org.example.DeleteColumnRequest request,
                             io.grpc.stub.StreamObserver<org.example.DeleteColumnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteColumnMethod(), responseObserver);
    }

    /**
     */
    public void deleteRow(org.example.DeleteRowRequest request,
                          io.grpc.stub.StreamObserver<org.example.DeleteRowResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRowMethod(), responseObserver);
    }

    /**
     */
    public void editCell(org.example.EditCellRequest request,
                         io.grpc.stub.StreamObserver<org.example.EditCellResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditCellMethod(), responseObserver);
    }

    /**
     */
    public void createTestTable(org.example.CreateTestTableRequest request,
                                io.grpc.stub.StreamObserver<org.example.CreateTestTableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTestTableMethod(), responseObserver);
    }

    /**
     */
    public void mergeTables(org.example.MergeTablesRequest request,
                            io.grpc.stub.StreamObserver<org.example.MergeTablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMergeTablesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getGetRowsMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.GetRowsRequest,
                                      org.example.GetRowsResponse>(
                                      this, METHODID_GET_ROWS)))
              .addMethod(
                      getGetColumnsMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.GetColumnsRequest,
                                      org.example.GetColumnsResponse>(
                                      this, METHODID_GET_COLUMNS)))
              .addMethod(
                      getGetTablesDataMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.GetTablesDataRequest,
                                      org.example.GetTablesDataResponse>(
                                      this, METHODID_GET_TABLES_DATA)))
              .addMethod(
                      getCreateTableMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.CreateTableRequest,
                                      org.example.CreateTableResponse>(
                                      this, METHODID_CREATE_TABLE)))
              .addMethod(
                      getAddRowMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.AddRowRequest,
                                      org.example.AddRowResponse>(
                                      this, METHODID_ADD_ROW)))
              .addMethod(
                      getAddColumnMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.AddColumnRequest,
                                      org.example.AddColumnResponse>(
                                      this, METHODID_ADD_COLUMN)))
              .addMethod(
                      getDeleteTableMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.DeleteTableRequest,
                                      org.example.DeleteTableResponse>(
                                      this, METHODID_DELETE_TABLE)))
              .addMethod(
                      getDeleteColumnMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.DeleteColumnRequest,
                                      org.example.DeleteColumnResponse>(
                                      this, METHODID_DELETE_COLUMN)))
              .addMethod(
                      getDeleteRowMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.DeleteRowRequest,
                                      org.example.DeleteRowResponse>(
                                      this, METHODID_DELETE_ROW)))
              .addMethod(
                      getEditCellMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.EditCellRequest,
                                      org.example.EditCellResponse>(
                                      this, METHODID_EDIT_CELL)))
              .addMethod(
                      getCreateTestTableMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.CreateTestTableRequest,
                                      org.example.CreateTestTableResponse>(
                                      this, METHODID_CREATE_TEST_TABLE)))
              .addMethod(
                      getMergeTablesMethod(),
                      io.grpc.stub.ServerCalls.asyncUnaryCall(
                              new MethodHandlers<
                                      org.example.MergeTablesRequest,
                                      org.example.MergeTablesResponse>(
                                      this, METHODID_MERGE_TABLES)))
              .build();
    }
  }

  /**
   */
  public static final class RemoteDBStub extends io.grpc.stub.AbstractAsyncStub<RemoteDBStub> {
    private RemoteDBStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteDBStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteDBStub(channel, callOptions);
    }

    /**
     */
    public void getRows(org.example.GetRowsRequest request,
                        io.grpc.stub.StreamObserver<org.example.GetRowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetRowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getColumns(org.example.GetColumnsRequest request,
                           io.grpc.stub.StreamObserver<org.example.GetColumnsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetColumnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTablesData(org.example.GetTablesDataRequest request,
                              io.grpc.stub.StreamObserver<org.example.GetTablesDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getGetTablesDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTable(org.example.CreateTableRequest request,
                            io.grpc.stub.StreamObserver<org.example.CreateTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRow(org.example.AddRowRequest request,
                       io.grpc.stub.StreamObserver<org.example.AddRowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getAddRowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addColumn(org.example.AddColumnRequest request,
                          io.grpc.stub.StreamObserver<org.example.AddColumnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getAddColumnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTable(org.example.DeleteTableRequest request,
                            io.grpc.stub.StreamObserver<org.example.DeleteTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteColumn(org.example.DeleteColumnRequest request,
                             io.grpc.stub.StreamObserver<org.example.DeleteColumnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getDeleteColumnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRow(org.example.DeleteRowRequest request,
                          io.grpc.stub.StreamObserver<org.example.DeleteRowResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getDeleteRowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editCell(org.example.EditCellRequest request,
                         io.grpc.stub.StreamObserver<org.example.EditCellResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getEditCellMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTestTable(org.example.CreateTestTableRequest request,
                                io.grpc.stub.StreamObserver<org.example.CreateTestTableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getCreateTestTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void mergeTables(org.example.MergeTablesRequest request,
                            io.grpc.stub.StreamObserver<org.example.MergeTablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
              getChannel().newCall(getMergeTablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RemoteDBBlockingStub extends io.grpc.stub.AbstractBlockingStub<RemoteDBBlockingStub> {
    private RemoteDBBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteDBBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteDBBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.GetRowsResponse getRows(org.example.GetRowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetRowsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.GetColumnsResponse getColumns(org.example.GetColumnsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetColumnsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.GetTablesDataResponse getTablesData(org.example.GetTablesDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getGetTablesDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.CreateTableResponse createTable(org.example.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.AddRowResponse addRow(org.example.AddRowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getAddRowMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.AddColumnResponse addColumn(org.example.AddColumnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getAddColumnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.DeleteTableResponse deleteTable(org.example.DeleteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getDeleteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.DeleteColumnResponse deleteColumn(org.example.DeleteColumnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getDeleteColumnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.DeleteRowResponse deleteRow(org.example.DeleteRowRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getDeleteRowMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.EditCellResponse editCell(org.example.EditCellRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getEditCellMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.CreateTestTableResponse createTestTable(org.example.CreateTestTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getCreateTestTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.MergeTablesResponse mergeTables(org.example.MergeTablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
              getChannel(), getMergeTablesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RemoteDBFutureStub extends io.grpc.stub.AbstractFutureStub<RemoteDBFutureStub> {
    private RemoteDBFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteDBFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RemoteDBFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.GetRowsResponse> getRows(
            org.example.GetRowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetRowsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.GetColumnsResponse> getColumns(
            org.example.GetColumnsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetColumnsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.GetTablesDataResponse> getTablesData(
            org.example.GetTablesDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getGetTablesDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.CreateTableResponse> createTable(
            org.example.CreateTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.AddRowResponse> addRow(
            org.example.AddRowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getAddRowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.AddColumnResponse> addColumn(
            org.example.AddColumnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getAddColumnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.DeleteTableResponse> deleteTable(
            org.example.DeleteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.DeleteColumnResponse> deleteColumn(
            org.example.DeleteColumnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getDeleteColumnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.DeleteRowResponse> deleteRow(
            org.example.DeleteRowRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getDeleteRowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.EditCellResponse> editCell(
            org.example.EditCellRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getEditCellMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.CreateTestTableResponse> createTestTable(
            org.example.CreateTestTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getCreateTestTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.MergeTablesResponse> mergeTables(
            org.example.MergeTablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
              getChannel().newCall(getMergeTablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROWS = 0;
  private static final int METHODID_GET_COLUMNS = 1;
  private static final int METHODID_GET_TABLES_DATA = 2;
  private static final int METHODID_CREATE_TABLE = 3;
  private static final int METHODID_ADD_ROW = 4;
  private static final int METHODID_ADD_COLUMN = 5;
  private static final int METHODID_DELETE_TABLE = 6;
  private static final int METHODID_DELETE_COLUMN = 7;
  private static final int METHODID_DELETE_ROW = 8;
  private static final int METHODID_EDIT_CELL = 9;
  private static final int METHODID_CREATE_TEST_TABLE = 10;
  private static final int METHODID_MERGE_TABLES = 11;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoteDBImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteDBImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROWS:
          serviceImpl.getRows((org.example.GetRowsRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.GetRowsResponse>) responseObserver);
          break;
        case METHODID_GET_COLUMNS:
          serviceImpl.getColumns((org.example.GetColumnsRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.GetColumnsResponse>) responseObserver);
          break;
        case METHODID_GET_TABLES_DATA:
          serviceImpl.getTablesData((org.example.GetTablesDataRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.GetTablesDataResponse>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((org.example.CreateTableRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.CreateTableResponse>) responseObserver);
          break;
        case METHODID_ADD_ROW:
          serviceImpl.addRow((org.example.AddRowRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.AddRowResponse>) responseObserver);
          break;
        case METHODID_ADD_COLUMN:
          serviceImpl.addColumn((org.example.AddColumnRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.AddColumnResponse>) responseObserver);
          break;
        case METHODID_DELETE_TABLE:
          serviceImpl.deleteTable((org.example.DeleteTableRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.DeleteTableResponse>) responseObserver);
          break;
        case METHODID_DELETE_COLUMN:
          serviceImpl.deleteColumn((org.example.DeleteColumnRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.DeleteColumnResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROW:
          serviceImpl.deleteRow((org.example.DeleteRowRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.DeleteRowResponse>) responseObserver);
          break;
        case METHODID_EDIT_CELL:
          serviceImpl.editCell((org.example.EditCellRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.EditCellResponse>) responseObserver);
          break;
        case METHODID_CREATE_TEST_TABLE:
          serviceImpl.createTestTable((org.example.CreateTestTableRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.CreateTestTableResponse>) responseObserver);
          break;
        case METHODID_MERGE_TABLES:
          serviceImpl.mergeTables((org.example.MergeTablesRequest) request,
                  (io.grpc.stub.StreamObserver<org.example.MergeTablesResponse>) responseObserver);
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

  private static abstract class RemoteDBBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteDBBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.RemoteDBProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteDB");
    }
  }

  private static final class RemoteDBFileDescriptorSupplier
          extends RemoteDBBaseDescriptorSupplier {
    RemoteDBFileDescriptorSupplier() {}
  }

  private static final class RemoteDBMethodDescriptorSupplier
          extends RemoteDBBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteDBMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteDBGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new RemoteDBFileDescriptorSupplier())
                  .addMethod(getGetRowsMethod())
                  .addMethod(getGetColumnsMethod())
                  .addMethod(getGetTablesDataMethod())
                  .addMethod(getCreateTableMethod())
                  .addMethod(getAddRowMethod())
                  .addMethod(getAddColumnMethod())
                  .addMethod(getDeleteTableMethod())
                  .addMethod(getDeleteColumnMethod())
                  .addMethod(getDeleteRowMethod())
                  .addMethod(getEditCellMethod())
                  .addMethod(getCreateTestTableMethod())
                  .addMethod(getMergeTablesMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
