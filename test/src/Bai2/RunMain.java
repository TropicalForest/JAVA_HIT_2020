package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static Scanner scan = new Scanner(System.in);
	public static void Add(ArrayList<Book> listBook) {
		Book b = new Book();
		b.Input();
		listBook.add(b);
	}
	
	public static void EditById(ArrayList<Book> listBook) {
		int n;
		System.out.print("Nhap vao id can tim: ");
		n = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < listBook.size(); ++i) {
			if(listBook.get(i).getId()==n) {
				listBook.get(i).Input();
				check = true;
			}
		}
		if(!check) {
			System.out.println("Oh no, ko co sach nao co id "+n);
		}
	}
	
	public static void DeleteById(ArrayList<Book> listBook) {
		int n;
		System.out.print("Nhap vao id can xoa: ");
		n = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < listBook.size(); ++i) {
			if(listBook.get(i).getId()==n) {
				listBook.remove(i);
				check = true;
			}
		}
		if(!check) {
			System.out.println("Oh no, ko co sach nao co id "+n);
		}
	}
	
	public static void SortByName(ArrayList<Book> listBook) {
		for(int i = 0; i < listBook.size(); ++i) {
			for(int j = i+1; j < listBook.size(); ++j) {
				if(listBook.get(i).getName().compareTo(listBook.get(j).getName()) < 0) {
					Book tmp = listBook.get(i);
					listBook.set(i,listBook.get(j));
					listBook.set(j,tmp);
				}
			}
		}
	}
	
	
	public static void SortByPriece(ArrayList<Book> listBook) {
		for(int i = 0; i < listBook.size(); ++i) {
			for(int j = i+1; j < listBook.size(); ++j) {
				if(listBook.get(i).getPrice() > listBook.get(j).getPrice()) {
					Book tmp = listBook.get(i);
					listBook.set(i,listBook.get(j));
					listBook.set(j,tmp);
				}
			}
		}
	}
	
	public static void Show(ArrayList<Book> listBook) {
		for(Book book : listBook) {
			book.Output();
		}
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		int option=-5;
		ArrayList<Book> listBook = new ArrayList<Book>();

			System.out.println("/*************************/");
			System.out.println("1.Add book.");
			System.out.println("2.Edit book by id.");
			System.out.println("3.Delete book by id.");
			System.out.println("4.Sort book by name.");
			System.out.println("5.Sort book by price.");
			System.out.println("6.Show all books.");
			System.out.println("0.Exit.");
			System.out.println("/*************************/");
		while(option!=0) {
			System.out.print("\nNhap vao lua chon cua ban: ");
			option = scan.nextInt();
			
			switch(option) {
				case 1:
					Add(listBook);
					break;
				case 2:
					EditById(listBook);
					break;
				case 3:
					DeleteById(listBook);
					break;
				case 4:
					SortByName(listBook);
					break;
				case 5:
					SortByPriece(listBook);
					break;
				case 6:
					Show(listBook);
					break;
				case 0:
					return;
				default:
					System.out.print("Oh no, lam gi co nua chon lay, xin moi nhap lai");
					break;
			}

			
		}
	}
}
