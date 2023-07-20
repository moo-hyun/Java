package ch04;

import java.util.Scanner;

public class dowhile {
	
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}	while( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
//while 문이 true 이면 계속 반복 하기 때문에 ! 넣어 false 로 종료 아니면 무한반복