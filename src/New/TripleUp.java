package New;

public class TripleUp {
	public static void main(String[] args) {
		int[] a= {4,5,3,6,5};
		int len=a.length;
		boolean flag=false;
		for(int i=0;i<=len-3;i++) {
			int first=a[i];
			int second=a[i+1];
			int third=a[i+2];
			if(second==first+1 && third==second+1) {
				flag=true;
				break;
			}
		}
		System.out.println(flag);
	}

}
