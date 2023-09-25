package AssesmentSet2;

public class A1 {
	public static void main(String[] args) {
		int i,j;
		int num_rows=3;
		for(i=1;i<=num_rows;i++) {
			for(j=1;j<=num_rows-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=num_rows-1;i>=1;i--) {
			for(j=1;j<=num_rows-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
