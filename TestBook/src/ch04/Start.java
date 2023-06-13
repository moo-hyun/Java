package ch04;
/**
 * 날짜 : 2023/6/13
 * 이름 : 김무현
 * 내용 : 별 만들어보기 
 *
 */
public class Start {
	
	public static void main(String[] args) {
		
		for(int start = 0; start <=5; start++) {
			
			for(int end=1 ; end <= start ; end++)
				
				System.out.print("★");
				System.out.println();
		}
		
	}

}
