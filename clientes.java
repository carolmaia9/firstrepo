// ORM class for table 'clientes'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Jun 12 04:21:19 PDT 2020
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

public class clientes extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("idcliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        idcliente = (Integer)value;
      }
    });
    setters.put("cpf", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpf = (String)value;
      }
    });
    setters.put("cnh", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cnh = (String)value;
      }
    });
    setters.put("validadecnh", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        validadecnh = (java.sql.Date)value;
      }
    });
    setters.put("nome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        nome = (String)value;
      }
    });
    setters.put("datacadastro", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datacadastro = (java.sql.Date)value;
      }
    });
    setters.put("datanascimento", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        datanascimento = (java.sql.Date)value;
      }
    });
    setters.put("telefone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        telefone = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        status = (String)value;
      }
    });
  }
  public clientes() {
    init0();
  }
  private Integer idcliente;
  public Integer get_idcliente() {
    return idcliente;
  }
  public void set_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
  }
  public clientes with_idcliente(Integer idcliente) {
    this.idcliente = idcliente;
    return this;
  }
  private String cpf;
  public String get_cpf() {
    return cpf;
  }
  public void set_cpf(String cpf) {
    this.cpf = cpf;
  }
  public clientes with_cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }
  private String cnh;
  public String get_cnh() {
    return cnh;
  }
  public void set_cnh(String cnh) {
    this.cnh = cnh;
  }
  public clientes with_cnh(String cnh) {
    this.cnh = cnh;
    return this;
  }
  private java.sql.Date validadecnh;
  public java.sql.Date get_validadecnh() {
    return validadecnh;
  }
  public void set_validadecnh(java.sql.Date validadecnh) {
    this.validadecnh = validadecnh;
  }
  public clientes with_validadecnh(java.sql.Date validadecnh) {
    this.validadecnh = validadecnh;
    return this;
  }
  private String nome;
  public String get_nome() {
    return nome;
  }
  public void set_nome(String nome) {
    this.nome = nome;
  }
  public clientes with_nome(String nome) {
    this.nome = nome;
    return this;
  }
  private java.sql.Date datacadastro;
  public java.sql.Date get_datacadastro() {
    return datacadastro;
  }
  public void set_datacadastro(java.sql.Date datacadastro) {
    this.datacadastro = datacadastro;
  }
  public clientes with_datacadastro(java.sql.Date datacadastro) {
    this.datacadastro = datacadastro;
    return this;
  }
  private java.sql.Date datanascimento;
  public java.sql.Date get_datanascimento() {
    return datanascimento;
  }
  public void set_datanascimento(java.sql.Date datanascimento) {
    this.datanascimento = datanascimento;
  }
  public clientes with_datanascimento(java.sql.Date datanascimento) {
    this.datanascimento = datanascimento;
    return this;
  }
  private String telefone;
  public String get_telefone() {
    return telefone;
  }
  public void set_telefone(String telefone) {
    this.telefone = telefone;
  }
  public clientes with_telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public clientes with_status(String status) {
    this.status = status;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof clientes)) {
      return false;
    }
    clientes that = (clientes) o;
    boolean equal = true;
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.cpf == null ? that.cpf == null : this.cpf.equals(that.cpf));
    equal = equal && (this.cnh == null ? that.cnh == null : this.cnh.equals(that.cnh));
    equal = equal && (this.validadecnh == null ? that.validadecnh == null : this.validadecnh.equals(that.validadecnh));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    equal = equal && (this.datacadastro == null ? that.datacadastro == null : this.datacadastro.equals(that.datacadastro));
    equal = equal && (this.datanascimento == null ? that.datanascimento == null : this.datanascimento.equals(that.datanascimento));
    equal = equal && (this.telefone == null ? that.telefone == null : this.telefone.equals(that.telefone));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof clientes)) {
      return false;
    }
    clientes that = (clientes) o;
    boolean equal = true;
    equal = equal && (this.idcliente == null ? that.idcliente == null : this.idcliente.equals(that.idcliente));
    equal = equal && (this.cpf == null ? that.cpf == null : this.cpf.equals(that.cpf));
    equal = equal && (this.cnh == null ? that.cnh == null : this.cnh.equals(that.cnh));
    equal = equal && (this.validadecnh == null ? that.validadecnh == null : this.validadecnh.equals(that.validadecnh));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    equal = equal && (this.datacadastro == null ? that.datacadastro == null : this.datacadastro.equals(that.datacadastro));
    equal = equal && (this.datanascimento == null ? that.datanascimento == null : this.datanascimento.equals(that.datanascimento));
    equal = equal && (this.telefone == null ? that.telefone == null : this.telefone.equals(that.telefone));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.idcliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.cpf = JdbcWritableBridge.readString(2, __dbResults);
    this.cnh = JdbcWritableBridge.readString(3, __dbResults);
    this.validadecnh = JdbcWritableBridge.readDate(4, __dbResults);
    this.nome = JdbcWritableBridge.readString(5, __dbResults);
    this.datacadastro = JdbcWritableBridge.readDate(6, __dbResults);
    this.datanascimento = JdbcWritableBridge.readDate(7, __dbResults);
    this.telefone = JdbcWritableBridge.readString(8, __dbResults);
    this.status = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.idcliente = JdbcWritableBridge.readInteger(1, __dbResults);
    this.cpf = JdbcWritableBridge.readString(2, __dbResults);
    this.cnh = JdbcWritableBridge.readString(3, __dbResults);
    this.validadecnh = JdbcWritableBridge.readDate(4, __dbResults);
    this.nome = JdbcWritableBridge.readString(5, __dbResults);
    this.datacadastro = JdbcWritableBridge.readDate(6, __dbResults);
    this.datanascimento = JdbcWritableBridge.readDate(7, __dbResults);
    this.telefone = JdbcWritableBridge.readString(8, __dbResults);
    this.status = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(idcliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cpf, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cnh, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(validadecnh, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(nome, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datacadastro, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datanascimento, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(telefone, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(idcliente, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cpf, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cnh, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(validadecnh, 4 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(nome, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(datacadastro, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(datanascimento, 7 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(telefone, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.idcliente = null;
    } else {
    this.idcliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cpf = null;
    } else {
    this.cpf = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cnh = null;
    } else {
    this.cnh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.validadecnh = null;
    } else {
    this.validadecnh = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.nome = null;
    } else {
    this.nome = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.datacadastro = null;
    } else {
    this.datacadastro = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.datanascimento = null;
    } else {
    this.datanascimento = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.telefone = null;
    } else {
    this.telefone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.cpf) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cpf);
    }
    if (null == this.cnh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cnh);
    }
    if (null == this.validadecnh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.validadecnh.getTime());
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
    }
    if (null == this.datacadastro) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datacadastro.getTime());
    }
    if (null == this.datanascimento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datanascimento.getTime());
    }
    if (null == this.telefone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telefone);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.idcliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.idcliente);
    }
    if (null == this.cpf) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cpf);
    }
    if (null == this.cnh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cnh);
    }
    if (null == this.validadecnh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.validadecnh.getTime());
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
    }
    if (null == this.datacadastro) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datacadastro.getTime());
    }
    if (null == this.datanascimento) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.datanascimento.getTime());
    }
    if (null == this.telefone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telefone);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
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
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpf==null?"null":cpf, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnh==null?"null":cnh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(validadecnh==null?"null":"" + validadecnh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datacadastro==null?"null":"" + datacadastro, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datanascimento==null?"null":"" + datanascimento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telefone==null?"null":telefone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(idcliente==null?"null":"" + idcliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpf==null?"null":cpf, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnh==null?"null":cnh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(validadecnh==null?"null":"" + validadecnh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datacadastro==null?"null":"" + datacadastro, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(datanascimento==null?"null":"" + datanascimento, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telefone==null?"null":telefone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cpf = null; } else {
      this.cpf = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cnh = null; } else {
      this.cnh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.validadecnh = null; } else {
      this.validadecnh = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datacadastro = null; } else {
      this.datacadastro = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datanascimento = null; } else {
      this.datanascimento = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.telefone = null; } else {
      this.telefone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.idcliente = null; } else {
      this.idcliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cpf = null; } else {
      this.cpf = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cnh = null; } else {
      this.cnh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.validadecnh = null; } else {
      this.validadecnh = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datacadastro = null; } else {
      this.datacadastro = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.datanascimento = null; } else {
      this.datanascimento = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.telefone = null; } else {
      this.telefone = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    clientes o = (clientes) super.clone();
    o.validadecnh = (o.validadecnh != null) ? (java.sql.Date) o.validadecnh.clone() : null;
    o.datacadastro = (o.datacadastro != null) ? (java.sql.Date) o.datacadastro.clone() : null;
    o.datanascimento = (o.datanascimento != null) ? (java.sql.Date) o.datanascimento.clone() : null;
    return o;
  }

  public void clone0(clientes o) throws CloneNotSupportedException {
    o.validadecnh = (o.validadecnh != null) ? (java.sql.Date) o.validadecnh.clone() : null;
    o.datacadastro = (o.datacadastro != null) ? (java.sql.Date) o.datacadastro.clone() : null;
    o.datanascimento = (o.datanascimento != null) ? (java.sql.Date) o.datanascimento.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("cpf", this.cpf);
    __sqoop$field_map.put("cnh", this.cnh);
    __sqoop$field_map.put("validadecnh", this.validadecnh);
    __sqoop$field_map.put("nome", this.nome);
    __sqoop$field_map.put("datacadastro", this.datacadastro);
    __sqoop$field_map.put("datanascimento", this.datanascimento);
    __sqoop$field_map.put("telefone", this.telefone);
    __sqoop$field_map.put("status", this.status);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("idcliente", this.idcliente);
    __sqoop$field_map.put("cpf", this.cpf);
    __sqoop$field_map.put("cnh", this.cnh);
    __sqoop$field_map.put("validadecnh", this.validadecnh);
    __sqoop$field_map.put("nome", this.nome);
    __sqoop$field_map.put("datacadastro", this.datacadastro);
    __sqoop$field_map.put("datanascimento", this.datanascimento);
    __sqoop$field_map.put("telefone", this.telefone);
    __sqoop$field_map.put("status", this.status);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
