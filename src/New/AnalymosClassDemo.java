package New;

interface hhs{
	void get();
}

public class AnalymosClassDemo {
	
	public static void main(String[] args) {
		hhs h= new hhs() {
			public void get() {System.out.println("print");	}
		};
	
		
		
		 new Thread(()->{for(int i=0;i<100;i++) {System.out.println("print t1");}}).start();
		 new Thread(()->{for(int i=0;i<100;i++) {System.out.println("print t2");}}).start();
	}
}


