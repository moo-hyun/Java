package ch03.sec11;
/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 김무현
 * 내용 : 104실습
 *
 *
 */
public class p104 {

	 public static void main(String[] args) {
		
		 int score = 85;
		 char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C');
		 System.out.println(score + "점은" + grade + "등급입니다.");
		 
		 int x =10;
		 int y =5;
		 
		 System.out.println( (x>7) && (y<=5) );
		 System.out.println((x%3 == 2) || (y%2 != 1));
	}
}

