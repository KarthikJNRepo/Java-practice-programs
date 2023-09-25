package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class CollectionDemo {


	public static void main(String[] args) {
		
		//Collection(I)
		
		Collection c = new ArrayList();
		
		c.add(1);
		c.add(2);
		c.add(4);
		c.add("Karthi");
		c.add("Karthi");
		
		//c.addAll(c); //add collection to present collection
		//c.remove(1);  //remove specified object.
		//System.out.println(c.removeAll(c)); //remove all the objects and returns true.
		//c.clear(); //removes all the element.
		//System.out.println(c.isEmpty()); //checks whether collection is empty or not.
		//System.out.println(c.size());  //returns size of collection.
		//System.out.println(c.contains(2)); //to verify the specific object present in the collection or not
		//System.out.println(c.containsAll(c));
		
		
		/* Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		} */
		
		//System.out.println(c);
		
		
		
		
		//List(I)
		System.out.println("******************");
		int result=0;
		List list=List.of(1,2,3,4,3,4,5,6);
		List liststream=  List.of("spring","hibernate","ebj","core java","spring");
		liststream.stream().filter(x->((String) x).length()>=4 && x=="spring").forEach(x->System.out.println(x));
		
		List l = new ArrayList();
		
		l.add(5);
		l.add(6);
		l.add(7);
		l.add("Ka");
		l.add("Kar");
		l.add(3, "abcd");
		l.addAll(3, c);
		//l.remove(0);
		//l.retainAll(c);
		System.out.println(l.lastIndexOf("Karthi"));
		
		
		//Specified  Methods.

		//System.out.println(l.get(1));  // to get the object from the list by specifying the index value
		//l.set(4, "J N"); // update specified object
		//System.out.println(l.indexOf(2)); //to get object index.
		
		
		System.out.println(l);
		
		
		
		
		
		//ArrayList(c)
		
		//constructor 3 are there.
		
		ArrayList al = new ArrayList(l);
		
		l.add(1);
		l.add(2);
		l.add(4);
		l.add("Karthi");
		l.add("Karthi");
		
		al.ensureCapacity(30);  //make arraylist capacity as 30.
		al.trimToSize(); //removes empty space.
		
		//System.out.println(al);
		
		
		
		
		
		//LinkedList(c)

		
		//Constructor 2 are there
		
		LinkedList ll = new LinkedList(al);
		
		//ll.addFirst(111);  //add object at start of collection
		//ll.addLast(999);  //add object at end of collection
		//ll.removeFirst();
		//ll.removeLast();
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());
		
		
		//System.out.println(ll);
		
		
		
		
		
		//Stack
		
		Stack s = new Stack();
		
		s.add(4563);
		s.add(3456);
		s.add(5679);
		s.add(465);
		s.add(456);
		
		s.push("karthi");  //add elements at the top(end)
		s.pop();           // removes top element
		//System.out.println(s.peek()); //returns top element
		//System.out.println(s.empty()); //returns true if stack is empty.
		//System.out.println(s.search(39));  //returns position from last.
		
		/*
		Enumeration e = s.elements();
		int total = 0;
		
		while(e.hasMoreElements()) {
			total = total + (Integer)e.nextElement()*9000;
		}
		
		System.out.println(total);
		*/
		
		
		//System.out.println(s);	
	}

}
