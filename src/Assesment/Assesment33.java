package Assesment;

public class Assesment33 {
	public static void main(String[] args) {
		System.out.println(diffByOne(6,2,3));
	}

	static boolean diffByOne(int a, int b, int c) {
		 if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
		      return true;
		  }else{
		      return false;
		  }
	}
}

 