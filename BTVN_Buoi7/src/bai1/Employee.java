package bai1;
import java.util.Scanner;

public class Employee extends Person{
	public static Scanner scan = new Scanner(System.in);
	private int salary;
	@Override
	public void display() {
		System.out.println("Employee name: " + getName());
		System.out.println("Employee address: " + getAddress());
		System.out.println("Employee salary: " + this.salary);
	}

	public Employee(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
	}
	
	
}
