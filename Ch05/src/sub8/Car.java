package sub8;


//abstract 추상클래스
public abstract class Car {
	//필드(속성) //private에서 protected 로 접근권한 변경해서 자식클래스 참조
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자 
	public Car(String name, String color, int speed) {
		this.name =name;
		this.color =color;
		this.speed =speed;
	}

	//(abstract 추상메서드)
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	
	
	public void show() {
		System.out.println("차량명 :" + this.name);
		System.out.println("차량색 :" + this.color);
		System.out.println("현재속도 :" + this.speed);
	}
}
