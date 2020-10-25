package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	public static void showHangSX(String s, ArrayList<DieuHoa> dsDH, int n) {
		boolean check = false;
		System.out.println("---------DANH SACH DIEU HOA CUA HANG "+s+"-------------");
		for(int i = 0; i < n; ++i) {
			if(dsDH.get(i).getTenHangSX().equals(s) == true) {
				dsDH.get(i).xuat();
				check = true;
				System.out.println("-----------------------------");
			}
		}
		if(check==false) {
			System.out.println("Khong co dieu hoa nao cua hang " + s + " o day ca!\n");
		}
	}
	
	public static void showGiaThap(ArrayList<DieuHoa> dsDH, int n) {
		int min = dsDH.get(0).getGiaBan();
		for(int i = 1; i < n; ++i) {
			if(dsDH.get(i).getGiaBan() < min) {
				min = dsDH.get(i).getGiaBan();
			}
		}
		System.out.println("---------------DIEU HOA SIEU RE-------------------");
		for(int i = 0; i < n; ++i) {
			if(dsDH.get(i).getGiaBan() == min) {
				dsDH.get(i).xuat();
				System.out.println("-----------------------------");
			}
		}
	}
	
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("--------------NHAP THONG TIN DANH SACH DIEU HOA--------------");
		System.out.print("Nhap so luong dieu hoa: ");
		n = scan.nextInt();
		ArrayList<DieuHoa> dsDH = new ArrayList<DieuHoa>();
		for(int i = 0; i < n; ++i) {
			System.out.println("\nNhap thong tin dieu hoa thu "+(i+1)+": ");
			DieuHoa dh = new DieuHoa();
			dh.nhap();
			dsDH.add(dh);
		}
		System.out.println("-----------------------------");
		showHangSX("Electrolux", dsDH, n);
		showGiaThap(dsDH,n);
	}
}
