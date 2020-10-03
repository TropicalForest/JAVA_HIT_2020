package b1;

import java.util.Scanner;

public class b1 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		System.out.print("Nhap a : ");
		a = scan.nextInt();
		System.out.print("Nhap b : ");
		b = scan.nextInt();
		System.out.print("Nhap c : ");
		c = scan.nextInt();
		System.out.println("Max = " + max(a,b,c));
		
	}
	static int max(int a, int b, int c) {
		return ((a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c));
	}
}
