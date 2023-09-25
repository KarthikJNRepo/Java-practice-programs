package New;

public class demoTripleup {

	public static void main(String[] args) {
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 3; i++) {
				System.out.println("print");
			}
			Thread.currentThread();
			System.out.println(Thread.interrupted());
			System.out.println(Thread.currentThread().isInterrupted());
		});
		t2.start();
		t2.interrupt();

	}
}
