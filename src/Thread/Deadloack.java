package Thread;

public class Deadloack {
	String s1 = "kathi";
	String s2 = "bala";

	Thread t1 = new Thread() {
		public void run() {
			synchronized (s1) {
				System.out.println(s1 + " waiting for " + s2);
				synchronized (s2) {
					System.out.println(s2 + " came");
				}
			}
		}
	};

	Thread t3 = new Thread(() -> {
		synchronized (s2) {
			System.out.println(s2 + " waiting for " + s1);
			synchronized (s1) {
				System.out.println(s2);
			}
		}
	});

	public static void main(String[] args) {
		Deadloack d = new Deadloack();
		d.t1.start();
		d.t3.start();
	}

}
