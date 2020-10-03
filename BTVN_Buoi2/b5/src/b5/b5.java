package b5;

import java.util.Scanner;

public class b5 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0, S = 0;
		System.out.print("Enter String : ");
		String c = new String();
		c = scan.nextLine();
		for(int i = 0; i < c.length(); i++) {
			int num = Character.getNumericValue(c.charAt(i));
			if(num >= 0 && num <= 9) {
				S+= num;
				count++;
			}
		}
		System.out.println("average = " + ((float)S/count ));
	}
}
