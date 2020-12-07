package functional_interface;

public class RunMain {
	public static void main(String[] args) {
		Person person = (String a) -> System.out.println("Sleep in RunMain");
		person.Sleep("hehe");
	}
	
}
