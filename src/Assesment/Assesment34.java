package Assesment;

public class Assesment34 {
	public static void main(String[] args) {
		System.out.println(nearest(21,2));
	}

static int nearest(int a, int b) {
	if(a>21 && b>21)
		return 0;
	if(a>21 || b>21) {
		if(a<21)
			return a;
		else
			return b;
	}
	if(a>b)
		return a;
	else
		return b;
	
	}
}
