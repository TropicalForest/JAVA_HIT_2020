package model;

public class Test {
	private int examCode;
	private int amountOfQuestion;
	private String subject;
	private int subjectCode;

	
	public Test(int examCode, int amountOfQuestion, String subject,  int subjectCode) {
		super();
		this.examCode = examCode;
		this.amountOfQuestion = amountOfQuestion;
		this.subject = subject;
		this.subjectCode = subjectCode;
	}
	public Test() {
		super();
	}
	public int getexamCode() {
		return examCode;
	}
	public void setexamCode(int examCode) {
		this.examCode = examCode;
	}
	public int getAmountOfQuestion() {
		return amountOfQuestion;
	}
	public void setAmountOfQuestion(int amountOfQuestion) {
		this.amountOfQuestion = amountOfQuestion;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}

	@Override
	public String toString() {
		return "Test [examCode=" + examCode + "- amountOfQuestion=" + amountOfQuestion + "- answerOfQuestion="
				+ "- subject=" + subject + "- subjectCode=" + subjectCode+ "]";
	}
	

	


	
	
	
	
	
	
	
}
