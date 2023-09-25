package Generics;
import java.util.Collections;

class Generics1<T extends Number,Runnable,Collection>{
	int num;
	double num2;
	Generics1(int num,double d){
		this.num = num;
		this.num2 =d;	
	}
	int add() {	
		return (int) (num+num2);	
	}
}
public class GenericsDemo {
	public static void main(String[] args) {
		Generics1<Number, Object, Object> g1 = new Generics1<Number, Object, Object>(13, 65.0);
		System.out.println(g1.add()); 
	}
}
