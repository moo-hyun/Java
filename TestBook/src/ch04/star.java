package ch04;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		
		System.out.println("별 갯수 입력 : ");
		//별 갯수 입력
		Scanner scan = new Scanner(System.in);
		int snb = scan.nextInt();

		//sub 만큼 반복
		for(int start = 1; start<=snb; start++) {
			
			//별 앞에 올 공백
			for(int sp = snb-start; sp>0; sp--) {
				System.out.print(" ");
			}
			
			//별 출력
			for(int end=1; end<=start; end++)
				System.out.print("★");
			System.out.println();
					
		}
			
	}
	
}
