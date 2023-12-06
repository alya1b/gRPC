package org.example

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import org.example.RemoteDBGrpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for org.example.RemoteDB.
 */
object RemoteDBGrpcKt {
  const val SERVICE_NAME: String = RemoteDBGrpc.SERVICE_NAME

  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = RemoteDBGrpc.getServiceDescriptor()

  val getRowsMethod: MethodDescriptor<GetRowsRequest, GetRowsResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getGetRowsMethod()

  val getColumnsMethod: MethodDescriptor<GetColumnsRequest, GetColumnsResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getGetColumnsMethod()

  val getTablesDataMethod: MethodDescriptor<GetTablesDataRequest, GetTablesDataResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getGetTablesDataMethod()

  val createTableMethod: MethodDescriptor<CreateTableRequest, CreateTableResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getCreateTableMethod()

  val addRowMethod: MethodDescriptor<AddRowRequest, AddRowResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getAddRowMethod()

  val addColumnMethod: MethodDescriptor<AddColumnRequest, AddColumnResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getAddColumnMethod()

  val deleteTableMethod: MethodDescriptor<DeleteTableRequest, DeleteTableResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getDeleteTableMethod()

  val deleteColumnMethod: MethodDescriptor<DeleteColumnRequest, DeleteColumnResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getDeleteColumnMethod()

  val deleteRowMethod: MethodDescriptor<DeleteRowRequest, DeleteRowResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getDeleteRowMethod()

  val editCellMethod: MethodDescriptor<EditCellRequest, EditCellResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getEditCellMethod()

  val createTestTableMethod: MethodDescriptor<CreateTestTableRequest, CreateTestTableResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getCreateTestTableMethod()

  val mergeTablesMethod: MethodDescriptor<MergeTablesRequest, MergeTablesResponse>
    @JvmStatic
    get() = RemoteDBGrpc.getMergeTablesMethod()

  /**
   * A stub for issuing RPCs to a(n) org.example.RemoteDB service as suspending coroutines.
   */
  @StubFor(RemoteDBGrpc::class)
  class RemoteDBCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<RemoteDBCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RemoteDBCoroutineStub =
        RemoteDBCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getRows(request: GetRowsRequest, headers: Metadata = Metadata()): GetRowsResponse =
        unaryRpc(
      channel,
      RemoteDBGrpc.getGetRowsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getColumns(request: GetColumnsRequest, headers: Metadata = Metadata()):
        GetColumnsResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getGetColumnsMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun getTablesData(request: GetTablesDataRequest, headers: Metadata = Metadata()):
        GetTablesDataResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getGetTablesDataMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun createTable(request: CreateTableRequest, headers: Metadata = Metadata()):
        CreateTableResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getCreateTableMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun addRow(request: AddRowRequest, headers: Metadata = Metadata()): AddRowResponse =
        unaryRpc(
      channel,
      RemoteDBGrpc.getAddRowMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun addColumn(request: AddColumnRequest, headers: Metadata = Metadata()):
        AddColumnResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getAddColumnMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun deleteTable(request: DeleteTableRequest, headers: Metadata = Metadata()):
        DeleteTableResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getDeleteTableMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun deleteColumn(request: DeleteColumnRequest, headers: Metadata = Metadata()):
        DeleteColumnResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getDeleteColumnMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun deleteRow(request: DeleteRowRequest, headers: Metadata = Metadata()):
        DeleteRowResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getDeleteRowMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun editCell(request: EditCellRequest, headers: Metadata = Metadata()): EditCellResponse
        = unaryRpc(
      channel,
      RemoteDBGrpc.getEditCellMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun createTestTable(request: CreateTestTableRequest, headers: Metadata = Metadata()):
        CreateTestTableResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getCreateTestTableMethod(),
      request,
      callOptions,
      headers
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    suspend fun mergeTables(request: MergeTablesRequest, headers: Metadata = Metadata()):
        MergeTablesResponse = unaryRpc(
      channel,
      RemoteDBGrpc.getMergeTablesMethod(),
      request,
      callOptions,
      headers
    )}

  /**
   * Skeletal implementation of the org.example.RemoteDB service based on Kotlin coroutines.
   */
  abstract class RemoteDBCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for org.example.RemoteDB.GetRows.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getRows(request: GetRowsRequest): GetRowsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.GetRows is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.GetColumns.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getColumns(request: GetColumnsRequest): GetColumnsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.GetColumns is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.GetTablesData.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun getTablesData(request: GetTablesDataRequest): GetTablesDataResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.GetTablesData is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.CreateTable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createTable(request: CreateTableRequest): CreateTableResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.CreateTable is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.AddRow.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addRow(request: AddRowRequest): AddRowResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.AddRow is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.AddColumn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun addColumn(request: AddColumnRequest): AddColumnResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.AddColumn is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.DeleteTable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteTable(request: DeleteTableRequest): DeleteTableResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.DeleteTable is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.DeleteColumn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteColumn(request: DeleteColumnRequest): DeleteColumnResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.DeleteColumn is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.DeleteRow.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteRow(request: DeleteRowRequest): DeleteRowResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.DeleteRow is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.EditCell.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun editCell(request: EditCellRequest): EditCellResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.EditCell is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.CreateTestTable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createTestTable(request: CreateTestTableRequest): CreateTestTableResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.CreateTestTable is unimplemented"))

    /**
     * Returns the response to an RPC for org.example.RemoteDB.MergeTables.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun mergeTables(request: MergeTablesRequest): MergeTablesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method org.example.RemoteDB.MergeTables is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getGetRowsMethod(),
      implementation = ::getRows
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getGetColumnsMethod(),
      implementation = ::getColumns
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getGetTablesDataMethod(),
      implementation = ::getTablesData
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getCreateTableMethod(),
      implementation = ::createTable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getAddRowMethod(),
      implementation = ::addRow
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getAddColumnMethod(),
      implementation = ::addColumn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getDeleteTableMethod(),
      implementation = ::deleteTable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getDeleteColumnMethod(),
      implementation = ::deleteColumn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getDeleteRowMethod(),
      implementation = ::deleteRow
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getEditCellMethod(),
      implementation = ::editCell
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getCreateTestTableMethod(),
      implementation = ::createTestTable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RemoteDBGrpc.getMergeTablesMethod(),
      implementation = ::mergeTables
    )).build()
  }
}
