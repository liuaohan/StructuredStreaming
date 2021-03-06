// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package rpc;

/**
 * <pre>
 * job的执行信息
 * </pre>
 *
 * Protobuf type {@code rpc.JobReply}
 */
public final class JobReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rpc.JobReply)
    JobReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobReply.newBuilder() to construct.
  private JobReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobReply() {
    compileInfo_ = "";
    compileErrInfo_ = "";
    runInfo_ = "";
    runErrInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            compileInfo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            compileErrInfo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            runInfo_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            runErrInfo_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rpc.SparkGProto.internal_static_rpc_JobReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rpc.SparkGProto.internal_static_rpc_JobReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rpc.JobReply.class, rpc.JobReply.Builder.class);
  }

  public static final int COMPILE_INFO_FIELD_NUMBER = 1;
  private volatile java.lang.Object compileInfo_;
  /**
   * <code>string compile_info = 1;</code>
   * @return The compileInfo.
   */
  @java.lang.Override
  public java.lang.String getCompileInfo() {
    java.lang.Object ref = compileInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compileInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string compile_info = 1;</code>
   * @return The bytes for compileInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompileInfoBytes() {
    java.lang.Object ref = compileInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      compileInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPILE_ERR_INFO_FIELD_NUMBER = 2;
  private volatile java.lang.Object compileErrInfo_;
  /**
   * <code>string compile_err_info = 2;</code>
   * @return The compileErrInfo.
   */
  @java.lang.Override
  public java.lang.String getCompileErrInfo() {
    java.lang.Object ref = compileErrInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      compileErrInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string compile_err_info = 2;</code>
   * @return The bytes for compileErrInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCompileErrInfoBytes() {
    java.lang.Object ref = compileErrInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      compileErrInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_INFO_FIELD_NUMBER = 3;
  private volatile java.lang.Object runInfo_;
  /**
   * <code>string run_info = 3;</code>
   * @return The runInfo.
   */
  @java.lang.Override
  public java.lang.String getRunInfo() {
    java.lang.Object ref = runInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string run_info = 3;</code>
   * @return The bytes for runInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRunInfoBytes() {
    java.lang.Object ref = runInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RUN_ERR_INFO_FIELD_NUMBER = 4;
  private volatile java.lang.Object runErrInfo_;
  /**
   * <code>string run_err_info = 4;</code>
   * @return The runErrInfo.
   */
  @java.lang.Override
  public java.lang.String getRunErrInfo() {
    java.lang.Object ref = runErrInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runErrInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string run_err_info = 4;</code>
   * @return The bytes for runErrInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRunErrInfoBytes() {
    java.lang.Object ref = runErrInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runErrInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getCompileInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, compileInfo_);
    }
    if (!getCompileErrInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, compileErrInfo_);
    }
    if (!getRunInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, runInfo_);
    }
    if (!getRunErrInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, runErrInfo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCompileInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, compileInfo_);
    }
    if (!getCompileErrInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, compileErrInfo_);
    }
    if (!getRunInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, runInfo_);
    }
    if (!getRunErrInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, runErrInfo_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rpc.JobReply)) {
      return super.equals(obj);
    }
    rpc.JobReply other = (rpc.JobReply) obj;

    if (!getCompileInfo()
        .equals(other.getCompileInfo())) return false;
    if (!getCompileErrInfo()
        .equals(other.getCompileErrInfo())) return false;
    if (!getRunInfo()
        .equals(other.getRunInfo())) return false;
    if (!getRunErrInfo()
        .equals(other.getRunErrInfo())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMPILE_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getCompileInfo().hashCode();
    hash = (37 * hash) + COMPILE_ERR_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getCompileErrInfo().hashCode();
    hash = (37 * hash) + RUN_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getRunInfo().hashCode();
    hash = (37 * hash) + RUN_ERR_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getRunErrInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rpc.JobReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rpc.JobReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rpc.JobReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rpc.JobReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rpc.JobReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rpc.JobReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rpc.JobReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rpc.JobReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rpc.JobReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rpc.JobReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rpc.JobReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rpc.JobReply parseFrom(
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
  public static Builder newBuilder(rpc.JobReply prototype) {
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
   * <pre>
   * job的执行信息
   * </pre>
   *
   * Protobuf type {@code rpc.JobReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rpc.JobReply)
      rpc.JobReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rpc.SparkGProto.internal_static_rpc_JobReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rpc.SparkGProto.internal_static_rpc_JobReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rpc.JobReply.class, rpc.JobReply.Builder.class);
    }

    // Construct using rpc.JobReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      compileInfo_ = "";

      compileErrInfo_ = "";

      runInfo_ = "";

      runErrInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rpc.SparkGProto.internal_static_rpc_JobReply_descriptor;
    }

    @java.lang.Override
    public rpc.JobReply getDefaultInstanceForType() {
      return rpc.JobReply.getDefaultInstance();
    }

    @java.lang.Override
    public rpc.JobReply build() {
      rpc.JobReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rpc.JobReply buildPartial() {
      rpc.JobReply result = new rpc.JobReply(this);
      result.compileInfo_ = compileInfo_;
      result.compileErrInfo_ = compileErrInfo_;
      result.runInfo_ = runInfo_;
      result.runErrInfo_ = runErrInfo_;
      onBuilt();
      return result;
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
      if (other instanceof rpc.JobReply) {
        return mergeFrom((rpc.JobReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rpc.JobReply other) {
      if (other == rpc.JobReply.getDefaultInstance()) return this;
      if (!other.getCompileInfo().isEmpty()) {
        compileInfo_ = other.compileInfo_;
        onChanged();
      }
      if (!other.getCompileErrInfo().isEmpty()) {
        compileErrInfo_ = other.compileErrInfo_;
        onChanged();
      }
      if (!other.getRunInfo().isEmpty()) {
        runInfo_ = other.runInfo_;
        onChanged();
      }
      if (!other.getRunErrInfo().isEmpty()) {
        runErrInfo_ = other.runErrInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      rpc.JobReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (rpc.JobReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object compileInfo_ = "";
    /**
     * <code>string compile_info = 1;</code>
     * @return The compileInfo.
     */
    public java.lang.String getCompileInfo() {
      java.lang.Object ref = compileInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compileInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string compile_info = 1;</code>
     * @return The bytes for compileInfo.
     */
    public com.google.protobuf.ByteString
        getCompileInfoBytes() {
      java.lang.Object ref = compileInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        compileInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string compile_info = 1;</code>
     * @param value The compileInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCompileInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      compileInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string compile_info = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompileInfo() {
      
      compileInfo_ = getDefaultInstance().getCompileInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string compile_info = 1;</code>
     * @param value The bytes for compileInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCompileInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      compileInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object compileErrInfo_ = "";
    /**
     * <code>string compile_err_info = 2;</code>
     * @return The compileErrInfo.
     */
    public java.lang.String getCompileErrInfo() {
      java.lang.Object ref = compileErrInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        compileErrInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string compile_err_info = 2;</code>
     * @return The bytes for compileErrInfo.
     */
    public com.google.protobuf.ByteString
        getCompileErrInfoBytes() {
      java.lang.Object ref = compileErrInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        compileErrInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string compile_err_info = 2;</code>
     * @param value The compileErrInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCompileErrInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      compileErrInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string compile_err_info = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompileErrInfo() {
      
      compileErrInfo_ = getDefaultInstance().getCompileErrInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string compile_err_info = 2;</code>
     * @param value The bytes for compileErrInfo to set.
     * @return This builder for chaining.
     */
    public Builder setCompileErrInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      compileErrInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object runInfo_ = "";
    /**
     * <code>string run_info = 3;</code>
     * @return The runInfo.
     */
    public java.lang.String getRunInfo() {
      java.lang.Object ref = runInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string run_info = 3;</code>
     * @return The bytes for runInfo.
     */
    public com.google.protobuf.ByteString
        getRunInfoBytes() {
      java.lang.Object ref = runInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string run_info = 3;</code>
     * @param value The runInfo to set.
     * @return This builder for chaining.
     */
    public Builder setRunInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string run_info = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRunInfo() {
      
      runInfo_ = getDefaultInstance().getRunInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string run_info = 3;</code>
     * @param value The bytes for runInfo to set.
     * @return This builder for chaining.
     */
    public Builder setRunInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runInfo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object runErrInfo_ = "";
    /**
     * <code>string run_err_info = 4;</code>
     * @return The runErrInfo.
     */
    public java.lang.String getRunErrInfo() {
      java.lang.Object ref = runErrInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runErrInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string run_err_info = 4;</code>
     * @return The bytes for runErrInfo.
     */
    public com.google.protobuf.ByteString
        getRunErrInfoBytes() {
      java.lang.Object ref = runErrInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runErrInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string run_err_info = 4;</code>
     * @param value The runErrInfo to set.
     * @return This builder for chaining.
     */
    public Builder setRunErrInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runErrInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string run_err_info = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRunErrInfo() {
      
      runErrInfo_ = getDefaultInstance().getRunErrInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string run_err_info = 4;</code>
     * @param value The bytes for runErrInfo to set.
     * @return This builder for chaining.
     */
    public Builder setRunErrInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runErrInfo_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:rpc.JobReply)
  }

  // @@protoc_insertion_point(class_scope:rpc.JobReply)
  private static final rpc.JobReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rpc.JobReply();
  }

  public static rpc.JobReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobReply>
      PARSER = new com.google.protobuf.AbstractParser<JobReply>() {
    @java.lang.Override
    public JobReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rpc.JobReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

