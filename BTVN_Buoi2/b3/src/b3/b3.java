package b3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b3 {

	static Scanner scan = new Scanner(System.in);
	
	
	static void set(Integer arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("a["+i+"] = ");
			arr[i] = scan.nextInt();
		}
	}
	
	
	static void get(Integer arr[]) {
		System.out.print("\tYour array : \n \t" );
		for(int i = 0; i < arr.length; i++) {
			System.out.print("\t"+arr[i]+"\t");
		}
	}	
	

	static Integer[] insert(Integer arr[], int k, int x) {
		int lenght = arr.length;
		Integer [] dest = new Integer [lenght+1];
		System.arraycopy(arr, 0, dest, 0, k);
		dest[k] = x;
		System.arraycopy(arr, k, dest, k+1, lenght-k);
		return dest;
	}
	
	
	static Integer[] delete(Integer arr[], int k) {
		int lenght = arr.length-1;
		Integer [] dest = new Integer [lenght];
		System.arraycopy(arr, 0, dest, 0, k);
		System.arraycopy(arr, k+1, dest, k, lenght-k);
		return dest;
	}
	
	//	1 2 3 4 5
	//	1 2
	//	1 2 4 5
	
	static Integer[] reverse(Integer arr[]) {
		Integer [] dest = new Integer [arr.length];
		int j = arr.length;
		for(int i = 0; i < arr.length; ++i) {
			dest[j-1] = arr[i];
			j--;
		}
		return dest;
	}
	
	

	
	
	static void reverse2(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
	}
	
	
	
	static void display(Integer arr[]) {
		System.out.println("a[0] = " + arr[0]);
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i] % arr[0]==0) {
				System.out.print("\t"+arr[i]);
			}
		}
	}
	

	
	
	public static void main(String[] args) {
		Integer n;
		System.out.print("Enter number of elements :");
		n = scan.nextInt();
		Integer arr[] = new Integer[n];
		set(arr);


		int b;
		do {
			System.out.println("\n________MENU________");
			System.out.println("1.Get array");
			System.out.println("2.Insert element");
			System.out.println("3.Delete element");
			System.out.println("4.Reverse array");
			System.out.println("5.Display first element and elements are divisible by it");
			System.out.println("6.Exit");

			System.out.print("Enter a number :");
			b = scan.nextInt();
			System.out.println("\n---------------------------------------------------------------");

			switch(b) {
			case 1: 
				System.out.println("Get array");
				get(arr);
				System.out.println("\n---------------------------------------------------------------");
				break;
			case 2: 
				System.out.print("Insert element");
				int k;
				int x;
				System.out.print("\n\tEnter index  : ");
				k = scan.nextInt();
				while(k>=arr.length || k < 0) {
					System.out.println("\n\tEnter index again : ");
				}
				System.out.print("\tEnter value : ");
				x = scan.nextInt();
				arr = insert(arr,k,x);
				get(arr);
				System.out.println("\n---------------------------------------------------------------");
				break;
			case 3:
				System.out.print("Delete element");
				int a;
				System.out.print("\n\tEnter index  : ");
				a = scan.nextInt();
				while(a>=arr.length || a < 0) {
					System.out.println("\n\tEnter index again : ");
				}
				arr = delete(arr,a);
				get(arr);
				System.out.println("\n---------------------------------------------------------------");
				break;			
			case 4: 
				System.out.print("Reverse array\n\t");
				reverse(arr);
				get(arr);
				System.out.println("\n---------------------------------------------------------------");
				break;			
			case 5:
				System.out.print("Display first element and elements are divisible by it\n\t");
				display(arr);
				System.out.println("\n---------------------------------------------------------------");
				break;			
			case 6:
				System.out.println("..........................Exit.................................");
				break;
	
			}
		} while(b!=6);
		
	
	}
}
