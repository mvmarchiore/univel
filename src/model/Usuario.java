package model;

public class Usuario {
  private int id;
  private String login;
  private String senha;
  private String dataCriacao;

  public int getId() { return id; }
  public void setId(int id) { this.id = id; }

  public String getLogin() { return login; }
  public void setLogin(String login) { this.login = login; }

  public String getSenha() { return senha; }
  public void setSenha(String senha) { this.senha = senha; }

  public String getDataCriacao(){ return dataCriacao; }
  public void setDataCriacao(String dataCriacao) { this.dataCriacao = dataCriacao; }
}
