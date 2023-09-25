package StringDemo;

class employee {
	int number;
	String name;

	public employee(int number, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;
	}

	/*
	 * public int getNumber() { return number; }
	 * 
	 * public void setNumber(int number) { this.number = number; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */

	@Override
	public String toString() {
		return "employee [number=" + number + ", name=" + name + "]";
	}

}

