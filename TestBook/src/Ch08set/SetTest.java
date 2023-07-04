package Ch08set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("한국");
		set.add("미국");
		set.add("일본");
		set.add("중국");
		set.add("홍콩");
		set.add("한국");
		set.add("미국");
		
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String country : set) {
			System.out.println("country : " + country);
		}
	}

}
