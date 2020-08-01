// ORM class for table 'dimensaocliente'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:02:59 PDT 2020
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

public class dimensaocliente extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("chavecliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavecliente = (Integer)value;
      }
    });
    setters.put("idcliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idcliente = (Integer)value;
      }
    });
    setters.put("cliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cliente = (String)value;
      }
    });
    setters.put("estado", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        estado = (String)value;
      }
    });
    setters.put("sexo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sexo = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        status = (String)value;
      }
    });
    setters.put("datainiciovalidade", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datainiciovalidade = (java.sql.Date)value;
      }
    });
    setters.put("datafimvalidade", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datafimvalidade = (java.sql.Date)value;
      }
    });
  }
  public dimensaocliente() {
    init0();
  }
  private Integer chavecliente;
  public Integer get_chavecliente() {
    return chavecliente;
  }
  public void set_chavecliente(Integer chavecliente) {
    this.chavecliente = chavecliente;
  }
  public dimensaocliente with_chavecliente(Integer chavecliente) {
    this.chavecliente = chavecliente;
    return this;
  }
  private Integer idcliente;
  public Integer get_idcliente() {
    return idcliente;
  }
  public void set_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
  }
  public dimensaocliente with_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
    return this;
  }
  private String cliente;
  public String get_cliente() {
    return cliente;
  }
  public void set_cliente(String cliente) {
    this.cliente = cliente;
  }
  public dimensaocliente with_cliente(String cliente) {
    this.cliente = cliente;
    return this;
  }
  private String estado;
  public String get_estado() {
    return estado;
  }
  public void set_estado(String estado) {
    this.estado = estado;
  }
  public dimensaocliente with_estado(String estado) {
    this.estado = estado;
    return this;
  }
  private String sexo;
  public String get_sexo() {
    return sexo;
  }
  public void set_sexo(String sexo) {
    this.sexo = sexo;
  }
  public dimensaocliente with_sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public dimensaocliente with_status(String status) {
    this.status = status;
    return this;
  }
  private java.sql.Date datainiciovalidade;
  public java.sql.Date get_datainiciovalidade() {
    return datainiciovalidade;
  }
  public void set_datainiciovalidade(java.sql.Date datainiciovalidade) {
    this.datainiciovalidade = datainiciovalidade;
  }
  public dimensaocliente with_datainiciovalidade(java.sql.Date datainiciovalidade) {
    this.datainiciovalidade = datainiciovalidade;
    return this;
  }
  private java.sql.Date datafimvalidade;
  public java.sql.Date get_datafimvalidade() {
    return datafimvalidade;
  }
  public void set_datafimvalidade(java.sql.Date datafimvalidade) {
    this.datafimvalidade = datafimvalidade;
  }
  public dimensaocliente with_datafimvalidade(java.sql.Date datafimvalidade) {
    this.datafimvalidade = datafimvalidade;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaocliente)) {
      return false;
    }
    dimensaocliente that = (dimensaocliente) o;
    boolean equal = true;
    equal = equal && (this.chavecliente == null ? that.chavecliente == null : this.chavecliente.equals(that.chavecliente));
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.cliente == null ? that.cliente == null : this.cliente.equals(that.cliente));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.sexo == null ? that.sexo == null : this.sexo.equals(that.sexo));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaocliente)) {
      return false;
    }
    dimensaocliente that = (dimensaocliente) o;
    boolean equal = true;
    equal = equal && (this.chavecliente == null ? that.chavecliente == null : this.chavecliente.equals(that.chavecliente));
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.cliente == null ? that.cliente == null : this.cliente.equals(that.cliente));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.sexo == null ? that.sexo == null : this.sexo.equals(that.sexo));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.chavecliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idcliente = JdbcWritableBridge.readInteger(2, __dbResults);
    this.cliente = JdbcWritableBridge.readString(3, __dbResults);
    this.estado = JdbcWritableBridge.readString(4, __dbResults);
    this.sexo = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.datainiciovalidade = JdbcWritableBridge.readDate(7, __dbResults);
    this.datafimvalidade = JdbcWritableBridge.readDate(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.chavecliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idcliente = JdbcWritableBridge.readInteger(2, __dbResults);
    this.cliente = JdbcWritableBridge.readString(3, __dbResults);
    this.estado = JdbcWritableBridge.readString(4, __dbResults);
    this.sexo = JdbcWritableBridge.readString(5, __dbResults);
    this.status = JdbcWritableBridge.readString(6, __dbResults);
    this.datainiciovalidade = JdbcWritableBridge.readDate(7, __dbResults);
    this.datafimvalidade = JdbcWritableBridge.readDate(8, __dbResults);
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
    JdbcWritableBridge.writeInteger(chavecliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idcliente, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cliente, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sexo, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 8 + __off, 91, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(chavecliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idcliente, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cliente, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sexo, 5 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(status, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 8 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.chavecliente = null;
    } else {
    this.chavecliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.idcliente = null;
    } else {
    this.idcliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cliente = null;
    } else {
    this.cliente = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estado = null;
    } else {
    this.estado = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sexo = null;
    } else {
    this.sexo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.datainiciovalidade = null;
    } else {
    this.datainiciovalidade = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.datafimvalidade = null;
    } else {
    this.datafimvalidade = new Date(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.chavecliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavecliente);
    }
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cliente);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado);
    }
    if (null == this.sexo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sexo);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.datainiciovalidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datainiciovalidade.getTime());
    }
    if (null == this.datafimvalidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datafimvalidade.getTime());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.chavecliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavecliente);
    }
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cliente);
    }
    if (null == this.estado) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, estado);
    }
    if (null == this.sexo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sexo);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
    if (null == this.datainiciovalidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datainiciovalidade.getTime());
    }
    if (null == this.datafimvalidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datafimvalidade.getTime());
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
    __sb.append(FieldFormatter.escapeAndEnclose(chavecliente==null?"null":"" + chavecliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cliente==null?"null":cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sexo==null?"null":sexo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datainiciovalidade==null?"null":"" + datainiciovalidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datafimvalidade==null?"null":"" + datafimvalidade, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(chavecliente==null?"null":"" + chavecliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cliente==null?"null":cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sexo==null?"null":sexo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datainiciovalidade==null?"null":"" + datainiciovalidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datafimvalidade==null?"null":"" + datafimvalidade, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavecliente = null; } else {
      this.chavecliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cliente = null; } else {
      this.cliente = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado = null; } else {
      this.estado = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sexo = null; } else {
      this.sexo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datainiciovalidade = null; } else {
      this.datainiciovalidade = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datafimvalidade = null; } else {
      this.datafimvalidade = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavecliente = null; } else {
      this.chavecliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cliente = null; } else {
      this.cliente = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.estado = null; } else {
      this.estado = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sexo = null; } else {
      this.sexo = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datainiciovalidade = null; } else {
      this.datainiciovalidade = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datafimvalidade = null; } else {
      this.datafimvalidade = java.sql.Date.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dimensaocliente o = (dimensaocliente) super.clone();
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
    return o;
  }

  public void clone0(dimensaocliente o) throws CloneNotSupportedException {
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("chavecliente", this.chavecliente);
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("cliente", this.cliente);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("sexo", this.sexo);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("datainiciovalidade", this.datainiciovalidade);
    __sqoop$field_map.put("datafimvalidade", this.datafimvalidade);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("chavecliente", this.chavecliente);
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("cliente", this.cliente);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("sexo", this.sexo);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("datainiciovalidade", this.datainiciovalidade);
    __sqoop$field_map.put("datafimvalidade", this.datafimvalidade);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
