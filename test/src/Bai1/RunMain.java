package Bai1;

import java.util.Scanner;

public class RunMain {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hi^^");
		String s;
		int sum = 0, tich = 1;
		boolean check = false;
		s = scan.nextLine();
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				char a = s.charAt(i);
				int tmp = ((int)a-48);
				sum+= tmp;		
			}
		}
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				char a = s.charAt(i);
				int tmp = ((int)a-48);
				if(sum % tmp == 0) {
					tich *= tmp;
					check = true;
				}
			}
		}
		if(!check) {
			System.out.println("Khong co uoc cua "+sum+" trong chuoi!");
			return;
		}
		else {
			System.out.println(tich);
		}
	}
}
