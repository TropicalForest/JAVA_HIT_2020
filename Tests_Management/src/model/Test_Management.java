package model;
//
//import java.util.ArrayList;


public class Test_Management {
	private Student student;
	private Teacher examiner;
	private Test test;
	private int test_management_code;
	private int mark;
	private boolean violatingRules;
	
	
	private String convertBooleanToString(boolean a) {
	if(a==true)
		return "yes";
	else
		return "no";
	}
	private boolean convertStringToBoolean(String a) {
		if(a=="yes")
			return true;
		else
			return false;
	}
	
	public Test_Management(Student student, Teacher examiner, Test test, int test_management_code, int mark,
			String violatingRules) {
		super();
		this.student = student;
		this.examiner = examiner;
		this.test = test;
		this.test_management_code = test_management_code;
		this.mark = mark;
		this.violatingRules = convertStringToBoolean(violatingRules);
	}
	public Test_Management() {
		super();
	}
	
	public int getTest_management_code() {
		return test_management_code;
	}

	public void setTest_management_code(int test_management_code) {
		this.test_management_code = test_management_code;
	}

	public Teacher getExaminer() {
		return examiner;
	}
	public void setExaminer(Teacher examiner) {
		this.examiner = examiner;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}

	public boolean isViolatingRules() {
		return violatingRules;
	}
	public String getViolatingRules() {
		return convertBooleanToString(this.violatingRules);
	}
	public void setViolatingRules(String violatingRules) {
		this.violatingRules = convertStringToBoolean(violatingRules);
	}

	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Test_Management [student=" + student + ", examiner=" + examiner + ", test=" + test
				+ ", test_management_code=" + test_management_code + ", mark=" + mark + ", violatingRules="
				+ convertBooleanToString(violatingRules) + "]";
	}
	
	

	
	
	
	
	
	
}
