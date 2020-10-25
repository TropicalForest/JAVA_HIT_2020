package Bai8;

import java.util.ArrayList;
import java.util.Scanner;


public class RunMain {
	static Scanner scan = new Scanner(System.in);
	
	public static ArrayList<SinhVien> add(ArrayList<SinhVien> sv) {
		SinhVien svtmp = new SinhVien();
		svtmp.nhap(sv);
		sv.add(svtmp);
		return sv;
	}	
	
	public static ArrayList<SinhVien> editById(ArrayList<SinhVien> sv) {
		System.out.print("Nhap vao id can tim: ");
		int a;
		a = scan.nextInt();
		boolean check=false;
		for(int i = 0; i < sv.size() ; ++i) {
			if(sv.get(i).getId() == a) {
				sv.get(i).nhap(sv);
				check=true;
			}
		}
		if(!check) {
			System.out.println("Lam gi co ai co id = "+a);
		}
		return sv;
	}
	
	public static ArrayList<SinhVien> deleteById(ArrayList<SinhVien> sv) {
		System.out.print("Nhap vao id can tim: ");
		int a;
		a = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < sv.size() ; ++i) {
			if(a==sv.get(i).getId()) {
				sv.set(i, sv.get(i+1));
				sv.get(i).setId(sv.get(i+1).getId());
				check=true;
			}
		}
		if(!check) {
			System.out.println("Lam gi co ai co id = "+a);
		}
		return sv;
	}
	
	public static ArrayList<SinhVien> sortByGPA(ArrayList<SinhVien> sv) {
		for(int i = 0; i < sv.size() ; ++i) {
			for(int j = i+1; j < sv.size() ; ++j) {
				if(sv.get(i).getGpa() < sv.get(j).getGpa()) {
					SinhVien tmp = sv.get(i);
					sv.set(i, sv.get(j));
					sv.set(j, tmp);
				}
			}
		}
		return sv;
	}

	public static ArrayList<SinhVien> sortByName(ArrayList<SinhVien> sv) {
		for(int i = 0; i < sv.size(); ++i) {
			for(int j = i+1; j < sv.size(); ++j) {
				if( sv.get(i).getName().compareTo(sv.get(j).getName()) < 0 ) {
					SinhVien tmp = sv.get(i);
					sv.set(i, sv.get(j));
					sv.set(j, tmp);
				}
			}
		}
		return sv;
	}
	public static void show(ArrayList<SinhVien> sv) {
		System.out.println("------------THONG TIN CAC HOC SINH------------");
		for(int i = 0; i < sv.size(); ++i) {
			System.out.println("Thong tin sv thu "+(i+1)+" :");
			sv.get(i).xuat();
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList <SinhVien> dsSv = new ArrayList<SinhVien>();
		
		int option=-7;
		System.out.println("/***********************************************/");
		System.out.println("1.Add student.");
		System.out.println("2.Edit student by id.");
		System.out.println("3.Delete student by id.");
		System.out.println("4.Sort student by gpa.");
		System.out.println("5.Sort student by name.");
		System.out.println("6.Show student.");
		System.out.println("0.Exit.");
		System.out.println("/***********************************************/");

		while(option!=0) {
			System.out.print("Nhap vao lua chon cua ban: ");
			option = scan.nextInt();
			switch(option) {
				case 0:
					return;
				case 1:
					add(dsSv);
					break;
				case 2:
					editById(dsSv);
					break;
				case 3:
					deleteById(dsSv);
					break;
				case 4:
					sortByGPA(dsSv);
					break;
				case 5:
					sortByName(dsSv);
					break;
				case 6:
					show(dsSv);
					break;
				default:
					System.out.print("Oh no, lam gi co lua chon nay, nhap lai di");
					break;
				
			}
			System.out.println("\n-----------DONE---------------\n");
		}


		
	}
}
