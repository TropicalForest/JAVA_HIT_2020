package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList <SinhVien> dsSv = new ArrayList<SinhVien>();
		
		int option;
		System.out.println("/***********************************************/");
		System.out.println("1.Add student.");
		System.out.println("2.Edit student by id.");
		System.out.println("3.Delete student by id.");
		System.out.println("4.Sort student by gpa.");
		System.out.println("5.Sort student by name.");
		System.out.println("6.Show student.");
		System.out.println("0.Exit.");
		System.out.println("/***********************************************/");
		System.out.println("Nhap vao lua chon cua ban: ");
		option = scan.nextInt();
		while(option!=0) {
			switch(option) {
				case 1:
					SinhVien svt = new SinhVien();
					System.out.println("\nNhap vao thong tin sinh vien : " );
					svt.nhap();
					dsSv.add(svt);
				case 2:
					
			}
		}





		
		
		
		
		
		
		
		
		
		
	}
}
