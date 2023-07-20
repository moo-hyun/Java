package test7;

class Member {
	private String name;
	
	public Member(String name) {
		this.name = name;
	}
	public void show () {
		System.out.println("--------------");
		System.out.println(name + " 입니다.");
	}
}

class Employee extends Member {
	public Employee (String name) {
		super(name);
	}
	public void show () {
		super.show();
		System.out.println("작업을 합니다.");
	}
}

class Developer extends Member {
	public Developer(String name) {
		super(name);
	}
	public void show () {
		super.show();
		System.out.println("개발을 합니다.");
	}
}
public class Test5 {
	public static void main(String[] args) {
		Employee employee = new Employee("김유신");
		Developer developer = new Developer("김춘추");
		Member [] people = {employee,developer};
		
		for(Member human : people) {
		human.show();
		}
	}
}
