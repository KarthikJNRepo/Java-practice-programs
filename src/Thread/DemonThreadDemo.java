package Thread;

class ct extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DemonThreadDemo {
	public static void main(String[] args) {
		

		ct t1 = new ct();
		t1.setDaemon(true);
		t1.start();
		System.out.println("main thread");

	}

}
