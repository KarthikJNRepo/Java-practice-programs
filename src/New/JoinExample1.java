package New;

public class JoinExample1 extends Thread {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i +" "+Thread.currentThread().getName());
		}
	}

	public static void main(String args[]) throws InterruptedException {
		JoinExample1 t1 = new JoinExample1();
		JoinExample1 t2 = new JoinExample1();
		JoinExample1 t3 = new JoinExample1();

		t1.start();
		t1.join();
		t2.start();
		t3.start();
	}
}
