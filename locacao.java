// ORM class for table 'locacao'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 12 04:30:18 PDT 2020
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class locacao extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("idlocacao", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idlocacao = (Integer)value;
      }
    });
    setters.put("idcliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idcliente = (Integer)value;
      }
    });
    setters.put("iddespachante", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        iddespachante = (Integer)value;
      }
    });
    setters.put("idveiculo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idveiculo = (Integer)value;
      }
    });
    setters.put("datalocacao", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datalocacao = (java.sql.Date)value;
      }
    });
    setters.put("dataentrega", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dataentrega = (java.sql.Date)value;
      }
    });
    setters.put("total", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        total = (java.math.BigDecimal)value;
      }
    });
  }
  public locacao() {
    init0();
  }
  private Integer idlocacao;
  public Integer get_idlocacao() {
    return idlocacao;
  }
  public void set_idlocacao(Integer idlocacao) {
    this.idlocacao = idlocacao;
  }
  public locacao with_idlocacao(Integer idlocacao) {
    this.idlocacao = idlocacao;
    return this;
  }
  private Integer idcliente;
  public Integer get_idcliente() {
    return idcliente;
  }
  public void set_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
  }
  public locacao with_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
    return this;
  }
  private Integer iddespachante;
  public Integer get_iddespachante() {
    return iddespachante;
  }
  public void set_iddespachante(Integer iddespachante) {
    this.iddespachante = iddespachante;
  }
  public locacao with_iddespachante(Integer iddespachante) {
    this.iddespachante = iddespachante;
    return this;
  }
  private Integer idveiculo;
  public Integer get_idveiculo() {
    return idveiculo;
  }
  public void set_idveiculo(Integer idveiculo) {
    this.idveiculo = idveiculo;
  }
  public locacao with_idveiculo(Integer idveiculo) {
    this.idveiculo = idveiculo;
    return this;
  }
  private java.sql.Date datalocacao;
  public java.sql.Date get_datalocacao() {
    return datalocacao;
  }
  public void set_datalocacao(java.sql.Date datalocacao) {
    this.datalocacao = datalocacao;
  }
  public locacao with_datalocacao(java.sql.Date datalocacao) {
    this.datalocacao = datalocacao;
    return this;
  }
  private java.sql.Date dataentrega;
  public java.sql.Date get_dataentrega() {
    return dataentrega;
  }
  public void set_dataentrega(java.sql.Date dataentrega) {
    this.dataentrega = dataentrega;
  }
  public locacao with_dataentrega(java.sql.Date dataentrega) {
    this.dataentrega = dataentrega;
    return this;
  }
  private java.math.BigDecimal total;
  public java.math.BigDecimal get_total() {
    return total;
  }
  public void set_total(java.math.BigDecimal total) {
    this.total = total;
  }
  public locacao with_total(java.math.BigDecimal total) {
    this.total = total;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof locacao)) {
      return false;
    }
    locacao that = (locacao) o;
    boolean equal = true;
    equal = equal && (this.idlocacao == null ? that.idlocacao == null : this.idlocacao.equals(that.idlocacao));
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.iddespachante == null ? that.iddespachante == null : this.iddespachante.equals(that.iddespachante));
    equal = equal && (this.idveiculo == null ? that.idveiculo == null : this.idveiculo.equals(that.idveiculo));
    equal = equal && (this.datalocacao == null ? that.datalocacao == null : this.datalocacao.equals(that.datalocacao));
    equal = equal && (this.dataentrega == null ? that.dataentrega == null : this.dataentrega.equals(that.dataentrega));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof locacao)) {
      return false;
    }
    locacao that = (locacao) o;
    boolean equal = true;
    equal = equal && (this.idlocacao == null ? that.idlocacao == null : this.idlocacao.equals(that.idlocacao));
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.iddespachante == null ? that.iddespachante == null : this.iddespachante.equals(that.iddespachante));
    equal = equal && (this.idveiculo == null ? that.idveiculo == null : this.idveiculo.equals(that.idveiculo));
    equal = equal && (this.datalocacao == null ? that.datalocacao == null : this.datalocacao.equals(that.datalocacao));
    equal = equal && (this.dataentrega == null ? that.dataentrega == null : this.dataentrega.equals(that.dataentrega));
    equal = equal && (this.total == null ? that.total == null : this.total.equals(that.total));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.idlocacao = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idcliente = JdbcWritableBridge.readInteger(2, __dbResults);
    this.iddespachante = JdbcWritableBridge.readInteger(3, __dbResults);
    this.idveiculo = JdbcWritableBridge.readInteger(4, __dbResults);
    this.datalocacao = JdbcWritableBridge.readDate(5, __dbResults);
    this.dataentrega = JdbcWritableBridge.readDate(6, __dbResults);
    this.total = JdbcWritableBridge.readBigDecimal(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.idlocacao = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idcliente = JdbcWritableBridge.readInteger(2, __dbResults);
    this.iddespachante = JdbcWritableBridge.readInteger(3, __dbResults);
    this.idveiculo = JdbcWritableBridge.readInteger(4, __dbResults);
    this.datalocacao = JdbcWritableBridge.readDate(5, __dbResults);
    this.dataentrega = JdbcWritableBridge.readDate(6, __dbResults);
    this.total = JdbcWritableBridge.readBigDecimal(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(idlocacao, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idcliente, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(iddespachante, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idveiculo, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(datalocacao, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(dataentrega, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total, 7 + __off, 2, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(idlocacao, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idcliente, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(iddespachante, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idveiculo, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(datalocacao, 5 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(dataentrega, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(total, 7 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.idlocacao = null;
    } else {
    this.idlocacao = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.idcliente = null;
    } else {
    this.idcliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.iddespachante = null;
    } else {
    this.iddespachante = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.idveiculo = null;
    } else {
    this.idveiculo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.datalocacao = null;
    } else {
    this.datalocacao = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.dataentrega = null;
    } else {
    this.dataentrega = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.total = null;
    } else {
    this.total = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.idlocacao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idlocacao);
    }
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.iddespachante) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.iddespachante);
    }
    if (null == this.idveiculo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idveiculo);
    }
    if (null == this.datalocacao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datalocacao.getTime());
    }
    if (null == this.dataentrega) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dataentrega.getTime());
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.idlocacao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idlocacao);
    }
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.iddespachante) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.iddespachante);
    }
    if (null == this.idveiculo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idveiculo);
    }
    if (null == this.datalocacao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datalocacao.getTime());
    }
    if (null == this.dataentrega) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dataentrega.getTime());
    }
    if (null == this.total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.total, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(idlocacao==null?"null":"" + idlocacao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iddespachante==null?"null":"" + iddespachante, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idveiculo==null?"null":"" + idveiculo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datalocacao==null?"null":"" + datalocacao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataentrega==null?"null":"" + dataentrega, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":total.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(idlocacao==null?"null":"" + idlocacao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iddespachante==null?"null":"" + iddespachante, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idveiculo==null?"null":"" + idveiculo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datalocacao==null?"null":"" + datalocacao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataentrega==null?"null":"" + dataentrega, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(total==null?"null":total.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idlocacao = null; } else {
      this.idlocacao = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iddespachante = null; } else {
      this.iddespachante = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idveiculo = null; } else {
      this.idveiculo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datalocacao = null; } else {
      this.datalocacao = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dataentrega = null; } else {
      this.dataentrega = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idlocacao = null; } else {
      this.idlocacao = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iddespachante = null; } else {
      this.iddespachante = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idveiculo = null; } else {
      this.idveiculo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datalocacao = null; } else {
      this.datalocacao = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dataentrega = null; } else {
      this.dataentrega = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.total = null; } else {
      this.total = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    locacao o = (locacao) super.clone();
    o.datalocacao = (o.datalocacao != null) ? (java.sql.Date) o.datalocacao.clone() : null;
    o.dataentrega = (o.dataentrega != null) ? (java.sql.Date) o.dataentrega.clone() : null;
    return o;
  }

  public void clone0(locacao o) throws CloneNotSupportedException {
    o.datalocacao = (o.datalocacao != null) ? (java.sql.Date) o.datalocacao.clone() : null;
    o.dataentrega = (o.dataentrega != null) ? (java.sql.Date) o.dataentrega.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("idlocacao", this.idlocacao);
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("iddespachante", this.iddespachante);
    __sqoop$field_map.put("idveiculo", this.idveiculo);
    __sqoop$field_map.put("datalocacao", this.datalocacao);
    __sqoop$field_map.put("dataentrega", this.dataentrega);
    __sqoop$field_map.put("total", this.total);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("idlocacao", this.idlocacao);
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("iddespachante", this.iddespachante);
    __sqoop$field_map.put("idveiculo", this.idveiculo);
    __sqoop$field_map.put("datalocacao", this.datalocacao);
    __sqoop$field_map.put("dataentrega", this.dataentrega);
    __sqoop$field_map.put("total", this.total);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
