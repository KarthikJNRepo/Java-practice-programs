package Thread;

class MyThread extends Thread {
	public static Thread mainThread;

	synchronized public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		// main=new MyThread();

		t2.setDaemon(true);
		System.out.println(t2.isDaemon() + "*******************");

		t1.setName("t1");
		t2.setName("t2");

		t1.start();
		t2.start();
		synchronized (args) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
			}

		}

	}

}
