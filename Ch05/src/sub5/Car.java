package sub5;

public class Car {
	//필드(속성) //private에서 protected 로 접근권한 변경해서 자식클래스 참조
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name, String color, int speed) {
		this.name =name;
		this.color =color;
		this.speed =speed;
	}

	//메서드 (기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		
		System.out.println("차량명 :" + this.name);
		System.out.println("차량색 :" + this.color);
		System.out.println("현재속도 :" + this.speed);
	}
}
