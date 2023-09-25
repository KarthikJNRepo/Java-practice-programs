package Review;

import java.util.ArrayList;
import java.util.List;

public class Squence {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,8,9};
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i] != 1) {
				for(int j=1;j<a[i+1]-a[i];j++) {
					l.add(i+j+1);
					System.out.println(i+j+1);
				}
			}
		}
		System.out.println(l);
		/*
		 * int[] b=new int[l.size()]; for(int k=0;k<b.length;k++) { b[k]=l.get(k);
		 * System.out.println(b[k]); }
		 */		
	}
}
