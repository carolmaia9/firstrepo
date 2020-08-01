// ORM class for table 'dimensaovendedor'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:02:06 PDT 2020
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

public class dimensaovendedor extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("chavevendedor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavevendedor = (Integer)value;
      }
    });
    setters.put("idvendedor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idvendedor = (Integer)value;
      }
    });
    setters.put("nome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        nome = (String)value;
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
  public dimensaovendedor() {
    init0();
  }
  private Integer chavevendedor;
  public Integer get_chavevendedor() {
    return chavevendedor;
  }
  public void set_chavevendedor(Integer chavevendedor) {
    this.chavevendedor = chavevendedor;
  }
  public dimensaovendedor with_chavevendedor(Integer chavevendedor) {
    this.chavevendedor = chavevendedor;
    return this;
  }
  private Integer idvendedor;
  public Integer get_idvendedor() {
    return idvendedor;
  }
  public void set_idvendedor(Integer idvendedor) {
    this.idvendedor = idvendedor;
  }
  public dimensaovendedor with_idvendedor(Integer idvendedor) {
    this.idvendedor = idvendedor;
    return this;
  }
  private String nome;
  public String get_nome() {
    return nome;
  }
  public void set_nome(String nome) {
    this.nome = nome;
  }
  public dimensaovendedor with_nome(String nome) {
    this.nome = nome;
    return this;
  }
  private java.sql.Date datainiciovalidade;
  public java.sql.Date get_datainiciovalidade() {
    return datainiciovalidade;
  }
  public void set_datainiciovalidade(java.sql.Date datainiciovalidade) {
    this.datainiciovalidade = datainiciovalidade;
  }
  public dimensaovendedor with_datainiciovalidade(java.sql.Date datainiciovalidade) {
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
  public dimensaovendedor with_datafimvalidade(java.sql.Date datafimvalidade) {
    this.datafimvalidade = datafimvalidade;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaovendedor)) {
      return false;
    }
    dimensaovendedor that = (dimensaovendedor) o;
    boolean equal = true;
    equal = equal && (this.chavevendedor == null ? that.chavevendedor == null : this.chavevendedor.equals(that.chavevendedor));
    equal = equal && (this.idvendedor == null ? that.idvendedor == null : this.idvendedor.equals(that.idvendedor));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaovendedor)) {
      return false;
    }
    dimensaovendedor that = (dimensaovendedor) o;
    boolean equal = true;
    equal = equal && (this.chavevendedor == null ? that.chavevendedor == null : this.chavevendedor.equals(that.chavevendedor));
    equal = equal && (this.idvendedor == null ? that.idvendedor == null : this.idvendedor.equals(that.idvendedor));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.chavevendedor = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idvendedor = JdbcWritableBridge.readInteger(2, __dbResults);
    this.nome = JdbcWritableBridge.readString(3, __dbResults);
    this.datainiciovalidade = JdbcWritableBridge.readDate(4, __dbResults);
    this.datafimvalidade = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.chavevendedor = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idvendedor = JdbcWritableBridge.readInteger(2, __dbResults);
    this.nome = JdbcWritableBridge.readString(3, __dbResults);
    this.datainiciovalidade = JdbcWritableBridge.readDate(4, __dbResults);
    this.datafimvalidade = JdbcWritableBridge.readDate(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(chavevendedor, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idvendedor, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nome, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 5 + __off, 91, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(chavevendedor, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idvendedor, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nome, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 5 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.chavevendedor = null;
    } else {
    this.chavevendedor = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.idvendedor = null;
    } else {
    this.idvendedor = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nome = null;
    } else {
    this.nome = Text.readString(__dataIn);
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
    if (null == this.chavevendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendedor);
    }
    if (null == this.idvendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idvendedor);
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
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
    if (null == this.chavevendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendedor);
    }
    if (null == this.idvendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idvendedor);
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
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
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendedor==null?"null":"" + chavevendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idvendedor==null?"null":"" + idvendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendedor==null?"null":"" + chavevendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idvendedor==null?"null":"" + idvendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendedor = null; } else {
      this.chavevendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idvendedor = null; } else {
      this.idvendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendedor = null; } else {
      this.chavevendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idvendedor = null; } else {
      this.idvendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
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
    dimensaovendedor o = (dimensaovendedor) super.clone();
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
    return o;
  }

  public void clone0(dimensaovendedor o) throws CloneNotSupportedException {
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("chavevendedor", this.chavevendedor);
    __sqoop$field_map.put("idvendedor", this.idvendedor);
    __sqoop$field_map.put("nome", this.nome);
    __sqoop$field_map.put("datainiciovalidade", this.datainiciovalidade);
    __sqoop$field_map.put("datafimvalidade", this.datafimvalidade);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("chavevendedor", this.chavevendedor);
    __sqoop$field_map.put("idvendedor", this.idvendedor);
    __sqoop$field_map.put("nome", this.nome);
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
