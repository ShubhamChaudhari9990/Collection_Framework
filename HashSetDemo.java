import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("6");
		hs.add("3");
		hs.add(1);
		hs.add("Hello");
		hs.add(10);
		hs.add(1);
		
		System.out.println(hs);
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
