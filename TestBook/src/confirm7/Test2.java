package confirm7;

 class Parent1{
	public String nation;
	
	public Parent1() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent1(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation ) call");
	}
}

 class Child1 extends Parent1{
	public String name;
	
	public Child1() {
		this("홍길동");
		System.out.println("Child() call");
	} 
	public Child1(String name) {
	this.name =name;
	System.out.println("Child(String name) call");
	}
}


public class Test2 {
	public static void main(String[] args) {
		Child1 child = new Child1();
		
		
	}
}
