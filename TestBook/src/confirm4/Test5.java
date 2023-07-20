package confirm4;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		// 7번
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
			
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 4) {
				break;
			}
			
			if(answer ==1) {
				System.out.println("예금액 입력 : ");
				int is = sc.nextInt();
				balance += is;
				
			}
				
			if(answer ==2) {
				System.out.println("출금액 입력 : ");
				int draw = sc.nextInt();
				balance -= draw;
				
			}
			
			
			if(answer ==3) {
				System.out.println("현재금액 : " + balance);
				
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
