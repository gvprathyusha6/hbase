/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;


/**
 * Specify type of thrift server: thrift and thrift2
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2024-05-08")
public enum TThriftServerType implements org.apache.thrift.TEnum {
  ONE(1),
  TWO(2);

  private final int value;

  private TThriftServerType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TThriftServerType findByValue(int value) { 
    switch (value) {
      case 1:
        return ONE;
      case 2:
        return TWO;
      default:
        return null;
    }
  }
}
