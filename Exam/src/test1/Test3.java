package test1;
/**
 * 
 * 날짜 : 2023/06/13
 * 이름 : 김무현
 * 내용 : 자바 연산자 연습문제
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		
		
		int num = 1;
		int result = 1;
		
		result = num++; //대입 증강 이 있으면 증강이 뒤에있으면 대입부터함 
		System.out.println("result : " + result);
		
		result = ++num;// 증강이 앞에 있으니깐 증강후 대입
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}


}
