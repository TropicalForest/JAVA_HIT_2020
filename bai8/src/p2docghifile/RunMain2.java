package p2docghifile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

//doc file
public class RunMain2 {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(Paths.get("ga.txt"));
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
