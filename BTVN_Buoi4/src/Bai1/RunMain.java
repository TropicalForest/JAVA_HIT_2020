package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao so luong sach: ");
		n = scan.nextInt();
		
		ArrayList<Sach> list = new ArrayList<Sach>(n);
		
		for(int i= 0; i < n; i++) {
			Sach sach = new Sach();
			System.out.println("Nhap thong tin sach " + (i+1));
			sach.Nhap();
			list.add(sach);
		}
		for(int i = 0;  i < n; i++) {
			System.out.print("Sach " + (i+1) +": ");
			System.out.println(list.get(i).toString());
		}
	}
}