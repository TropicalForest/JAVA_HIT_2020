package Person;

public class RunMain {
	public static void main(String[] args) {
		Person aDiepXinhGai = new Person();
		Person beKhanh2k = new Person();
		
		aDiepXinhGai.setName("Diep");
		aDiepXinhGai.setGender("Male");
		aDiepXinhGai.setHobby("Doan Vu IT");
		aDiepXinhGai.setDateOfBirth("22/9/1975");
		
		beKhanh2k.setName("Khanh");
		beKhanh2k.setGender("Male");
		beKhanh2k.setHobby("Doan Vu IT");
		beKhanh2k.setDateOfBirth("13/4/1984");
		
		System.out.println(aDiepXinhGai.getName() + " - " + aDiepXinhGai.getGender() + " - " + aDiepXinhGai.getDateOfBirth() +  " <3 " + aDiepXinhGai.getHobby());
		System.out.println(beKhanh2k.getName() + " - " + beKhanh2k.getGender() + " - " + beKhanh2k.getDateOfBirth() +  " <3 " + beKhanh2k.getHobby());
		
		
		
	}
}
