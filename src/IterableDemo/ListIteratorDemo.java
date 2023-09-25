package IterableDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ArrayList ll = new ArrayList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		ListIterator lit = ll.listIterator();
		
		
		//First we need to do forward then cursor will move to end then we need to do backword.
		
		/*
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		*/
		
		while(lit.hasNext()) {
			Object s=(Object)lit.next();
			if(s.equals(4)) {
				lit.set(7);
				lit.add(9);
			}
		}
		
		
		System.out.println(ll);	
		
		
		
		while(lit.hasPrevious()) {
		
		System.out.println(lit.previous());
		}
	}

}
