package model;

public class Teacher {

	private int teacherID;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getteacherID() {
		return teacherID;
	}
	public void setteacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public Teacher(String name, int teacherID) {
		super();
		this.name = name;
		this.teacherID = teacherID;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + "- name=" + name + "]";
	}

	
	
}
