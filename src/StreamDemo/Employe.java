package StreamDemo;

public class Employe {
	String place;
	String name;
	int age;
	public Employe(String place, String name, int age) {
		super();
		this.place = place;
		this.name = name;
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name ;
	}
}
