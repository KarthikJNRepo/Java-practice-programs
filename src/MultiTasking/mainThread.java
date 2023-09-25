package MultiTasking;

public class mainThread extends Thread {
	public static Thread mainThread;

	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("child");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		mainThread t1 = new mainThread();
		mainThread = Thread.currentThread();

		t1.start();
		for (int i = 0; i < 6; i++) {
			System.out.println("Main");
		}
	}
}
