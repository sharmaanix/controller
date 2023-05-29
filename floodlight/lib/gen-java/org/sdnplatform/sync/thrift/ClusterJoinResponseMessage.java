/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sdnplatform.sync.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-04-13")
public class ClusterJoinResponseMessage implements org.apache.thrift.TBase<ClusterJoinResponseMessage, ClusterJoinResponseMessage._Fields>, java.io.Serializable, Cloneable, Comparable<ClusterJoinResponseMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClusterJoinResponseMessage");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("newNodeId", org.apache.thrift.protocol.TType.I16, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_STORE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeStore", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClusterJoinResponseMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClusterJoinResponseMessageTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable AsyncMessageHeader header; // required
  public short newNodeId; // optional
  public @org.apache.thrift.annotation.Nullable java.util.List<KeyedValues> nodeStore; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    NEW_NODE_ID((short)2, "newNodeId"),
    NODE_STORE((short)3, "nodeStore");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADER
          return HEADER;
        case 2: // NEW_NODE_ID
          return NEW_NODE_ID;
        case 3: // NODE_STORE
          return NODE_STORE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NEWNODEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NEW_NODE_ID,_Fields.NODE_STORE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.NEW_NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("newNodeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.NODE_STORE, new org.apache.thrift.meta_data.FieldMetaData("nodeStore", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyedValues.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClusterJoinResponseMessage.class, metaDataMap);
  }

  public ClusterJoinResponseMessage() {
  }

  public ClusterJoinResponseMessage(
    AsyncMessageHeader header)
  {
    this();
    this.header = header;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClusterJoinResponseMessage(ClusterJoinResponseMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    this.newNodeId = other.newNodeId;
    if (other.isSetNodeStore()) {
      java.util.List<KeyedValues> __this__nodeStore = new java.util.ArrayList<KeyedValues>(other.nodeStore.size());
      for (KeyedValues other_element : other.nodeStore) {
        __this__nodeStore.add(new KeyedValues(other_element));
      }
      this.nodeStore = __this__nodeStore;
    }
  }

  public ClusterJoinResponseMessage deepCopy() {
    return new ClusterJoinResponseMessage(this);
  }

  @Override
  public void clear() {
    this.header = null;
    setNewNodeIdIsSet(false);
    this.newNodeId = 0;
    this.nodeStore = null;
  }

  @org.apache.thrift.annotation.Nullable
  public AsyncMessageHeader getHeader() {
    return this.header;
  }

  public ClusterJoinResponseMessage setHeader(@org.apache.thrift.annotation.Nullable AsyncMessageHeader header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public short getNewNodeId() {
    return this.newNodeId;
  }

  public ClusterJoinResponseMessage setNewNodeId(short newNodeId) {
    this.newNodeId = newNodeId;
    setNewNodeIdIsSet(true);
    return this;
  }

  public void unsetNewNodeId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NEWNODEID_ISSET_ID);
  }

  /** Returns true if field newNodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNewNodeId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NEWNODEID_ISSET_ID);
  }

  public void setNewNodeIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NEWNODEID_ISSET_ID, value);
  }

  public int getNodeStoreSize() {
    return (this.nodeStore == null) ? 0 : this.nodeStore.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<KeyedValues> getNodeStoreIterator() {
    return (this.nodeStore == null) ? null : this.nodeStore.iterator();
  }

  public void addToNodeStore(KeyedValues elem) {
    if (this.nodeStore == null) {
      this.nodeStore = new java.util.ArrayList<KeyedValues>();
    }
    this.nodeStore.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<KeyedValues> getNodeStore() {
    return this.nodeStore;
  }

  public ClusterJoinResponseMessage setNodeStore(@org.apache.thrift.annotation.Nullable java.util.List<KeyedValues> nodeStore) {
    this.nodeStore = nodeStore;
    return this;
  }

  public void unsetNodeStore() {
    this.nodeStore = null;
  }

  /** Returns true if field nodeStore is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeStore() {
    return this.nodeStore != null;
  }

  public void setNodeStoreIsSet(boolean value) {
    if (!value) {
      this.nodeStore = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;

    case NEW_NODE_ID:
      if (value == null) {
        unsetNewNodeId();
      } else {
        setNewNodeId((java.lang.Short)value);
      }
      break;

    case NODE_STORE:
      if (value == null) {
        unsetNodeStore();
      } else {
        setNodeStore((java.util.List<KeyedValues>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case NEW_NODE_ID:
      return getNewNodeId();

    case NODE_STORE:
      return getNodeStore();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case NEW_NODE_ID:
      return isSetNewNodeId();
    case NODE_STORE:
      return isSetNodeStore();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ClusterJoinResponseMessage)
      return this.equals((ClusterJoinResponseMessage)that);
    return false;
  }

  public boolean equals(ClusterJoinResponseMessage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_newNodeId = true && this.isSetNewNodeId();
    boolean that_present_newNodeId = true && that.isSetNewNodeId();
    if (this_present_newNodeId || that_present_newNodeId) {
      if (!(this_present_newNodeId && that_present_newNodeId))
        return false;
      if (this.newNodeId != that.newNodeId)
        return false;
    }

    boolean this_present_nodeStore = true && this.isSetNodeStore();
    boolean that_present_nodeStore = true && that.isSetNodeStore();
    if (this_present_nodeStore || that_present_nodeStore) {
      if (!(this_present_nodeStore && that_present_nodeStore))
        return false;
      if (!this.nodeStore.equals(that.nodeStore))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHeader()) ? 131071 : 524287);
    if (isSetHeader())
      hashCode = hashCode * 8191 + header.hashCode();

    hashCode = hashCode * 8191 + ((isSetNewNodeId()) ? 131071 : 524287);
    if (isSetNewNodeId())
      hashCode = hashCode * 8191 + newNodeId;

    hashCode = hashCode * 8191 + ((isSetNodeStore()) ? 131071 : 524287);
    if (isSetNodeStore())
      hashCode = hashCode * 8191 + nodeStore.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClusterJoinResponseMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetHeader(), other.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, other.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNewNodeId(), other.isSetNewNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newNodeId, other.newNodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetNodeStore(), other.isSetNodeStore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeStore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeStore, other.nodeStore);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClusterJoinResponseMessage(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (isSetNewNodeId()) {
      if (!first) sb.append(", ");
      sb.append("newNodeId:");
      sb.append(this.newNodeId);
      first = false;
    }
    if (isSetNodeStore()) {
      if (!first) sb.append(", ");
      sb.append("nodeStore:");
      if (this.nodeStore == null) {
        sb.append("null");
      } else {
        sb.append(this.nodeStore);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (header != null) {
      header.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClusterJoinResponseMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClusterJoinResponseMessageStandardScheme getScheme() {
      return new ClusterJoinResponseMessageStandardScheme();
    }
  }

  private static class ClusterJoinResponseMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClusterJoinResponseMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.newNodeId = iprot.readI16();
              struct.setNewNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE_STORE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.nodeStore = new java.util.ArrayList<KeyedValues>(_list64.size);
                @org.apache.thrift.annotation.Nullable KeyedValues _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new KeyedValues();
                  _elem65.read(iprot);
                  struct.nodeStore.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setNodeStoreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNewNodeId()) {
        oprot.writeFieldBegin(NEW_NODE_ID_FIELD_DESC);
        oprot.writeI16(struct.newNodeId);
        oprot.writeFieldEnd();
      }
      if (struct.nodeStore != null) {
        if (struct.isSetNodeStore()) {
          oprot.writeFieldBegin(NODE_STORE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.nodeStore.size()));
            for (KeyedValues _iter67 : struct.nodeStore)
            {
              _iter67.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClusterJoinResponseMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClusterJoinResponseMessageTupleScheme getScheme() {
      return new ClusterJoinResponseMessageTupleScheme();
    }
  }

  private static class ClusterJoinResponseMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClusterJoinResponseMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.header.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNewNodeId()) {
        optionals.set(0);
      }
      if (struct.isSetNodeStore()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNewNodeId()) {
        oprot.writeI16(struct.newNodeId);
      }
      if (struct.isSetNodeStore()) {
        {
          oprot.writeI32(struct.nodeStore.size());
          for (KeyedValues _iter68 : struct.nodeStore)
          {
            _iter68.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClusterJoinResponseMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.newNodeId = iprot.readI16();
        struct.setNewNodeIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list69 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.nodeStore = new java.util.ArrayList<KeyedValues>(_list69.size);
          @org.apache.thrift.annotation.Nullable KeyedValues _elem70;
          for (int _i71 = 0; _i71 < _list69.size; ++_i71)
          {
            _elem70 = new KeyedValues();
            _elem70.read(iprot);
            struct.nodeStore.add(_elem70);
          }
        }
        struct.setNodeStoreIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

