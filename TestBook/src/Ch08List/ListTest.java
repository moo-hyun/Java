package Ch08List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//System.out.println(list);
		
		list.add(4,5);
		//System.out.println(list);
		
		list.remove(4);
		System.out.println(list);
		
		System.out.println("list 3번째 원소 : " + list.get(2));
		
		System.out.println("list 크기 : " + list.size());
		
		for(int num : list) {
			System.out.print(num +" ");
			System.out.println();
		}
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("부산",3000);
		Apple a2 = new Apple("청주",4000);
		
		apples.add(a1);
		apples.add(a2);
		
		
		Apple apple = apples.get(0);
		apple.show();
		
		apples.get(1).show();
		apples.get(0).show();
		
		
				
	}
}
