package Collection;

import java.util.PriorityQueue;

public class PreorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>();
		
		pq.add(3);
		pq.add(4);
		pq.add(2);
		pq.add(34);
		pq.add(8);
		pq.add(1);
		System.out.println(pq);
		pq.remove(34);
		pq.poll();
		System.out.println(pq);
		
	}

}
