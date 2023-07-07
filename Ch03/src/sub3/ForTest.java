package sub3;
/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 김무현
 * 내용 : Java 반복문 for 실습하기 
 * 
 */
public class ForTest {

	public static void main(String[] args) {
		
		// for(변수 ;반복 ; 증강또는 하강으로 i 변수 조정)
		for(int i=1 ; i<=5 ; i++) {
		
			System.out.println("i : " +i);
			
		}
		
		
		// 1부터 10까지 합
		
		int sum =0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k % 2 ==1) {
			
			sum += k;		
		}
	}
		System.out.println("1부터 10까지 합 : " + sum);
		

		// 1부터 10까지 짝수합 폴 이프문 :반복문 만큼 반복하되  if 참일때 끝까지 실행후 포문 반복 거짓일때 바로 for 문으로 복귀 후 반복실행 )
		int tot = 0;
		
		for(int k=1 ; k<=10 ; k++) {
		
			if(k % 2 ==0) //참이면 tot까지 실행 거짓이면 바로 for문 복귀후 반복
				tot += k;
		}
		
 		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		// for 중첩 중첩시 차례대로 첫번째 포문 1번 실행 2번째 포분 1번 실행 3번쨰 포문 반복만큼 실행
		// 그후 1번째 포문으로 가는게 아니라 3번쨰 포문 반복이 끝나면 2번째 포문으로 돌아온후 실행후 다시 3번째 포문 실행
 	
 		for(int a=1; a<=3 ; a++) {
 			
 			System.out.println("a :" + a);
 			
 			for(int b=1; b<=5; b++) {
 				
 				System.out.println("b : " +b);
 				
 				for(int c=1; c<=7 ; c++) {
 					 	System.out.println("c : " + c);
 			}
 		}
 	}
 		
 		// 구구단
		for(int x=2 ; x<=9 ; x++) {
			System.out.println(x+"단");
			
			for(int y=1; y<=9 ; y++) {
				
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
		}
 		// 별삼각형
		
		for(int start=10 ; start >= 1 ; start--) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.print("★");
			}
			
			System.out.print("\n"); // 개행(줄바꿈)
		}

	}
}
	

