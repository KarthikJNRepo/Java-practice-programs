package New;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueArray {
	public static void main(String[] args) {
		int i,j,counter = 0;
		boolean flag=true;
		Integer[]aa= {1,2,2,3,3,3,4,4,4,4,6};
		List<Integer> l= new ArrayList<Integer>(Arrays.asList(aa).stream().collect(Collectors.toSet())); 
		Map<Integer, Integer> count=new HashMap<>();	
		for(i=0;i<l.size();i++) {
			counter=0;
			for(j=0;j<aa.length;j++) {
				if(l.get(i)==aa[j]) {
					counter++;
				}
			}
			count.put(l.get(i),counter);
		}
		System.out.println(count);
		List<Integer> valve= new ArrayList<>(count.values());
	   //System.out.println(valve);
		for(i=0;i<valve.size()-1;i++) {
			for(j=i+1;j<valve.size();j++) {
				if(valve.get(i)==valve.get(j)) {
					flag=false;
					break;
				}
			}
		}
		System.out.println(flag);
	}

}
