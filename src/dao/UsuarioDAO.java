package dao;

import model.Usuario;
import util.Funcoes;
import java.sql.*;
import java.time.LocalDateTime;

public class UsuarioDAO {
  public boolean autenticar(Usuario usuario) {
    String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha_hash = ?";
    try (Connection conn = Conexao.conectar();
      PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, usuario.getLogin());
        stmt.setString(2, Funcoes.gerarHashSHA256(usuario.getSenha()));

        ResultSet rs = stmt.executeQuery();
        return rs.next();
      } catch (SQLException e) {
        System.out.println("Erro ao autenticar: " + e.getMessage());
        return false;
      }
  }

  // Atenção: este método deve existir
  public boolean inserir(Usuario usuario) {
    String sql = "INSERT INTO usuarios (nome_usuario, senha_hash, data_criacao) VALUES (?, ?, ?)";
    try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, usuario.getLogin());
        stmt.setString(2, Funcoes.gerarHashSHA256(usuario.getSenha()));
        stmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

        stmt.executeUpdate();
        System.out.println("Usuário cadastrado com sucesso!");
        return true;
      } catch (SQLException e) {
        System.out.println("Erro ao inserir usuário: " + e.getMessage());
        return false;
    }
  }
}
