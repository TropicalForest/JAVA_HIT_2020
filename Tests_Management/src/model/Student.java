package model;

public class Student {
	private int studentID;
	private String name;
	private String classOfStudent;
	private int yearCourse;
	
	
	
	
	public long getstudentID() {
		return studentID;
	}
	public void setstudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassOfStudent() {
		return classOfStudent;
	}
	public void setClassOfStudent(String classOfStudent) {
		this.classOfStudent = classOfStudent;
	}
	public int getYearCourse() {
		return yearCourse;
	}
	public void setYearCourse(int yearCourse) {
		this.yearCourse = yearCourse;
	}
	public Student(int studentID, String name, String classOfStudent, int yearCourse) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.classOfStudent = classOfStudent;
		this.yearCourse = yearCourse;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + "- name=" + name + "- classOfStudent=" + classOfStudent
				+ "- yearCourse=" + yearCourse + "]";
	}
	
	
	
	
}
