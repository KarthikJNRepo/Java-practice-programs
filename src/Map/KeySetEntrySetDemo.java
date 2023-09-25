package Map;
import java.util.HashMap;
import java.util.Map;

public class KeySetEntrySetDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer, String>(); 
		m.put(1, "karthi");
		m.put(2, "bala");
		m.put(3, "krishna");
		m.put(4, "asif");
		m.put(4, "hgh");
		
		for(Map.Entry<Integer, String> entry:m.entrySet()) {
			System.out.println(entry);
		}
		System.out.println("---------");
		for(Integer  entry:m.keySet()) {
			System.out.println(entry);
		}
	}

}
