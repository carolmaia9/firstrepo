// ORM class for table 'des_vendas'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Jun 02 10:05:48 PDT 2020
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

public class des_vendas extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
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
    setters.put("produto", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        produto = (String)value;
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
    setters.put("trimestre", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        trimestre = (Integer)value;
      }
    });
    setters.put("nome", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        nome = (String)value;
      }
    });
  }
  public des_vendas() {
    init0();
  }
  private String cliente;
  public String get_cliente() {
    return cliente;
  }
  public void set_cliente(String cliente) {
    this.cliente = cliente;
  }
  public des_vendas with_cliente(String cliente) {
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
  public des_vendas with_estado(String estado) {
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
  public des_vendas with_sexo(String sexo) {
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
  public des_vendas with_status(String status) {
    this.status = status;
    return this;
  }
  private Integer quantidade;
  public Integer get_quantidade() {
    return quantidade;
  }
  public void set_quantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }
  public des_vendas with_quantidade(Integer quantidade) {
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
  public des_vendas with_valorunitario(java.math.BigDecimal valorunitario) {
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
  public des_vendas with_valortotal(java.math.BigDecimal valortotal) {
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
  public des_vendas with_desconto(java.math.BigDecimal desconto) {
    this.desconto = desconto;
    return this;
  }
  private String produto;
  public String get_produto() {
    return produto;
  }
  public void set_produto(String produto) {
    this.produto = produto;
  }
  public des_vendas with_produto(String produto) {
    this.produto = produto;
    return this;
  }
  private java.sql.Date data;
  public java.sql.Date get_data() {
    return data;
  }
  public void set_data(java.sql.Date data) {
    this.data = data;
  }
  public des_vendas with_data(java.sql.Date data) {
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
  public des_vendas with_dia(Integer dia) {
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
  public des_vendas with_mes(Integer mes) {
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
  public des_vendas with_ano(Integer ano) {
    this.ano = ano;
    return this;
  }
  private Integer trimestre;
  public Integer get_trimestre() {
    return trimestre;
  }
  public void set_trimestre(Integer trimestre) {
    this.trimestre = trimestre;
  }
  public des_vendas with_trimestre(Integer trimestre) {
    this.trimestre = trimestre;
    return this;
  }
  private String nome;
  public String get_nome() {
    return nome;
  }
  public void set_nome(String nome) {
    this.nome = nome;
  }
  public des_vendas with_nome(String nome) {
    this.nome = nome;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof des_vendas)) {
      return false;
    }
    des_vendas that = (des_vendas) o;
    boolean equal = true;
    equal = equal && (this.cliente == null ? that.cliente == null : this.cliente.equals(that.cliente));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.sexo == null ? that.sexo == null : this.sexo.equals(that.sexo));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.quantidade == null ? that.quantidade == null : this.quantidade.equals(that.quantidade));
    equal = equal && (this.valorunitario == null ? that.valorunitario == null : this.valorunitario.equals(that.valorunitario));
    equal = equal && (this.valortotal == null ? that.valortotal == null : this.valortotal.equals(that.valortotal));
    equal = equal && (this.desconto == null ? that.desconto == null : this.desconto.equals(that.desconto));
    equal = equal && (this.produto == null ? that.produto == null : this.produto.equals(that.produto));
    equal = equal && (this.data == null ? that.data == null : this.data.equals(that.data));
    equal = equal && (this.dia == null ? that.dia == null : this.dia.equals(that.dia));
    equal = equal && (this.mes == null ? that.mes == null : this.mes.equals(that.mes));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.trimestre == null ? that.trimestre == null : this.trimestre.equals(that.trimestre));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof des_vendas)) {
      return false;
    }
    des_vendas that = (des_vendas) o;
    boolean equal = true;
    equal = equal && (this.cliente == null ? that.cliente == null : this.cliente.equals(that.cliente));
    equal = equal && (this.estado == null ? that.estado == null : this.estado.equals(that.estado));
    equal = equal && (this.sexo == null ? that.sexo == null : this.sexo.equals(that.sexo));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    equal = equal && (this.quantidade == null ? that.quantidade == null : this.quantidade.equals(that.quantidade));
    equal = equal && (this.valorunitario == null ? that.valorunitario == null : this.valorunitario.equals(that.valorunitario));
    equal = equal && (this.valortotal == null ? that.valortotal == null : this.valortotal.equals(that.valortotal));
    equal = equal && (this.desconto == null ? that.desconto == null : this.desconto.equals(that.desconto));
    equal = equal && (this.produto == null ? that.produto == null : this.produto.equals(that.produto));
    equal = equal && (this.data == null ? that.data == null : this.data.equals(that.data));
    equal = equal && (this.dia == null ? that.dia == null : this.dia.equals(that.dia));
    equal = equal && (this.mes == null ? that.mes == null : this.mes.equals(that.mes));
    equal = equal && (this.ano == null ? that.ano == null : this.ano.equals(that.ano));
    equal = equal && (this.trimestre == null ? that.trimestre == null : this.trimestre.equals(that.trimestre));
    equal = equal && (this.nome == null ? that.nome == null : this.nome.equals(that.nome));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.cliente = JdbcWritableBridge.readString(1, __dbResults);
    this.estado = JdbcWritableBridge.readString(2, __dbResults);
    this.sexo = JdbcWritableBridge.readString(3, __dbResults);
    this.status = JdbcWritableBridge.readString(4, __dbResults);
    this.quantidade = JdbcWritableBridge.readInteger(5, __dbResults);
    this.valorunitario = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.valortotal = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.desconto = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.produto = JdbcWritableBridge.readString(9, __dbResults);
    this.data = JdbcWritableBridge.readDate(10, __dbResults);
    this.dia = JdbcWritableBridge.readInteger(11, __dbResults);
    this.mes = JdbcWritableBridge.readInteger(12, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(13, __dbResults);
    this.trimestre = JdbcWritableBridge.readInteger(14, __dbResults);
    this.nome = JdbcWritableBridge.readString(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.cliente = JdbcWritableBridge.readString(1, __dbResults);
    this.estado = JdbcWritableBridge.readString(2, __dbResults);
    this.sexo = JdbcWritableBridge.readString(3, __dbResults);
    this.status = JdbcWritableBridge.readString(4, __dbResults);
    this.quantidade = JdbcWritableBridge.readInteger(5, __dbResults);
    this.valorunitario = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.valortotal = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.desconto = JdbcWritableBridge.readBigDecimal(8, __dbResults);
    this.produto = JdbcWritableBridge.readString(9, __dbResults);
    this.data = JdbcWritableBridge.readDate(10, __dbResults);
    this.dia = JdbcWritableBridge.readInteger(11, __dbResults);
    this.mes = JdbcWritableBridge.readInteger(12, __dbResults);
    this.ano = JdbcWritableBridge.readInteger(13, __dbResults);
    this.trimestre = JdbcWritableBridge.readInteger(14, __dbResults);
    this.nome = JdbcWritableBridge.readString(15, __dbResults);
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
    JdbcWritableBridge.writeString(cliente, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sexo, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(status, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(quantidade, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valorunitario, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valortotal, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(desconto, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(produto, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(data, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(dia, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mes, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(trimestre, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nome, 15 + __off, 12, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(cliente, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(estado, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sexo, 3 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(status, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(quantidade, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valorunitario, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(valortotal, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(desconto, 8 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(produto, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(data, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(dia, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(mes, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ano, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(trimestre, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(nome, 15 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
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
    if (__dataIn.readBoolean()) { 
        this.produto = null;
    } else {
    this.produto = Text.readString(__dataIn);
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
        this.trimestre = null;
    } else {
    this.trimestre = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.nome = null;
    } else {
    this.nome = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
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
    if (null == this.produto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, produto);
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
    if (null == this.trimestre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.trimestre);
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
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
    if (null == this.produto) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, produto);
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
    if (null == this.trimestre) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.trimestre);
    }
    if (null == this.nome) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nome);
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
    __sb.append(FieldFormatter.escapeAndEnclose(cliente==null?"null":cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sexo==null?"null":sexo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantidade==null?"null":"" + quantidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valorunitario==null?"null":valorunitario.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valortotal==null?"null":valortotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desconto==null?"null":desconto.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(produto==null?"null":produto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data==null?"null":"" + data, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dia==null?"null":"" + dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mes==null?"null":"" + mes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trimestre==null?"null":"" + trimestre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(cliente==null?"null":cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estado==null?"null":estado, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sexo==null?"null":sexo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(quantidade==null?"null":"" + quantidade, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valorunitario==null?"null":valorunitario.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(valortotal==null?"null":valortotal.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desconto==null?"null":desconto.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(produto==null?"null":produto, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data==null?"null":"" + data, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dia==null?"null":"" + dia, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mes==null?"null":"" + mes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ano==null?"null":"" + ano, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trimestre==null?"null":"" + trimestre, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nome==null?"null":nome, delimiters));
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

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.produto = null; } else {
      this.produto = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trimestre = null; } else {
      this.trimestre = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
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

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.produto = null; } else {
      this.produto = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trimestre = null; } else {
      this.trimestre = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.nome = null; } else {
      this.nome = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    des_vendas o = (des_vendas) super.clone();
    o.data = (o.data != null) ? (java.sql.Date) o.data.clone() : null;
    return o;
  }

  public void clone0(des_vendas o) throws CloneNotSupportedException {
    o.data = (o.data != null) ? (java.sql.Date) o.data.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("cliente", this.cliente);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("sexo", this.sexo);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("quantidade", this.quantidade);
    __sqoop$field_map.put("valorunitario", this.valorunitario);
    __sqoop$field_map.put("valortotal", this.valortotal);
    __sqoop$field_map.put("desconto", this.desconto);
    __sqoop$field_map.put("produto", this.produto);
    __sqoop$field_map.put("data", this.data);
    __sqoop$field_map.put("dia", this.dia);
    __sqoop$field_map.put("mes", this.mes);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("trimestre", this.trimestre);
    __sqoop$field_map.put("nome", this.nome);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("cliente", this.cliente);
    __sqoop$field_map.put("estado", this.estado);
    __sqoop$field_map.put("sexo", this.sexo);
    __sqoop$field_map.put("status", this.status);
    __sqoop$field_map.put("quantidade", this.quantidade);
    __sqoop$field_map.put("valorunitario", this.valorunitario);
    __sqoop$field_map.put("valortotal", this.valortotal);
    __sqoop$field_map.put("desconto", this.desconto);
    __sqoop$field_map.put("produto", this.produto);
    __sqoop$field_map.put("data", this.data);
    __sqoop$field_map.put("dia", this.dia);
    __sqoop$field_map.put("mes", this.mes);
    __sqoop$field_map.put("ano", this.ano);
    __sqoop$field_map.put("trimestre", this.trimestre);
    __sqoop$field_map.put("nome", this.nome);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
