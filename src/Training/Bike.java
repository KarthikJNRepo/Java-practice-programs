package Training;

public class Bike {
	String engine;
	String seat;
	int fuel;
	public Bike(String engine, String seat, int fuel, int maxSpeed) {
		super();
		this.engine = engine;
		this.seat = seat;
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}
	@Override
	public String toString() {
		return "Bike [engine=" + engine + ", seat=" + seat + ", fuel=" + fuel + ", maxSpeed=" + maxSpeed + "]";
	}
	int maxSpeed;
	
	public int milage() {
		 return (int)maxSpeed/3;
	}
	public static void main(String[] args) {
		Bike R15= new Bike("155", "two", 10, 145);
		System.out.println(R15);
	}
	}

