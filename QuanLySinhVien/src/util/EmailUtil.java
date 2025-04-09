package util;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class EmailUtil {
  public static String generateEmail (String fullName) {
    try {
      String normalized = Normalizer.normalize(fullName, Normalizer.Form.NFD)
              .replaceAll("[^\\p{ASCII}]", "") // Xóa dấu
              .toLowerCase()
              .trim();

      String[] parts = normalized.split("\\s+");

      if (parts.length >= 2) {
        String ten = parts[parts.length - 1];
        String hoDem = "";

        for (int i = 0; i < parts.length - 1; i++) {
          if (!parts[i].isEmpty()) {
            hoDem += parts[i].charAt(0);
          }
        }

        return ten + hoDem + "@gmail.com";
      }

      return normalized.replaceAll("\\s+", "") + "@gmail.com";

    } catch (Exception e) {
      System.err.println("Lỗi tạo email: " + e.getMessage());
      return "unknown@gmail.com";
    }
  }
}
