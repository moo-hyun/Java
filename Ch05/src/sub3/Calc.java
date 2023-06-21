package sub3;

public class Calc {
	
	//싱글톤 객체
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // 싱글톤 객체 특성으로 다른곳에서는 생성되지 못하도록 막기위해 쓰는 문법
	
	public int plus(int x, int y) {
		return x+ y;
	}
	public int minus(int x, int y) {
		return x- y;	
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int diy(int x, int y) {
		return x / y;
		
	}

}
