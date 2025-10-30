package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Usuario {
  private int id;
  private String login;
  private String senha;
  private String dataCriacao;
  private String tipo;
  private String ativo;

  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getLogin() { return login; }
  public void setLogin(String login) { this.login = login; }

  public String getSenha() { return senha; }
  public void setSenha(String senha) { this.senha = senha; }

  public String getTipo() { return tipo; }
  public void setTipo(String tipo) { this.tipo = tipo; }

  public String getAtivo() { return ativo; }
  public void setAtivo(String ativo) { this.ativo = ativo; }

  public String getDataCriacao(){ return dataCriacao; }
  public void setDataCriacao(LocalDateTime localDateTime) { 
    throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
  }
  public void setDataCriacao(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
  }
  public void setDataCriacao(Timestamp timestamp) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setDataCriacao'");
  }
}
