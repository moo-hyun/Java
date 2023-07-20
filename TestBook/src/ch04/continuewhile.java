package ch04;

public class continuewhile {
	
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
		}
			System.out.print(i + " ");
	}

  }
}

//if 문이 true 일때 continue가 실행되서 그이후의 문장을 실행 하지 않고 다음 반복으로 넘어감
// 만약 if문이 false 반복하지않고 if 다음문 실행   