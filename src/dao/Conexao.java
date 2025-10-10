package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  private static final String URL = "jdbc:mysql://localhost:3306/univel?useSSL=false&serverTimezone=UTC";
  private static final String USER = "root"; // Usuário do MySQL
  private static final String PASSWORD = "1234"; // Senha do MySQL

  public static Connection conectar() {
    Connection conexao = null;
    try {
      // Carrega explicitamente o driver JDBC do MySQL
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Tenta conectar
      conexao = DriverManager.getConnection(URL, USER, PASSWORD);
      System.out.println("Conectado com sucesso ao MySQL!"); // Mensagem terminal
    } catch (ClassNotFoundException e) {
      System.out.println("Driver do JDBC do MySQL não encontrado: " + e.getMessage());
    } catch (SQLException e) {
      System.out.println("Erro ao conectar: " + e.getMessage());
    }
    return conexao;
  }
}
