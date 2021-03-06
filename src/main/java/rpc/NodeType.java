// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package rpc;

/**
 * <pre>
 * 算子类型
 * </pre>
 *
 * Protobuf enum {@code rpc.NodeType}
 */
public enum NodeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 从kafka读取数据
   * </pre>
   *
   * <code>Reader = 0;</code>
   */
  Reader(0),
  /**
   * <pre>
   * 按摄像头分组
   * </pre>
   *
   * <code>GroupBy = 1;</code>
   */
  GroupBy(1),
  /**
   * <pre>
   * 产生帧图像
   * </pre>
   *
   * <code>MakeFrame = 2;</code>
   */
  MakeFrame(2),
  /**
   * <pre>
   * yolo目标识别
   * </pre>
   *
   * <code>Detection = 3;</code>
   */
  Detection(3),
  /**
   * <pre>
   *  车速计算
   * </pre>
   *
   * <code>Speed = 4;</code>
   */
  Speed(4),
  /**
   * <pre>
   *  车牌检测
   * </pre>
   *
   * <code>LPR = 5;</code>
   */
  LPR(5),
  /**
   * <pre>
   * 排序
   * </pre>
   *
   * <code>Sort = 6;</code>
   */
  Sort(6),
  /**
   * <pre>
   * 图片剪裁
   * </pre>
   *
   * <code>Crop = 7;</code>
   */
  Crop(7),
  /**
   * <pre>
   * 用于逻辑判断，类似switch case
   * </pre>
   *
   * <code>Fork = 8;</code>
   */
  Fork(8),
  /**
   * <pre>
   * </pre>
   *
   * <code>Segmentation = 9;</code>
   */
  Segmentation(9),
  /**
   * <pre>
   * </pre>
   *
   * <code>Classification = 10;</code>
   */
  Classification(10),
  /**
   * <pre>
   *   结果写入kafka
   * </pre>
   *
   * <code>Writer = 11;</code>
   */
  Writer(11),
  /**
   * <code>Tracker = 12;</code>
   */
  Tracker(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 从kafka读取数据
   * </pre>
   *
   * <code>Reader = 0;</code>
   */
  public static final int Reader_VALUE = 0;
  /**
   * <pre>
   * 按摄像头分组
   * </pre>
   *
   * <code>GroupBy = 1;</code>
   */
  public static final int GroupBy_VALUE = 1;
  /**
   * <pre>
   * 产生帧图像
   * </pre>
   *
   * <code>MakeFrame = 2;</code>
   */
  public static final int MakeFrame_VALUE = 2;
  /**
   * <pre>
   * yolo目标识别
   * </pre>
   *
   * <code>Detection = 3;</code>
   */
  public static final int Detection_VALUE = 3;
  /**
   * <pre>
   *  车速计算
   * </pre>
   *
   * <code>Speed = 4;</code>
   */
  public static final int Speed_VALUE = 4;
  /**
   * <pre>
   *  车牌检测
   * </pre>
   *
   * <code>LPR = 5;</code>
   */
  public static final int LPR_VALUE = 5;
  /**
   * <pre>
   * 排序
   * </pre>
   *
   * <code>Sort = 6;</code>
   */
  public static final int Sort_VALUE = 6;
  /**
   * <pre>
   * 图片剪裁
   * </pre>
   *
   * <code>Crop = 7;</code>
   */
  public static final int Crop_VALUE = 7;
  /**
   * <pre>
   * 用于逻辑判断，类似switch case
   * </pre>
   *
   * <code>Fork = 8;</code>
   */
  public static final int Fork_VALUE = 8;
  /**
   * <pre>
   * </pre>
   *
   * <code>Segmentation = 9;</code>
   */
  public static final int Segmentation_VALUE = 9;
  /**
   * <pre>
   * </pre>
   *
   * <code>Classification = 10;</code>
   */
  public static final int Classification_VALUE = 10;
  /**
   * <pre>
   *   结果写入kafka
   * </pre>
   *
   * <code>Writer = 11;</code>
   */
  public static final int Writer_VALUE = 11;
  /**
   * <code>Tracker = 12;</code>
   */
  public static final int Tracker_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NodeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NodeType forNumber(int value) {
    switch (value) {
      case 0: return Reader;
      case 1: return GroupBy;
      case 2: return MakeFrame;
      case 3: return Detection;
      case 4: return Speed;
      case 5: return LPR;
      case 6: return Sort;
      case 7: return Crop;
      case 8: return Fork;
      case 9: return Segmentation;
      case 10: return Classification;
      case 11: return Writer;
      case 12: return Tracker;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NodeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      NodeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<NodeType>() {
          public NodeType findValueByNumber(int number) {
            return NodeType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return rpc.SparkGProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final NodeType[] VALUES = values();

  public static NodeType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NodeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rpc.NodeType)
}

