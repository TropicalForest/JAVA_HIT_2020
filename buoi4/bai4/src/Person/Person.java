package Person;

import java.util.Scanner;

public class Person {
	private String name;
	private Date date;
	private String gender;
	private Hobby hobby;
	
	
	public void show() {
		System.out.print("Name: " + name + " - ");
		System.out.print("gender: " + gender + " - ");
		hobby.ShowHobby();
		date.showDate();
	}
	public void show(int stt) {
		System.out.print("Name: " + name + " - ");
		System.out.print("gender: " + gender + " - ");
		hobby.ShowHobby();
		date.showDate();
	}
	public void InputInfo() {
		date = new Date();
		hobby = new Hobby();
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ten: ");
		name = scan.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gender = scan.nextLine();
		date.InputDate();
		hobby.InputHobby();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Hobby getHobby() {
		return hobby;
	}

	public void setHobby(Hobby hobby) {
		this.hobby = hobby;
	}

	public Person() {
		super();
	}

	public Person(String name, Date date, String gender, Hobby hobby) {
		super();
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.hobby = hobby;
	}
	
	
	
	
}
