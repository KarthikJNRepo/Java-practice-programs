package ObjectMethod;

class Person{
	int adhar_Number;
	String name;
	public Person(int adhar_Number,String name) {
		this.adhar_Number=adhar_Number;
		this.name=name;	
	}
	@Override
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		
		if(this.name.equals(p.name)) {
			return true;
		}
		return false;
	}
	
}

public class HashcodeAndEquals {
	public static void main(String[] args) {
		
		  Person p=new Person(101, null); 
		  Person p1=new Person(101, "karthi"); boolean
		  result=p.equals(p1);
		  
		 // System.out.println(p.hashCode()); System.out.println(p1.hashCode());
		  //System.out.println(result);
		 
		String s=null;
		String s1="kat";
		if(true) {
			System.out.println("sdnh");
		}
	
	}

}
