package Collection;

import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
	LinkedList ll = new LinkedList();
	ll.add(1);
	ll.add(2);
	System.out.println(ll);
	ll.addFirst(1);
	System.out.println(ll);
	ll.removeFirstOccurrence(2);
	System.out.println(ll);
	ll.removeFirst();
	System.out.println(ll);
	
	
	
	
}
}
