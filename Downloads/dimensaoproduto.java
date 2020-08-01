// ORM class for table 'dimensaoproduto'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:03:41 PDT 2020
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

public class dimensaoproduto extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("chaveproduto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chaveproduto = (Integer)value;
      }
    });
    setters.put("idproduto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idproduto = (Integer)value;
      }
    });
    setters.put("produto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        produto = (String)value;
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
  public dimensaoproduto() {
    init0();
  }
  private Integer chaveproduto;
  public Integer get_chaveproduto() {
    return chaveproduto;
  }
  public void set_chaveproduto(Integer chaveproduto) {
    this.chaveproduto = chaveproduto;
  }
  public dimensaoproduto with_chaveproduto(Integer chaveproduto) {
    this.chaveproduto = chaveproduto;
    return this;
  }
  private Integer idproduto;
  public Integer get_idproduto() {
    return idproduto;
  }
  public void set_idproduto(Integer idproduto) {
    this.idproduto = idproduto;
  }
  public dimensaoproduto with_idproduto(Integer idproduto) {
    this.idproduto = idproduto;
    return this;
  }
  private String produto;
  public String get_produto() {
    return produto;
  }
  public void set_produto(String produto) {
    this.produto = produto;
  }
  public dimensaoproduto with_produto(String produto) {
    this.produto = produto;
    return this;
  }
  private java.sql.Date datainiciovalidade;
  public java.sql.Date get_datainiciovalidade() {
    return datainiciovalidade;
  }
  public void set_datainiciovalidade(java.sql.Date datainiciovalidade) {
    this.datainiciovalidade = datainiciovalidade;
  }
  public dimensaoproduto with_datainiciovalidade(java.sql.Date datainiciovalidade) {
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
  public dimensaoproduto with_datafimvalidade(java.sql.Date datafimvalidade) {
    this.datafimvalidade = datafimvalidade;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaoproduto)) {
      return false;
    }
    dimensaoproduto that = (dimensaoproduto) o;
    boolean equal = true;
    equal = equal && (this.chaveproduto == null ? that.chaveproduto == null : this.chaveproduto.equals(that.chaveproduto));
    equal = equal && (this.idproduto == null ? that.idproduto == null : this.idproduto.equals(that.idproduto));
    equal = equal && (this.produto == null ? that.produto == null : this.produto.equals(that.produto));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dimensaoproduto)) {
      return false;
    }
    dimensaoproduto that = (dimensaoproduto) o;
    boolean equal = true;
    equal = equal && (this.chaveproduto == null ? that.chaveproduto == null : this.chaveproduto.equals(that.chaveproduto));
    equal = equal && (this.idproduto == null ? that.idproduto == null : this.idproduto.equals(that.idproduto));
    equal = equal && (this.produto == null ? that.produto == null : this.produto.equals(that.produto));
    equal = equal && (this.datainiciovalidade == null ? that.datainiciovalidade == null : this.datainiciovalidade.equals(that.datainiciovalidade));
    equal = equal && (this.datafimvalidade == null ? that.datafimvalidade == null : this.datafimvalidade.equals(that.datafimvalidade));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.chaveproduto = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idproduto = JdbcWritableBridge.readInteger(2, __dbResults);
    this.produto = JdbcWritableBridge.readString(3, __dbResults);
    this.datainiciovalidade = JdbcWritableBridge.readDate(4, __dbResults);
    this.datafimvalidade = JdbcWritableBridge.readDate(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.chaveproduto = JdbcWritableBridge.readInteger(1, __dbResults);
    this.idproduto = JdbcWritableBridge.readInteger(2, __dbResults);
    this.produto = JdbcWritableBridge.readString(3, __dbResults);
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
    JdbcWritableBridge.writeInteger(chaveproduto, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idproduto, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(produto, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 5 + __off, 91, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(chaveproduto, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(idproduto, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(produto, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datainiciovalidade, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datafimvalidade, 5 + __off, 91, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.chaveproduto = null;
    } else {
    this.chaveproduto = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.idproduto = null;
    } else {
    this.idproduto = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.produto = null;
    } else {
    this.produto = Text.readString(__dataIn);
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
    if (null == this.chaveproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chaveproduto);
    }
    if (null == this.idproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idproduto);
    }
    if (null == this.produto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, produto);
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
    if (null == this.chaveproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chaveproduto);
    }
    if (null == this.idproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idproduto);
    }
    if (null == this.produto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, produto);
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
    __sb.append(FieldFormatter.escapeAndEnclose(chaveproduto==null?"null":"" + chaveproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idproduto==null?"null":"" + idproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(produto==null?"null":produto, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(chaveproduto==null?"null":"" + chaveproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(idproduto==null?"null":"" + idproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(produto==null?"null":produto, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chaveproduto = null; } else {
      this.chaveproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idproduto = null; } else {
      this.idproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.produto = null; } else {
      this.produto = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chaveproduto = null; } else {
      this.chaveproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idproduto = null; } else {
      this.idproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.produto = null; } else {
      this.produto = __cur_str;
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
    dimensaoproduto o = (dimensaoproduto) super.clone();
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
    return o;
  }

  public void clone0(dimensaoproduto o) throws CloneNotSupportedException {
    o.datainiciovalidade = (o.datainiciovalidade != null) ? (java.sql.Date) o.datainiciovalidade.clone() : null;
    o.datafimvalidade = (o.datafimvalidade != null) ? (java.sql.Date) o.datafimvalidade.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("chaveproduto", this.chaveproduto);
    __sqoop$field_map.put("idproduto", this.idproduto);
    __sqoop$field_map.put("produto", this.produto);
    __sqoop$field_map.put("datainiciovalidade", this.datainiciovalidade);
    __sqoop$field_map.put("datafimvalidade", this.datafimvalidade);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("chaveproduto", this.chaveproduto);
    __sqoop$field_map.put("idproduto", this.idproduto);
    __sqoop$field_map.put("produto", this.produto);
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
