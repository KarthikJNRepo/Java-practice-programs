package Demo_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Add_Two_Number {
	public static void main(String[] args) {
		int[] a= twoSum(new int[]{3,2,7,3}, 6);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	  public static int[] twoSum(int[] nums, int target) {
		  Map<Integer, Integer> seen= new HashMap<>();
		  for(int i=0;i<nums.length;i++) {
			  if(seen.containsKey(target-nums[i])) {
				  return new int[] {seen.get(target-nums[i]),i};
			  }
			  seen.put(nums[i], i);
		  }
		  Set<Integer> a=seen.keySet();
		  a.stream().forEach(x->System.out.println("kay "+x+" value  "+seen.get(x)));
	       return new int[0];
	    }

}
