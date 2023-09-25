package Thread;

class Thread_Demo extends Thread {
	String name = "karthi";

	@Override
	public void run() {
		synchronized (name) {
			for (int i = 1; i < 15; i++)
				System.out.println(Thread.currentThread().getName()+ " " + name);
		}
	}
}

public class Synchronization_Demo {

	public static void main(String[] args) {
		Thread_Demo t1 = new Thread_Demo();
		Thread_Demo t2 = new Thread_Demo();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}

}
