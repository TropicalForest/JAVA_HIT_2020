package bai1;
import java.util.Scanner;

public class Customer extends Person{
	public static Scanner scan = new Scanner(System.in);
	private int balance;

	
	@Override
	public void display() {
		System.out.println("Customer name: " + getName());
		System.out.println("Customer address: " + getAddress());
		System.out.println("Customer balance: " + this.balance);
	}


	public Customer(String name, String address, int balance) {
		super(name, address);
		this.balance = balance;
	}
	
}
