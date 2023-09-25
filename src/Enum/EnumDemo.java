package Enum;

class xyz {

}

enum bike  implements X {
	RX, SPLENDER, DUKE(45), BULLET(40), TVS;
	int var;
	bike(int i) {
		this.var = i;
	}
	bike() {
		this.var = 30;
	}
	int a=1;
	@Override
	public void method() {
		System.out.println("This is overrided method");
	}
}
interface X {
	void method();
}
public class EnumDemo {
	public static void main(String[] args) {
		System.out.println("ordinal "+bike.BULLET.ordinal());
		bike name = bike.BULLET;
		bike[] rate = bike.values();
		for (bike b : rate) {
			System.out.println(b);
		}
		switch (name) {
		case RX: {
			System.out.println("sound + speed");
		}
		case BULLET:
			System.out.println("royal");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + name);
		}
	}
}
