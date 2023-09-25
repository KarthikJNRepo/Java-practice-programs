package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add(1);
		q.add(57);
		q.add(233);
		q.add(7);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove()); // throws error if queue is empty
		System.out.println(q.poll());  //not throw error if the queue is empty.
		System.out.println(q);
	}

}
