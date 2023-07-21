package test8;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String pid;
	private String name;
	private int age;
	
	public String getPid() {return pid;}
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public Person(String pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "아이디: "+pid+","+"이름: "+name+","+" 나이"+age;
	}
}

class PersonMap{
	private Map<String, Person> persons;
	
	public PersonMap() {
		persons = new HashMap<>();
	}
	public void addPerson(Person p) {
		persons.put(p.getPid(), p);
	}
	
	public boolean removePerson(String uid) {
		if(persons.containsKey(uid)) {
			persons.remove(uid);
			return true;
		}
		System.out.printf("아이디 '%s'가 존재하지 않습니다.\n",uid);
		return false;
	}
	public void showAllPersons() {
		for(Person p : persons.values()) {
			System.out.println(p);
		}
	}
}
public class Test8 {
	public static void main(String[] args) {
		
		PersonMap map = new PersonMap();
		
		Person p1 = new Person("a101","김유신",23);
		Person p2 = new Person("a102","김춘추",26);
		Person p3 = new Person("a103","강감찬",46);
		
		map.addPerson(p1);
		map.addPerson(p2);
		map.addPerson(p3);
		
		map.removePerson("kim");
		map.removePerson("a103");
		
		map.showAllPersons();
	}

}
