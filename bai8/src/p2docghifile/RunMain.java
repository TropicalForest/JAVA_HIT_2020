package p2docghifile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RunMain {
	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("ga.txt",true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(bufferWriter);
			
			printWriter.println("oh yeah");
			
			printWriter.close();
			bufferWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
