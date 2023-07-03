package sub2;

public class Count {
	
	private int num;
	
	
	public int getNum() {
		return num;
	}
	//동기화 블럭 : 스레드간의 경합을 막고
	public synchronized void setNum(int num) {
		this.num++;
	}

}
