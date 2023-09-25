package Training;

public class SwitchDemo {
	public static void main(String[] args) {
		String day = "friday";
		switch (day) {
		case "monday", "tuesday", "wednesday","thursday", "friday":

		{
			System.out.println("work");
			break;
		}

		default:
			System.out.println("holiday");
		}

	}
}
