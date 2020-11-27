package Exam_Manager;

public class Teacher {
	private String name;
	private long teacherCode;
	private String room;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(long teacherCode) {
		this.teacherCode = teacherCode;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Teacher(String name, long teacherCode, String room) {
		super();
		this.name = name;
		this.teacherCode = teacherCode;
		this.room = room;
	}
	public Teacher() {
		super();
	}
	
	
}
