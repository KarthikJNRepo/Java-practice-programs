package OwnImmutableClass;

 final class Student {
	 int id;
	 String name;
	 Address address;
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		//return new Address(this.getId(), this.getName());
		//your returning the copy of the adress object.
		return new Address(address);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	 
	
	

}
