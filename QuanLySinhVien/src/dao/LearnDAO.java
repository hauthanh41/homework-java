package dao;

import util.DatabaseUtil;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LearnDAO {
  public boolean addStudentToClass (int studentID, int classID) {
    String sql = "INSERT INTO Learn (StudentID, ClassID) VALUES (?, ?)";

    try {
      Connection conn = DatabaseUtil.getConnection();
      PreparedStatement stm = conn.prepareStatement(sql);
      stm.setInt(1, studentID);
      stm.setInt(2, classID);

      return stm.executeUpdate() > 0;
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public List<String> getStudentsInClass (int classID) {
    List<String> students = new ArrayList<>();
    String sql = "SELECT s.name FROM Student s JOIN Learn l ON s.StudentID = l.StudentID WHERE l.CLassID = ?";
     try {
       Connection conn = DatabaseUtil.getConnection();
       PreparedStatement stm = conn.prepareStatement(sql);
       stm.setInt(1, classID);
       ResultSet res = stm.executeQuery();

       while ( res.next()) {
         students.add(res.getString("name"));
       }
     } catch (SQLException e) {
       e.printStackTrace();
     }

     return students;
  }
}
