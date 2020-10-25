package bt2;

import java.util.ArrayList;
import java.util.Collections;

public class RunMain {
	public static void main(String[] args) {
		ArrayList<sv> list = new ArrayList<>();
		sv sv1 = new sv("123","Tuan");
		sv sv2 = new sv("123","Tuan");
		list.add(sv1);
		list.add(sv2);
		
		sv temp = list.get(0);
		list.set(0, list.get(1));
		list.set(1, temp);
		
		
		for(sv a : list) {
			System.out.println(a);
		}
	}

}
