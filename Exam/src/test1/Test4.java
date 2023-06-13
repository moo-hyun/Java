package test1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		int n1 = 90, n2 = 80, n3= 70, n4= 60
		System.out.println("입력한 점수는 " + score + " 입니다.");
		
		if(score > n1) {
			grade ='A';
		}else if (score > n2) {
			grade = 'B';
		}else if (score > n3) {
			grade = 'C';
		}else if (score > n4) {
			grade = 'D';
		}else {
			grade = 'F';
		}
			System.out.println("등급은 %c입니다", grade);
	}
}
