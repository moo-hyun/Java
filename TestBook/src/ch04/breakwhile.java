package ch04;

public class breakwhile {
	
	public static void main(String[] args) {
		
		while(true) {
			
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			
			if(num ==6) {
				break;
				
			}
		}
		System.out.println("프로그램 종료");
	}

}
//if (조건문이 true 일때 break(실행) 반복종료 while 다음 문 실행