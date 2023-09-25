package Thread;

public class ThreadUsingLambda {
	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 0; i < 9; i++) {
				System.out.println("thread lambda");
			}
		}).start();

		// without lambda expression....
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 9; i++)
					System.out.println("thread without lambda");
			}
		}).start();
	}

}
