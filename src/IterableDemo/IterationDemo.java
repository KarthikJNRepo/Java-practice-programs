package IterableDemo;

import java.util.ArrayList;
import java.util.Iterator;


public class IterationDemo {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(54);
		al.add(4);
		
		//iterator - in this we can print object in forward direction. and we can remove object.
		Iterator it = al.iterator();
		
		/*
		 while(it.hasNext()) {
		 
			System.out.println(it.next());
		}
		*/
		
		
		
		/*
		while(it.hasNext()) {
			if(((Integer)it.next())%2==0) {
				it.remove();
			}
		}
		System.out.println(al);
		*/
		
		
		/*
		while(it.hasNext()) {
			int num =(Integer)it.next();
			if(num%2==0) {
				it.remove();
			}
			else
				System.out.println(num);
		}
		*/
		
		
		
		System.out.println(al);
		
		
		
		
	}

}
