package test1;

import java.util.Scanner;

/**
 * 날짜: 2023/06/13
 * 이름 : 김무현
 * 내용 : 자바 삼향연산자 연습문제
 * 
 *
 */
public class Test6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 :");
		int x = sc.nextInt();
		
		System.out.println("y값 입력 :" );
		int y= sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." :"y가 더 큽니다. "; //삼향 연산자 참이면 앞에열 대입 거짓이면 뒷열 대입
		
		System.out.println(result);
		
		
	}

}
