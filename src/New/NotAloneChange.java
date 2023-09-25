package New;

public class NotAloneChange {
	public static void main(String[] args) {
		
		  int[] a= {1,8,4,5,4,3,23,4,4}; 
		  alone(a,4);
		}

	private static void alone(int[] a, int n) {
		for(int i=1;i<a.length-1;i++) {
			if(a[i]==n) {
				int greater=(a[i+1]>a[i-1])?i+1:i-1;
				a[i]=a[greater];
			}
		}
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
	}

}
