package SS2doiTuong;

public class Person implements Comparable<Person>{

	private int id;
	private String name;
	@Override
	public int compareTo(Person o) {
		if(this.id > o.getId()) {
			return 1;
		}
		else if (this.id < o.getId()) {
			return -1;
		}
		return 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
