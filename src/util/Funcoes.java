package util;

import java.security.MessageDigest;

public class Funcoes {
  public static String gerarHashSHA256 (String senha) {
    try {
      MessageDigest digest = MessageDigest.getInstance("SHA-256");
      byte[] hashBytes = digest.digest(senha.getBytes("UTF-8"));

      // Converte bytes para hexadecimal
      StringBuilder sb = new StringBuilder();
      for (byte b : hashBytes) {
        sb.append(String.format("%02x", b));
      }
      return sb.toString();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
