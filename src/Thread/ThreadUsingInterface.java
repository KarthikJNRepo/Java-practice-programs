package Thread;

class MyThread1 implements Runnable{
	public static Thread main;
	@Override
	public void run() {
		if(Thread.currentThread().getName()=="2")
			Thread.yield();
		
		for(int i=0;i<25;i++) {
			
			//Thread.sleep(1000);
			System.out.println(Thread.currentThread());
		}	
	}
	
}
public class ThreadUsingInterface {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread1 mt = new MyThread1();
		Thread t1= new Thread(mt,"1");
		Thread t2= new Thread(mt,"2");
		Thread t3= new Thread(mt,"3");
		Thread t4=new Thread("gsjd");
		
		MyThread1.main =Thread.currentThread();
		
		//MyThread1.main.join();
		
		t1.setPriority(10);
		t1.start();
		//t1.join();
		t2.setPriority(1);
		t2.start();
		Thread.yield();
		//t2.join();
		t3.setPriority(10);
		t3.start();
		//t3.join();
		
		for(int i=0;i<25;i++) {
			System.out.println(Thread.currentThread());
		}
		
	}

}
