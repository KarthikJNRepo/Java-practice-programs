package OwnImmutableClass;

public class ImmutableDemo{

	public static void main(String[] args) {
		
		Address address= new Address();
		address.setCity("sakleshpur");
		address.setHouseNumber(101);
		
		Student s1=new Student(1, "karthi", address);
		System.out.println(s1);
		Address address2=s1.getAddress();
		address2.setCity("bangalore");
		System.out.println(s1);
		System.out.println(address2);
	}

}
