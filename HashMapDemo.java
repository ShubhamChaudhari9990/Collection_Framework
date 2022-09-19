import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) throws Exception {
		HashMap hm = new HashMap();
		
		hm.put("key2","value");
		hm.put("key1","value1");
		hm.put("key1", null);
		hm.put(null, hm);
		System.out.println(hm);
		
//		Iterator i = hm.entrySet().iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
	}
}
