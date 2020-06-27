// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package rpc;

public interface DAGJobOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rpc.DAGJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated .rpc.Node all_node_list = 2;</code>
   */
  java.util.List<rpc.Node> 
      getAllNodeListList();
  /**
   * <code>repeated .rpc.Node all_node_list = 2;</code>
   */
  rpc.Node getAllNodeList(int index);
  /**
   * <code>repeated .rpc.Node all_node_list = 2;</code>
   */
  int getAllNodeListCount();
  /**
   * <code>repeated .rpc.Node all_node_list = 2;</code>
   */
  java.util.List<? extends rpc.NodeOrBuilder> 
      getAllNodeListOrBuilderList();
  /**
   * <code>repeated .rpc.Node all_node_list = 2;</code>
   */
  rpc.NodeOrBuilder getAllNodeListOrBuilder(
      int index);

  /**
   * <pre>
   * 执行模式："batch" or "stream"
   * </pre>
   *
   * <code>bool is_stream = 3;</code>
   * @return The isStream.
   */
  boolean getIsStream();

  /**
   * <pre>
   * stream模式的执行延时，如1s
   * </pre>
   *
   * <code>float latency = 4;</code>
   * @return The latency.
   */
  float getLatency();

  /**
   * <pre>
   * 执行平台："Spark Local", "Spark Cluster", "HRM Cluster"
   * </pre>
   *
   * <code>.rpc.PlatformType platform = 5;</code>
   * @return The enum numeric value on the wire for platform.
   */
  int getPlatformValue();
  /**
   * <pre>
   * 执行平台："Spark Local", "Spark Cluster", "HRM Cluster"
   * </pre>
   *
   * <code>.rpc.PlatformType platform = 5;</code>
   * @return The platform.
   */
  rpc.PlatformType getPlatform();

  /**
   * <pre>
   * 是否需要容错
   * </pre>
   *
   * <code>bool use_checkpoint = 6;</code>
   * @return The useCheckpoint.
   */
  boolean getUseCheckpoint();

  /**
   * <pre>
   * 是否启用测试模式
   * </pre>
   *
   * <code>bool is_test = 7;</code>
   * @return The isTest.
   */
  boolean getIsTest();
}