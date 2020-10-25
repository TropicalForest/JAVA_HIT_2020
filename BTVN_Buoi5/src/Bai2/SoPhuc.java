package Bai2;

import java.util.Scanner;

public class SoPhuc {
	static Scanner scan = new Scanner(System.in);
	private int thuc;
	private int ao;
	
	public SoPhuc(int thuc, int ao) {
		super();
		this.thuc = thuc;
		this.ao = ao;
	}

	public void nhap() {
		System.out.print("Nhap phan thuc: ");
		thuc = scan.nextInt();
		System.out.print("Nhap phan ao: ");
		ao = scan.nextInt();
	}
	public String xuat() {
		return thuc+"+"+ao+"i";
	}
	
	public SoPhuc cong(SoPhuc sp1, SoPhuc sp2) {
		SoPhuc result = new SoPhuc();
		this.thuc = sp1.thuc+sp2.thuc;
		this.ao = sp1.ao+sp2.ao;
		return result;
	}
	public SoPhuc tru(SoPhuc sp1, SoPhuc sp2) {
		SoPhuc result = new SoPhuc();
		this.thuc = sp1.thuc-sp2.thuc;
		this.ao = sp1.ao-sp2.ao;
		return result;
	}
	public SoPhuc() {
	}
	public int getThuc() {
		return thuc;
	}
	public void setThuc(int thuc) {
		this.thuc = thuc;
	}
	public int getAo() {
		return ao;
	}
	public void setAo(int ao) {
		this.ao = ao;
	}
	
	
}
