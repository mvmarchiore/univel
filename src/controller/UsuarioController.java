package controller;

import model.Usuario;
import dao.UsuarioDAO;

public class UsuarioController {
  private final UsuarioDAO d = new UsuarioDAO();

  public boolean login(String login, String senha) {
    Usuario u = new Usuario();
    u.setLogin(login);
    u.setSenha(login);
    return d.autenticar(u);
  }

  public boolean cadastrar(String login, String senha) {
    Usuario u = new Usuario();
    u.setLogin(login);
    u.setSenha(senha);
    return d.inserir(u);
  }
}
