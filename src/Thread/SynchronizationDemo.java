package Thread;

public class SynchronizationDemo {
	public static void main(String[] args) {
		Display d= new Display();	
		
		OurThread t1 = new OurThread(d, "karthi");
		OurThread t2 = new OurThread(d, "karthi");
		t1.setName("Thread 1");
		t2.setName("Thread 2");
	
		t1.start();
		t2.start();
	}}

class OurThread extends Thread {
	Display d;
	String name;

	OurThread(Display d, String name) {
		this.d = d; this.name = name;
	}
	OurThread( String name) {
		this.d = d; this.name = name;
	}
	
	public void run() {
			d.display(name);
			System.out.println("************************");
		}}

class Display {
	 synchronized void display(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println("good morning "+name+"     thread is ->"+Thread.currentThread().getName());
	}}}

