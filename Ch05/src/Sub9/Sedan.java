package Sub9;

public class Sedan implements Car {
	
	private String name;
	private String color;
	private int speed;
	
	//생성자 오른쪽 우클릭 소스 제너레이티드 유징 소스
	public Sedan(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}

}
