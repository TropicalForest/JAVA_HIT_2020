package Bai2;

import java.util.Scanner;

public class Book extends Document{
	private int numOfPage;
	private String author;
	
	
	
	public Book() {
		super();
	}

	public void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------NHAP VAO THONG TIN SACH--------------");
		super.Input();
		System.out.print("Nhap vao so trang: ");
		numOfPage = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhap vao ten tac gia: ");
		author = scan.nextLine();
	}
	
	public void Output() {
		super.Output();
		System.out.println("So trang: "+numOfPage);
		System.out.println("Ten tac gia: "+author);
		System.out.println("-----");
	}
	
	public Book(int id, String name, String publisher, int price, int numOfPage, String author) {
		super(id, name, publisher, price);
		this.numOfPage = numOfPage;
		this.author = author;
	}

	public Book(int id, String name, String publisher, int price) {
		super(id, name, publisher, price);
	}


	public int getNumOfPage() {
		return numOfPage;
	}

	public void setNumOfPage(int numOfPage) {
		this.numOfPage = numOfPage;
	}


	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
