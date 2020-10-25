package bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class RunMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Collections ds;
		ArrayList<KySu> dsKS = new ArrayList<KySu>();
		int n;
		System.out.print("Nhap so luong ky su: ");
		n = scan.nextInt();
		System.out.println("----------NHAP THONG TIN KY SU----------");	
		for(int i = 0; i < n; ++i) {
			System.out.println("\nNhap thong tin ky su thu "+(i+1)+": ");
			KySu ks = new KySu();
			ks.nhap();
			dsKS.add(ks);
		}
		System.out.println("----------DANH SACH KY SU----------");
		for(int i = 0; i < n; ++i) {
			System.out.println("\nThong tin KS"+(i+1)+": ");
			dsKS.get(i).xuat();
			System.out.println("---------------------------------------");
		}
		int max = dsKS.get(0).getNamTN();
		for(int i = 1; i < n; ++i) {
			if(dsKS.get(i).getNamTN() > max) {
				max = dsKS.get(i).getNamTN();
			}
		}
		
		for(int i = 0; i < n; ++i) {
			System.out.println("----------DANH SACH KY SU TOT NGHIEP GAN NHAT----------");
			if(dsKS.get(i).getNamTN() == max) {
				System.out.println("\nThong tin KS"+(i+1)+": ");
				dsKS.get(i).xuat();
				System.out.println("---------------------------------------");
			}
		}
		
	}
}
