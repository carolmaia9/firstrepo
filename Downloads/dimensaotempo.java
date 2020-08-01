// ORM class for table 'dimensaotempo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:04:23 PDT 2020
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

public class dimensaotempo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("chavetempo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavetempo = (Integer)value;
      }
    });
    setters.put("data", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        data = (java.sql.Date)value;
      }
    });
    setters.put("dia", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dia = (Integer)value;
      }
    });
    setters.put("mes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        mes = (Integer)value;
      }
    });
    setters.put("ano", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ano = (Integer)value;
      }
    });
    setters.put("diasemana", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        diasemana = (Integer)value;
      }
    });
    setters.put("trimestre", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        trimestre = (Integer)value;
      }
    });
  }
  public dimensaotempo() {
    init0();
  }
  private Integer chavetempo;
  public Integer get_chavetempo() {
    return chavetempo;
  }
  public void set_chavetempo(Integer chavetempo) {
    this.chavetempo = chavetempo;
  }
  public dimensaotempo with_chavetempo(Integer chavetempo) {
    this.chavetempo = chavetempo;
    return this;
  }
  private java.sql.Date data;
  public java.sql.Date get_data() {
    return data;
  }
  public void set_data(java.sql.Date data) {
    this.data = data;
  }
  public dimensaotempo with_data(java.sql.Date data) {
    this.data = data;
    return this;
  }
  private Integer dia;
  public Integer get_dia() {
    return dia;
  }
  public void set_dia(Integer dia) {
    this.dia = dia;
  }
  public dimensaotempo with_dia(Integer dia) {
    this.dia = dia;
    return this;
  }
  private Integer mes;
  public Integer get_mes() {
    return mes;
  }
  public void set_mes(Integer mes) {
    this.mes = mes;
  }
  public dimensaotempo with_mes(Integer mes) {
    this.mes = mes;
    return this;
  }
  private Integer ano;
  public Integer get_ano() {
    return ano;
  }
  public void set_ano(Integer ano) {
    this.ano = ano;
  }
  public dimensaotempo with_ano(Integer ano) {
    this.ano = ano;
    return this;
  }
  private Integer diasemana;
  public Integer get_diasemana() {
    return diasemana;
  }
  public void set_diasemana(Integer diasemana) {
    this.diasemana = diasemana;
  }
  public dimensaotempo with_diasemana(Integer diasemana) {
    this.diasemana = diasemana;
    return this;
  }
  private Integer trimestre;
  public Integer get_trimestre() {
    return trimestre;
  }
  public void set_trimestre(Integer trimestre) {
    this.trimestre = trimestre;
  }
  public dimensaotempo with_trimestre(Integer trimestre) {
    this.trimestre = trimestre;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaotempo)) {
      return false;
    }
    dimensaotempo that = (dimensaotempo) o;
    boolean equal = true;
    equal = equal && (this.chavetempo == null ? that.chavetempo == null : this.chavetempo.equals(that.chavetempo));
    equal = equal && (this.data == null ? that.data == null : this.data.equals(that.data));
    equal = equal && (this.dia == null ? that.dia == null : this.dia.equals(that.dia));
    equal = equal && (this.mes == null ? that.mes == null : this.mes.equals(that.mes));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.diasemana == null ? that.diasemana == null : this.diasemana.equals(that.diasemana));
    equal = equal && (this.trimestre == null ? that.trimestre == null : this.trimestre.equals(that.trimestre));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaotempo)) {
      return false;
    }
    dimensaotempo that = (dimensaotempo) o;
    boolean equal = true;
    equal = equal && (this.chavetempo == null ? that.chavetempo == null : this.chavetempo.equals(that.chavetempo));
    equal = equal && (this.data == null ? that.data == null : this.data.equals(that.data));
    equal = equal && (this.dia == null ? that.dia == null : this.dia.equals(that.dia));
    equal = equal && (this.mes == null ? that.mes == null : this.mes.equals(that.mes));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.diasemana == null ? that.diasemana == null : this.diasemana.equals(that.diasemana));
    equal = equal && (this.trimestre == null ? that.trimestre == null : this.trimestre.equals(that.trimestre));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.chavetempo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.data = JdbcWritableBridge.readDate(2, __dbResults);
    this.dia = JdbcWritableBridge.readInteger(3, __dbResults);
    this.mes = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(5, __dbResults);
    this.diasemana = JdbcWritableBridge.readInteger(6, __dbResults);
    this.trimestre = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.chavetempo = JdbcWritableBridge.readInteger(1, __dbResults);
    this.data = JdbcWritableBridge.readDate(2, __dbResults);
    this.dia = JdbcWritableBridge.readInteger(3, __dbResults);
    this.mes = JdbcWritableBridge.readInteger(4, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(5, __dbResults);
    this.diasemana = JdbcWritableBridge.readInteger(6, __dbResults);
    this.trimestre = JdbcWritableBridge.readInteger(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(chavetempo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(data, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(dia, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mes, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(diasemana, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(trimestre, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(chavetempo, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(data, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(dia, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mes, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(diasemana, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(trimestre, 7 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.chavetempo = null;
    } else {
    this.chavetempo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.data = null;
    } else {
    this.data = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.dia = null;
    } else {
    this.dia = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.mes = null;
    } else {
    this.mes = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ano = null;
    } else {
    this.ano = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.diasemana = null;
    } else {
    this.diasemana = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.trimestre = null;
    } else {
    this.trimestre = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.chavetempo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavetempo);
    }
    if (null == this.data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.data.getTime());
    }
    if (null == this.dia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dia);
    }
    if (null == this.mes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mes);
    }
    if (null == this.ano) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ano);
    }
    if (null == this.diasemana) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.diasemana);
    }
    if (null == this.trimestre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.trimestre);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.chavetempo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavetempo);
    }
    if (null == this.data) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.data.getTime());
    }
    if (null == this.dia) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dia);
    }
    if (null == this.mes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.mes);
    }
    if (null == this.ano) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ano);
    }
    if (null == this.diasemana) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.diasemana);
    }
    if (null == this.trimestre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.trimestre);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(chavetempo==null?"null":"" + chavetempo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data==null?"null":"" + data, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dia==null?"null":"" + dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mes==null?"null":"" + mes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diasemana==null?"null":"" + diasemana, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trimestre==null?"null":"" + trimestre, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(chavetempo==null?"null":"" + chavetempo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data==null?"null":"" + data, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dia==null?"null":"" + dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mes==null?"null":"" + mes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diasemana==null?"null":"" + diasemana, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trimestre==null?"null":"" + trimestre, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavetempo = null; } else {
      this.chavetempo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data = null; } else {
      this.data = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dia = null; } else {
      this.dia = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mes = null; } else {
      this.mes = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ano = null; } else {
      this.ano = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diasemana = null; } else {
      this.diasemana = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trimestre = null; } else {
      this.trimestre = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavetempo = null; } else {
      this.chavetempo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.data = null; } else {
      this.data = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dia = null; } else {
      this.dia = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mes = null; } else {
      this.mes = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ano = null; } else {
      this.ano = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diasemana = null; } else {
      this.diasemana = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trimestre = null; } else {
      this.trimestre = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dimensaotempo o = (dimensaotempo) super.clone();
    o.data = (o.data != null) ? (java.sql.Date) o.data.clone() : null;
    return o;
  }

  public void clone0(dimensaotempo o) throws CloneNotSupportedException {
    o.data = (o.data != null) ? (java.sql.Date) o.data.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("chavetempo", this.chavetempo);
    __sqoop$field_map.put("data", this.data);
    __sqoop$field_map.put("dia", this.dia);
    __sqoop$field_map.put("mes", this.mes);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("diasemana", this.diasemana);
    __sqoop$field_map.put("trimestre", this.trimestre);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("chavetempo", this.chavetempo);
    __sqoop$field_map.put("data", this.data);
    __sqoop$field_map.put("dia", this.dia);
    __sqoop$field_map.put("mes", this.mes);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("diasemana", this.diasemana);
    __sqoop$field_map.put("trimestre", this.trimestre);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
