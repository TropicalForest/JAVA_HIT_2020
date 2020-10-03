package b6;

import java.util.Scanner;

public class b6 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String str = new String();
		System.out.print("Enter string : ");
		str = scan.nextLine();
		
		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		System.out.print(String.valueOf(str.charAt(0)).toUpperCase());
		for(int i = 1; i < str.length(); i++) {
			if( (str.charAt(i)!=' ') && (str.charAt(i-1)==' ') ) {
				System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
            }    
            else {
                System.out.print(str.charAt(i));
            }
                    
		}   
	}
				
}


	

	

