package test8;
class Member{
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp, int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}

	@Override
	public String toString() {
		return name+","+hp+","+age;
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		Member m1 = new Member("김유신","010-1234-1001",25);
		
		System.out.println(m1);
	}

}
