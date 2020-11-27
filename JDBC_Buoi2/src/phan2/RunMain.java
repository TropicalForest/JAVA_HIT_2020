package phan2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;


public class RunMain {
	public static void main(String[] args) {
		String[] arr = {"Tuan", "Hoang","Thuan","Huan","Tuan","Huan"};
		Set<String> set = new HashSet<>(Arrays.asList(arr));
//		for(String s : arr) {
//			set.add(s);
//		}
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
	}
}
