package Sub9;

public class Cable implements Socket {
	
	private Bulb bulb; //새로운 기능


	//케이블 클래스에 벌브 초기화
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}

	@Override //소켓의 스위치를 오버라이드 해서 전구의 라이트와 연결 
	public void switchOn() {
		bulb.lightOn();
		
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}

}
