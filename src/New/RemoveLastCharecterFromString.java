package New;

public class RemoveLastCharecterFromString {
	transient int i=8;
	 void print() {
		int r=this.i;
		System.out.println(r);
	}
	public static void main(String[] args) {
		String s="karthik J.N";
		s=s.substring(2, s.length()-1);
		System.out.println(s);
		RemoveLastCharecterFromString rs= new RemoveLastCharecterFromString();
		System.out.println(rs.i);		
	
	}

}
