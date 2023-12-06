// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: generate.proto

package org.example;

/**
 * Protobuf type {@code org.example.GetRowsResponse}
 */
public final class GetRowsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.GetRowsResponse)
    GetRowsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRowsResponse.newBuilder() to construct.
  private GetRowsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRowsResponse() {
    rows_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRowsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.RemoteDBProto.internal_static_org_example_GetRowsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.RemoteDBProto.internal_static_org_example_GetRowsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.GetRowsResponse.class, org.example.GetRowsResponse.Builder.class);
  }

  public static final int ROWS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.Row> rows_;
  /**
   * <code>repeated .org.example.Row rows = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.Row> getRowsList() {
    return rows_;
  }
  /**
   * <code>repeated .org.example.Row rows = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.RowOrBuilder> 
      getRowsOrBuilderList() {
    return rows_;
  }
  /**
   * <code>repeated .org.example.Row rows = 1;</code>
   */
  @java.lang.Override
  public int getRowsCount() {
    return rows_.size();
  }
  /**
   * <code>repeated .org.example.Row rows = 1;</code>
   */
  @java.lang.Override
  public org.example.Row getRows(int index) {
    return rows_.get(index);
  }
  /**
   * <code>repeated .org.example.Row rows = 1;</code>
   */
  @java.lang.Override
  public org.example.RowOrBuilder getRowsOrBuilder(
      int index) {
    return rows_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rows_.size(); i++) {
      output.writeMessage(1, rows_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rows_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rows_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.GetRowsResponse)) {
      return super.equals(obj);
    }
    org.example.GetRowsResponse other = (org.example.GetRowsResponse) obj;

    if (!getRowsList()
        .equals(other.getRowsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRowsCount() > 0) {
      hash = (37 * hash) + ROWS_FIELD_NUMBER;
      hash = (53 * hash) + getRowsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.GetRowsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetRowsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetRowsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetRowsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetRowsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.GetRowsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.GetRowsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.GetRowsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.GetRowsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.GetRowsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.GetRowsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.GetRowsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.GetRowsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.GetRowsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.GetRowsResponse)
      org.example.GetRowsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.RemoteDBProto.internal_static_org_example_GetRowsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.RemoteDBProto.internal_static_org_example_GetRowsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.GetRowsResponse.class, org.example.GetRowsResponse.Builder.class);
    }

    // Construct using org.example.GetRowsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
      } else {
        rows_ = null;
        rowsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.RemoteDBProto.internal_static_org_example_GetRowsResponse_descriptor;
    }

    @java.lang.Override
    public org.example.GetRowsResponse getDefaultInstanceForType() {
      return org.example.GetRowsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.GetRowsResponse build() {
      org.example.GetRowsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.GetRowsResponse buildPartial() {
      org.example.GetRowsResponse result = new org.example.GetRowsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.GetRowsResponse result) {
      if (rowsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rows_ = java.util.Collections.unmodifiableList(rows_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rows_ = rows_;
      } else {
        result.rows_ = rowsBuilder_.build();
      }
    }

    private void buildPartial0(org.example.GetRowsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.GetRowsResponse) {
        return mergeFrom((org.example.GetRowsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.GetRowsResponse other) {
      if (other == org.example.GetRowsResponse.getDefaultInstance()) return this;
      if (rowsBuilder_ == null) {
        if (!other.rows_.isEmpty()) {
          if (rows_.isEmpty()) {
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRowsIsMutable();
            rows_.addAll(other.rows_);
          }
          onChanged();
        }
      } else {
        if (!other.rows_.isEmpty()) {
          if (rowsBuilder_.isEmpty()) {
            rowsBuilder_.dispose();
            rowsBuilder_ = null;
            rows_ = other.rows_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rowsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRowsFieldBuilder() : null;
          } else {
            rowsBuilder_.addAllMessages(other.rows_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.example.Row m =
                  input.readMessage(
                      org.example.Row.parser(),
                      extensionRegistry);
              if (rowsBuilder_ == null) {
                ensureRowsIsMutable();
                rows_.add(m);
              } else {
                rowsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.example.Row> rows_ =
      java.util.Collections.emptyList();
    private void ensureRowsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rows_ = new java.util.ArrayList<org.example.Row>(rows_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.Row, org.example.Row.Builder, org.example.RowOrBuilder> rowsBuilder_;

    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public java.util.List<org.example.Row> getRowsList() {
      if (rowsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rows_);
      } else {
        return rowsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public int getRowsCount() {
      if (rowsBuilder_ == null) {
        return rows_.size();
      } else {
        return rowsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public org.example.Row getRows(int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);
      } else {
        return rowsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder setRows(
        int index, org.example.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.set(index, value);
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder setRows(
        int index, org.example.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.set(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder addRows(org.example.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder addRows(
        int index, org.example.Row value) {
      if (rowsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRowsIsMutable();
        rows_.add(index, value);
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder addRows(
        org.example.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder addRows(
        int index, org.example.Row.Builder builderForValue) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.add(index, builderForValue.build());
        onChanged();
      } else {
        rowsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder addAllRows(
        java.lang.Iterable<? extends org.example.Row> values) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rows_);
        onChanged();
      } else {
        rowsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder clearRows() {
      if (rowsBuilder_ == null) {
        rows_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rowsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public Builder removeRows(int index) {
      if (rowsBuilder_ == null) {
        ensureRowsIsMutable();
        rows_.remove(index);
        onChanged();
      } else {
        rowsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public org.example.Row.Builder getRowsBuilder(
        int index) {
      return getRowsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public org.example.RowOrBuilder getRowsOrBuilder(
        int index) {
      if (rowsBuilder_ == null) {
        return rows_.get(index);  } else {
        return rowsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public java.util.List<? extends org.example.RowOrBuilder> 
         getRowsOrBuilderList() {
      if (rowsBuilder_ != null) {
        return rowsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rows_);
      }
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public org.example.Row.Builder addRowsBuilder() {
      return getRowsFieldBuilder().addBuilder(
          org.example.Row.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public org.example.Row.Builder addRowsBuilder(
        int index) {
      return getRowsFieldBuilder().addBuilder(
          index, org.example.Row.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Row rows = 1;</code>
     */
    public java.util.List<org.example.Row.Builder> 
         getRowsBuilderList() {
      return getRowsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.Row, org.example.Row.Builder, org.example.RowOrBuilder> 
        getRowsFieldBuilder() {
      if (rowsBuilder_ == null) {
        rowsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.Row, org.example.Row.Builder, org.example.RowOrBuilder>(
                rows_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rows_ = null;
      }
      return rowsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.example.GetRowsResponse)
  }

  // @@protoc_insertion_point(class_scope:org.example.GetRowsResponse)
  private static final org.example.GetRowsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.GetRowsResponse();
  }

  public static org.example.GetRowsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRowsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetRowsResponse>() {
    @java.lang.Override
    public GetRowsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetRowsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRowsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.GetRowsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

