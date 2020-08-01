// ORM class for table 'fatovendas'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:05:08 PDT 2020
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

public class fatovendas extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("chavevendas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavevendas = (Integer)value;
      }
    });
    setters.put("chavevendedor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavevendedor = (Integer)value;
      }
    });
    setters.put("chavecliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavecliente = (Integer)value;
      }
    });
    setters.put("chaveproduto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chaveproduto = (Integer)value;
      }
    });
    setters.put("chavetempo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        chavetempo = (Integer)value;
      }
    });
    setters.put("quantidade", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        quantidade = (Integer)value;
      }
    });
    setters.put("valorunitario", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        valorunitario = (java.math.BigDecimal)value;
      }
    });
    setters.put("valortotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        valortotal = (java.math.BigDecimal)value;
      }
    });
    setters.put("desconto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        desconto = (java.math.BigDecimal)value;
      }
    });
  }
  public fatovendas() {
    init0();
  }
  private Integer chavevendas;
  public Integer get_chavevendas() {
    return chavevendas;
  }
  public void set_chavevendas(Integer chavevendas) {
    this.chavevendas = chavevendas;
  }
  public fatovendas with_chavevendas(Integer chavevendas) {
    this.chavevendas = chavevendas;
    return this;
  }
  private Integer chavevendedor;
  public Integer get_chavevendedor() {
    return chavevendedor;
  }
  public void set_chavevendedor(Integer chavevendedor) {
    this.chavevendedor = chavevendedor;
  }
  public fatovendas with_chavevendedor(Integer chavevendedor) {
    this.chavevendedor = chavevendedor;
    return this;
  }
  private Integer chavecliente;
  public Integer get_chavecliente() {
    return chavecliente;
  }
  public void set_chavecliente(Integer chavecliente) {
    this.chavecliente = chavecliente;
  }
  public fatovendas with_chavecliente(Integer chavecliente) {
    this.chavecliente = chavecliente;
    return this;
  }
  private Integer chaveproduto;
  public Integer get_chaveproduto() {
    return chaveproduto;
  }
  public void set_chaveproduto(Integer chaveproduto) {
    this.chaveproduto = chaveproduto;
  }
  public fatovendas with_chaveproduto(Integer chaveproduto) {
    this.chaveproduto = chaveproduto;
    return this;
  }
  private Integer chavetempo;
  public Integer get_chavetempo() {
    return chavetempo;
  }
  public void set_chavetempo(Integer chavetempo) {
    this.chavetempo = chavetempo;
  }
  public fatovendas with_chavetempo(Integer chavetempo) {
    this.chavetempo = chavetempo;
    return this;
  }
  private Integer quantidade;
  public Integer get_quantidade() {
    return quantidade;
  }
  public void set_quantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }
  public fatovendas with_quantidade(Integer quantidade) {
    this.quantidade = quantidade;
    return this;
  }
  private java.math.BigDecimal valorunitario;
  public java.math.BigDecimal get_valorunitario() {
    return valorunitario;
  }
  public void set_valorunitario(java.math.BigDecimal valorunitario) {
    this.valorunitario = valorunitario;
  }
  public fatovendas with_valorunitario(java.math.BigDecimal valorunitario) {
    this.valorunitario = valorunitario;
    return this;
  }
  private java.math.BigDecimal valortotal;
  public java.math.BigDecimal get_valortotal() {
    return valortotal;
  }
  public void set_valortotal(java.math.BigDecimal valortotal) {
    this.valortotal = valortotal;
  }
  public fatovendas with_valortotal(java.math.BigDecimal valortotal) {
    this.valortotal = valortotal;
    return this;
  }
  private java.math.BigDecimal desconto;
  public java.math.BigDecimal get_desconto() {
    return desconto;
  }
  public void set_desconto(java.math.BigDecimal desconto) {
    this.desconto = desconto;
  }
  public fatovendas with_desconto(java.math.BigDecimal desconto) {
    this.desconto = desconto;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fatovendas)) {
      return false;
    }
    fatovendas that = (fatovendas) o;
    boolean equal = true;
    equal = equal && (this.chavevendas == null ? that.chavevendas == null : this.chavevendas.equals(that.chavevendas));
    equal = equal && (this.chavevendedor == null ? that.chavevendedor == null : this.chavevendedor.equals(that.chavevendedor));
    equal = equal && (this.chavecliente == null ? that.chavecliente == null : this.chavecliente.equals(that.chavecliente));
    equal = equal && (this.chaveproduto == null ? that.chaveproduto == null : this.chaveproduto.equals(that.chaveproduto));
    equal = equal && (this.chavetempo == null ? that.chavetempo == null : this.chavetempo.equals(that.chavetempo));
    equal = equal && (this.quantidade == null ? that.quantidade == null : this.quantidade.equals(that.quantidade));
    equal = equal && (this.valorunitario == null ? that.valorunitario == null : this.valorunitario.equals(that.valorunitario));
    equal = equal && (this.valortotal == null ? that.valortotal == null : this.valortotal.equals(that.valortotal));
    equal = equal && (this.desconto == null ? that.desconto == null : this.desconto.equals(that.desconto));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fatovendas)) {
      return false;
    }
    fatovendas that = (fatovendas) o;
    boolean equal = true;
    equal = equal && (this.chavevendas == null ? that.chavevendas == null : this.chavevendas.equals(that.chavevendas));
    equal = equal && (this.chavevendedor == null ? that.chavevendedor == null : this.chavevendedor.equals(that.chavevendedor));
    equal = equal && (this.chavecliente == null ? that.chavecliente == null : this.chavecliente.equals(that.chavecliente));
    equal = equal && (this.chaveproduto == null ? that.chaveproduto == null : this.chaveproduto.equals(that.chaveproduto));
    equal = equal && (this.chavetempo == null ? that.chavetempo == null : this.chavetempo.equals(that.chavetempo));
    equal = equal && (this.quantidade == null ? that.quantidade == null : this.quantidade.equals(that.quantidade));
    equal = equal && (this.valorunitario == null ? that.valorunitario == null : this.valorunitario.equals(that.valorunitario));
    equal = equal && (this.valortotal == null ? that.valortotal == null : this.valortotal.equals(that.valortotal));
    equal = equal && (this.desconto == null ? that.desconto == null : this.desconto.equals(that.desconto));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.chavevendas = JdbcWritableBridge.readInteger(1, __dbResults);
    this.chavevendedor = JdbcWritableBridge.readInteger(2, __dbResults);
    this.chavecliente = JdbcWritableBridge.readInteger(3, __dbResults);
    this.chaveproduto = JdbcWritableBridge.readInteger(4, __dbResults);
    this.chavetempo = JdbcWritableBridge.readInteger(5, __dbResults);
    this.quantidade = JdbcWritableBridge.readInteger(6, __dbResults);
    this.valorunitario = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.valortotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.desconto = JdbcWritableBridge.readBigDecimal(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.chavevendas = JdbcWritableBridge.readInteger(1, __dbResults);
    this.chavevendedor = JdbcWritableBridge.readInteger(2, __dbResults);
    this.chavecliente = JdbcWritableBridge.readInteger(3, __dbResults);
    this.chaveproduto = JdbcWritableBridge.readInteger(4, __dbResults);
    this.chavetempo = JdbcWritableBridge.readInteger(5, __dbResults);
    this.quantidade = JdbcWritableBridge.readInteger(6, __dbResults);
    this.valorunitario = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.valortotal = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.desconto = JdbcWritableBridge.readBigDecimal(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(chavevendas, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavevendedor, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavecliente, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chaveproduto, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavetempo, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(quantidade, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valorunitario, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valortotal, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(desconto, 9 + __off, 2, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(chavevendas, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavevendedor, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavecliente, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chaveproduto, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(chavetempo, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(quantidade, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valorunitario, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valortotal, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(desconto, 9 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.chavevendas = null;
    } else {
    this.chavevendas = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.chavevendedor = null;
    } else {
    this.chavevendedor = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.chavecliente = null;
    } else {
    this.chavecliente = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.chaveproduto = null;
    } else {
    this.chaveproduto = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.chavetempo = null;
    } else {
    this.chavetempo = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.quantidade = null;
    } else {
    this.quantidade = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.valorunitario = null;
    } else {
    this.valorunitario = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.valortotal = null;
    } else {
    this.valortotal = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.desconto = null;
    } else {
    this.desconto = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.chavevendas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendas);
    }
    if (null == this.chavevendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendedor);
    }
    if (null == this.chavecliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavecliente);
    }
    if (null == this.chaveproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chaveproduto);
    }
    if (null == this.chavetempo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavetempo);
    }
    if (null == this.quantidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantidade);
    }
    if (null == this.valorunitario) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valorunitario, __dataOut);
    }
    if (null == this.valortotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valortotal, __dataOut);
    }
    if (null == this.desconto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.desconto, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.chavevendas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendas);
    }
    if (null == this.chavevendedor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavevendedor);
    }
    if (null == this.chavecliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavecliente);
    }
    if (null == this.chaveproduto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chaveproduto);
    }
    if (null == this.chavetempo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.chavetempo);
    }
    if (null == this.quantidade) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quantidade);
    }
    if (null == this.valorunitario) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valorunitario, __dataOut);
    }
    if (null == this.valortotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.valortotal, __dataOut);
    }
    if (null == this.desconto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.desconto, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendas==null?"null":"" + chavevendas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendedor==null?"null":"" + chavevendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavecliente==null?"null":"" + chavecliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chaveproduto==null?"null":"" + chaveproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavetempo==null?"null":"" + chavetempo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantidade==null?"null":"" + quantidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valorunitario==null?"null":valorunitario.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valortotal==null?"null":valortotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desconto==null?"null":desconto.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendas==null?"null":"" + chavevendas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavevendedor==null?"null":"" + chavevendedor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavecliente==null?"null":"" + chavecliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chaveproduto==null?"null":"" + chaveproduto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(chavetempo==null?"null":"" + chavetempo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantidade==null?"null":"" + quantidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valorunitario==null?"null":valorunitario.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valortotal==null?"null":valortotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desconto==null?"null":desconto.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendas = null; } else {
      this.chavevendas = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendedor = null; } else {
      this.chavevendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavecliente = null; } else {
      this.chavecliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chaveproduto = null; } else {
      this.chaveproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavetempo = null; } else {
      this.chavetempo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantidade = null; } else {
      this.quantidade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valorunitario = null; } else {
      this.valorunitario = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valortotal = null; } else {
      this.valortotal = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.desconto = null; } else {
      this.desconto = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendas = null; } else {
      this.chavevendas = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavevendedor = null; } else {
      this.chavevendedor = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavecliente = null; } else {
      this.chavecliente = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chaveproduto = null; } else {
      this.chaveproduto = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.chavetempo = null; } else {
      this.chavetempo = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quantidade = null; } else {
      this.quantidade = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valorunitario = null; } else {
      this.valorunitario = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.valortotal = null; } else {
      this.valortotal = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.desconto = null; } else {
      this.desconto = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    fatovendas o = (fatovendas) super.clone();
    return o;
  }

  public void clone0(fatovendas o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("chavevendas", this.chavevendas);
    __sqoop$field_map.put("chavevendedor", this.chavevendedor);
    __sqoop$field_map.put("chavecliente", this.chavecliente);
    __sqoop$field_map.put("chaveproduto", this.chaveproduto);
    __sqoop$field_map.put("chavetempo", this.chavetempo);
    __sqoop$field_map.put("quantidade", this.quantidade);
    __sqoop$field_map.put("valorunitario", this.valorunitario);
    __sqoop$field_map.put("valortotal", this.valortotal);
    __sqoop$field_map.put("desconto", this.desconto);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("chavevendas", this.chavevendas);
    __sqoop$field_map.put("chavevendedor", this.chavevendedor);
    __sqoop$field_map.put("chavecliente", this.chavecliente);
    __sqoop$field_map.put("chaveproduto", this.chaveproduto);
    __sqoop$field_map.put("chavetempo", this.chavetempo);
    __sqoop$field_map.put("quantidade", this.quantidade);
    __sqoop$field_map.put("valorunitario", this.valorunitario);
    __sqoop$field_map.put("valortotal", this.valortotal);
    __sqoop$field_map.put("desconto", this.desconto);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
