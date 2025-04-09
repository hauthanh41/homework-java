package dao;

import model.Student;
import util.DatabaseUtil;
import util.EmailUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

  public boolean addStudent (Student student) {
    try {
      String email = EmailUtil.generateEmail(student.getName());
      student.setEmail(email);

      String sql = "INSERT INTO Student (name, age, email, gpa) VALUES (?, ?, ?, ?)";

      try (Connection conn = DatabaseUtil.getConnection();
           PreparedStatement stm = conn.prepareStatement(sql)) {

        stm.setString(1, student.getName());
        stm.setInt(2, student.getAge());
        stm.setString(3, email);
        stm.setFloat(4, student.getGpa());

        System.out.println("[DEBUG] Đang thực thi SQL...");
        int rows = stm.executeUpdate();
        return rows > 0;
      }
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public void loadStudent (Student student) {
    String sql = "SELECT name, age, email, gpa FROM Student WHERE id = ?";

    try {
      Connection conn = DatabaseUtil.getConnection();
      PreparedStatement stm = conn.prepareStatement(sql);
      stm.setInt(1, student.getStudentID());

      ResultSet res = stm.executeQuery();
      if ( res.next()) {
        System.out.println("Name: " + res.getString("name"));
        System.out.println("Age: " + res.getInt("age"));
        System.out.println("Email: " + res.getString("email"));
        System.out.println("Gpa: " + res.getFloat("gpa"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public boolean updateStudent (Student student) {
    String sql = "UPDATE Student SET name = ?, age = ?, email = ?, gpa = ? WHERE id = ?";
    try {
      Connection conn = DatabaseUtil.getConnection();
      PreparedStatement stm = conn.prepareStatement(sql);

      stm.setString(1, student.getName());
      stm.setInt(2, student.getAge());
      stm.setString(3, student.getEmail());
      stm.setFloat(4, student.getGpa());

      int rowsUpdated = stm.executeUpdate();
      return rowsUpdated > 0;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean deleteStudent (Student student) {
    String sql = "DELETE Student WHERE id = ?";

    try {
      Connection conn = DatabaseUtil.getConnection();
      PreparedStatement stm = conn.prepareStatement(sql);
      stm.setInt(1, student.getStudentID());

      int rowsDeleted = stm.executeUpdate();
      return rowsDeleted > 0;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public Student login (String email) {
    String sql = "SELECT * FROM Student WHERE email = ?";

    try {
      Connection conn = DatabaseUtil.getConnection();
      PreparedStatement stm = conn.prepareStatement(sql);
      stm.setString(1, email);
      ResultSet res = stm.executeQuery();

      if ( res.next()) {
        Student student = new Student();
        student.setStudentID(res.getInt("StudentID"));
        student.setName(res.getString("name"));
        student.setAge(res.getInt("age"));
        student.setEmail(res.getString("email"));
        student.setGpa(res.getFloat("gpa"));
        return student;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
