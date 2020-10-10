package Array;

import java.util.Scanner;

public class RunMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Array arr1 = new Array();
		Array arr2 = new Array();
//		int n,m;
//		System.out.print("Nhap sl phan tu arr1: ");
//		n = scan.nextInt();
//		System.out.print("Nhap sl phan tu arr2: ");
//		m = scan.nextInt();
//		
//		arr1.setN(n);
//		arr2.setN(m);
		
		arr1.InputData();
		arr2.InputData();
		
		if((arr1.Sum()/arr1.getN()) > arr2.Sum()/arr2.getN()) {
			System.out.println("The bigger is average of arr1 = " + (arr1.Sum()/arr1.getN()));
		}
		else if((arr1.Sum()/arr1.getN()) == arr2.Sum()/arr2.getN()) {
			System.out.println("Hi");
		}
		else {
			System.out.println("The bigger is average of arr2 = " + (arr2.Sum()/arr2.getN()));
		}

	}
}
