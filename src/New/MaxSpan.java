package New;

public class MaxSpan {
	public static void main(String[] args) {
		int[] a= {2,1,4,2,1,1,3,4,4,2};
		System.out.println(maxSpan(a));
		
	}
	public static int maxSpan(int[] nums) {
		  int span = 0;
		  int tmp = 0;
		  
		  for (int i = 0; i < nums.length; i++) {
		    for (int j = 0; j < nums.length; j++) {
		    	if(nums[i]==nums[j]) 
		    		span=j-i+1>span?j-i+1:span;
		    }
		  }
		  return span;
		}

}
