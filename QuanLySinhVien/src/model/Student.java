package model;

public class Student {
  private int studentID;
  private String name;
  private int age;
  private String email;
  private float gpa;

  public Student () {

  }

  public Student (String name, int age, float gpa) {
    this.name = name;
    this.age = age;
    this.gpa = gpa;
  }

  public int getStudentID() {
    return studentID;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }

  public float getGpa() {
    return gpa;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGpa(float gpa) {
    this.gpa = gpa;
  }

  @Override
  public String toString() {
    return "Studen{id:" + studentID + ",name:" + name + ",age:" + age +
            ",email:" + email + ",gpa:" + gpa + "}";
  }
}
