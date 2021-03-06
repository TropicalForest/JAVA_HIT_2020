package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVien {
	static Scanner scan = new Scanner(System.in);
	private static int id = 0;
	private String name;
	private String address;
	private int age;
	private int gpa;
	
	
	public ArrayList<SinhVien> add(ArrayList<SinhVien> sv, int n) {
		SinhVien svtmp = new SinhVien();
		svtmp.nhap();
		sv.add(svtmp);
		return sv;
	}
	
	@SuppressWarnings("static-access")
	public ArrayList<SinhVien> editById(ArrayList<SinhVien> sv, int n) {
		System.out.print("Nhap vao id can tim: ");
		int a;
		a = scan.nextInt();
		boolean check=false;
		for(int i = 0; i <n ; ++i) {
			if(sv.get(i).getId() == a) {
				sv.get(i).nhap();
				check=true;
			}
		}
		if(!check) {
			System.out.println("Lam gi co ai co id = "+a);
		}
		return sv;
	}
	
	@SuppressWarnings("static-access")
	public ArrayList<SinhVien> deleteById(ArrayList<SinhVien> sv, int n) {
		System.out.print("Nhap vao id can tim: ");
		int a;
		a = scan.nextInt();
		boolean check = false;
		for(int i = 0; i <n ; ++i) {
			if(a==sv.get(i).getId()) {
				SinhVien tmp = sv.get(i+i);
				sv.set(i, tmp);
				id--;
				check=true;
			}
		}
		if(!check) {
			System.out.println("Lam gi co ai co id = "+a);
		}
		return sv;
	}
	
	
	
	public ArrayList<SinhVien> sortByGPA(ArrayList<SinhVien> sv, int n) {
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				if(sv.get(i).getGpa() < sv.get(j).getGpa()) {
					SinhVien tmp = sv.get(i);
					sv.set(i, sv.get(j));
					sv.set(j, tmp);
				}
			}
		}
		return sv;
	}
	
	
	public ArrayList<SinhVien> sortByName(ArrayList<SinhVien> sv, int n) {
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				if( sv.get(i).getName().compareTo(sv.get(j).getName()) < 0 ) {
					SinhVien tmp = sv.get(i);
					sv.set(i, sv.get(j));
					sv.set(j, tmp);
				}
			}
		}
		return sv;
	}
	
	
	public SinhVien(String name, String address, int age, int gpa) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gpa = gpa;
	}
	public SinhVien() {
		super();
		id++;
	}

	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		SinhVien.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	public void nhap() {
		System.out.print("Nhap vao ten hoc sinh: ");
		name = scan.nextLine();
		System.out.print("Nhap vao tuoi: ");
		age = scan.nextInt();
		System.out.print("Nhap vao dia chi: ");
		address = scan.nextLine();
		System.out.print("Nhap vao diem trung binh: ");
		gpa = scan.nextInt();
		
	}
	public String xuat() {
		return "Name=" + name + ", address=" + address + ", age=" + age + ", gpa=" + gpa;
	}
}
