package main;

import dao.LearnDAO;
import dao.StudentDAO;
import model.Learn;
import model.Student;
import util.DatabaseUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
  private static Scanner scanner = new Scanner(System.in);
  private static StudentDAO studentDAO = new StudentDAO();
  private static LearnDAO learnDAO = new LearnDAO();

  public static void main(String[] args) {
    boolean condition = true;
    while ( condition) {
      System.out.println("\nStudent Management System");
      System.out.println("1. Add Student");
      System.out.println("2. Login");
      System.out.println("3. Add Student to Class");
      System.out.println("4. List Students in Class");
      System.out.println("5. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          addStudent();
          break;
        case 2:
          login();
          break;
        case 3:
          addStudentToClass();
          break;
        case 4:
          listStudentsInClass();
          break;
        case 5:
          condition = false;
          break;
        default:
          System.out.println("Invalid option!");
      }
    }
  }

  public static void addStudent() {
    System.out.print("Enter student name: ");
    String name = scanner.nextLine();

    System.out.print("Enter student age: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter student GPA: ");
    float gpa = scanner.nextFloat();
    scanner.nextLine();

    Student student = new Student(name, age, gpa);
    if (studentDAO.addStudent(student)) {
      System.out.println("Student added successfully!");
    } else {
      System.out.println("Failed to add student!");
    }
  }

  public static void login() {
    System.out.print("Enter your email: ");
    String email = scanner.nextLine();

    Student student = studentDAO.login(email);
    if (student != null) {
      System.out.println("Login successful! Welcome " + student.getName());
    } else {
      System.out.println("Login failed! Email not found.");
    }
  }

  public static void addStudentToClass() {
    System.out.print("Enter student ID: ");
    int studentID = scanner.nextInt();

    System.out.print("Enter class ID: ");
    int classID = scanner.nextInt();

    if (learnDAO.addStudentToClass(studentID, classID)) {
      System.out.println("Student added to class successfully!");
    } else {
      System.out.println("Failed to add student to class!");
    }
  }

  public static void listStudentsInClass() {
    System.out.print("Enter class ID: ");
    int classID = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    List<String> students = learnDAO.getStudentsInClass(classID);
    System.out.println("\nStudents in class " + classID + ":");
    for (String student : students) {
      System.out.println("- " + student);
    }
  }
}