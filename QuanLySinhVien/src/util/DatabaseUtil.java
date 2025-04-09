package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
  private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=universityms;encrypt=false;trustServerCertificate=true;loginTimeout=10";
  private static final String user = "sa";
  private static final String password = "20022004";

  public static Connection getConnection () throws SQLException {
    return DriverManager.getConnection(url, user, password);
  }
}
