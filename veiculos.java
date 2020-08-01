// ORM class for table 'veiculos'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 12 04:24:47 PDT 2020
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

public class veiculos extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("idveiculo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idveiculo = (Integer)value;
      }
    });
    setters.put("dataaquisicao", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dataaquisicao = (java.sql.Date)value;
      }
    });
    setters.put("ano", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ano = (Integer)value;
      }
    });
    setters.put("modelo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        modelo = (String)value;
      }
    });
    setters.put("placa", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        placa = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        status = (String)value;
      }
    });
    setters.put("diaria", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        diaria = (java.math.BigDecimal)value;
      }
    });
  }
  public veiculos() {
    init0();
  }
  private Integer idveiculo;
  public Integer get_idveiculo() {
    return idveiculo;
  }
  public void set_idveiculo(Integer idveiculo) {
    this.idveiculo = idveiculo;
  }
  public veiculos with_idveiculo(Integer idveiculo) {
    this.idveiculo = idveiculo;
    return this;
  }
  private java.sql.Date dataaquisicao;
  public java.sql.Date get_dataaquisicao() {
    return dataaquisicao;
  }
  public void set_dataaquisicao(java.sql.Date dataaquisicao) {
    this.dataaquisicao = dataaquisicao;
  }
  public veiculos with_dataaquisicao(java.sql.Date dataaquisicao) {
    this.dataaquisicao = dataaquisicao;
    return this;
  }
  private Integer ano;
  public Integer get_ano() {
    return ano;
  }
  public void set_ano(Integer ano) {
    this.ano = ano;
  }
  public veiculos with_ano(Integer ano) {
    this.ano = ano;
    return this;
  }
  private String modelo;
  public String get_modelo() {
    return modelo;
  }
  public void set_modelo(String modelo) {
    this.modelo = modelo;
  }
  public veiculos with_modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }
  private String placa;
  public String get_placa() {
    return placa;
  }
  public void set_placa(String placa) {
    this.placa = placa;
  }
  public veiculos with_placa(String placa) {
    this.placa = placa;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public veiculos with_status(String status) {
    this.status = status;
    return this;
  }
  private java.math.BigDecimal diaria;
  public java.math.BigDecimal get_diaria() {
    return diaria;
  }
  public void set_diaria(java.math.BigDecimal diaria) {
    this.diaria = diaria;
  }
  public veiculos with_diaria(java.math.BigDecimal diaria) {
    this.diaria = diaria;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof veiculos)) {
      return false;
    }
    veiculos that = (veiculos) o;
    boolean equal = true;
    equal = equal && (this.idveiculo == null ? that.idveiculo == null : this.idveiculo.equals(that.idveiculo));
    equal = equal && (this.dataaquisicao == null ? that.dataaquisicao == null : this.dataaquisicao.equals(that.dataaquisicao));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.modelo == null ? that.modelo == null : this.modelo.equals(that.modelo));
    equal = equal && (this.placa == null ? that.placa == null : this.placa.equals(that.placa));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.diaria == null ? that.diaria == null : this.diaria.equals(that.diaria));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof veiculos)) {
      return false;
    }
    veiculos that = (veiculos) o;
    boolean equal = true;
    equal = equal && (this.idveiculo == null ? that.idveiculo == null : this.idveiculo.equals(that.idveiculo));
    equal = equal && (this.dataaquisicao == null ? that.dataaquisicao == null : this.dataaquisicao.equals(that.dataaquisicao));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.modelo == null ? that.modelo == null : this.modelo.equals(that.modelo));
    equal = equal && (this.placa == null ? that.placa == null : this.placa.equals(that.placa));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.diaria == null ? that.diaria == null : this.diaria.equals(that.diaria));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.idveiculo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.dataaquisicao = JdbcWritableBridge.readDate(2, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(3, __dbResults);
    this.modelo = JdbcWritableBridge.readString(4, __dbResults);
    this.placa = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.diaria = JdbcWritableBridge.readBigDecimal(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.idveiculo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.dataaquisicao = JdbcWritableBridge.readDate(2, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(3, __dbResults);
    this.modelo = JdbcWritableBridge.readString(4, __dbResults);
    this.placa = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.diaria = JdbcWritableBridge.readBigDecimal(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(idveiculo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(dataaquisicao, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(modelo, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(placa, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(diaria, 7 + __off, 2, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(idveiculo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(dataaquisicao, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(modelo, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(placa, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(diaria, 7 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.idveiculo = null;
    } else {
    this.idveiculo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dataaquisicao = null;
    } else {
    this.dataaquisicao = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.ano = null;
    } else {
    this.ano = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.modelo = null;
    } else {
    this.modelo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.placa = null;
    } else {
    this.placa = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.diaria = null;
    } else {
    this.diaria = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.idveiculo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idveiculo);
    }
    if (null == this.dataaquisicao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dataaquisicao.getTime());
    }
    if (null == this.ano) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ano);
    }
    if (null == this.modelo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modelo);
    }
    if (null == this.placa) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, placa);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.diaria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.diaria, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.idveiculo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idveiculo);
    }
    if (null == this.dataaquisicao) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dataaquisicao.getTime());
    }
    if (null == this.ano) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ano);
    }
    if (null == this.modelo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, modelo);
    }
    if (null == this.placa) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, placa);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.diaria) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.diaria, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(idveiculo==null?"null":"" + idveiculo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataaquisicao==null?"null":"" + dataaquisicao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modelo==null?"null":modelo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(placa==null?"null":placa, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diaria==null?"null":diaria.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(idveiculo==null?"null":"" + idveiculo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dataaquisicao==null?"null":"" + dataaquisicao, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(modelo==null?"null":modelo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(placa==null?"null":placa, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diaria==null?"null":diaria.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idveiculo = null; } else {
      this.idveiculo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dataaquisicao = null; } else {
      this.dataaquisicao = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ano = null; } else {
      this.ano = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modelo = null; } else {
      this.modelo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.placa = null; } else {
      this.placa = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diaria = null; } else {
      this.diaria = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idveiculo = null; } else {
      this.idveiculo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dataaquisicao = null; } else {
      this.dataaquisicao = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ano = null; } else {
      this.ano = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.modelo = null; } else {
      this.modelo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.placa = null; } else {
      this.placa = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diaria = null; } else {
      this.diaria = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    veiculos o = (veiculos) super.clone();
    o.dataaquisicao = (o.dataaquisicao != null) ? (java.sql.Date) o.dataaquisicao.clone() : null;
    return o;
  }

  public void clone0(veiculos o) throws CloneNotSupportedException {
    o.dataaquisicao = (o.dataaquisicao != null) ? (java.sql.Date) o.dataaquisicao.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("idveiculo", this.idveiculo);
    __sqoop$field_map.put("dataaquisicao", this.dataaquisicao);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("modelo", this.modelo);
    __sqoop$field_map.put("placa", this.placa);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("diaria", this.diaria);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("idveiculo", this.idveiculo);
    __sqoop$field_map.put("dataaquisicao", this.dataaquisicao);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("modelo", this.modelo);
    __sqoop$field_map.put("placa", this.placa);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("diaria", this.diaria);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
