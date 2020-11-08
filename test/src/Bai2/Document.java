package Bai2;

import java.util.Scanner;

public class Document {
	private int id = 0;
	private String name;
	private String publisher;
	private int price;
	
	
	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao id: ");
		id = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap vao ten tai lieu: ");
		name = scan.nextLine();
		System.out.print("Nhap vao nxb: ");
		publisher = scan.nextLine();
		System.out.print("Nhap vao gia: ");
		price = scan.nextInt();
		scan.nextLine();
	}
	public void Output() {
		System.out.println("\nId: "+id);
		System.out.println("Ten tai lieu: "+name);
		System.out.println("Nxb: "+publisher);
		System.out.println("Gia: "+price);

	}	
	
	public Document(int id, String name, String publisher, int price) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}
	public Document() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
