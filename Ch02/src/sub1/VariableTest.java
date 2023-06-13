package sub1;

/**
 *  날짜 : 2023/06/12
 *  이름 : 김무현
 *  내용 : Ch02.Jave 변수와 연산자 실습
 * 
 *	변수(Variable)
 *	-데이터 처리를 위한 데이터 그릇
 *	-변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 *
 *	상수(Constant)
 *	-최초 저장은 데이터로 고정되는 수
 *	- 대문자로 표기
 *
 */
public class VariableTest {

	public static void main(String[] args) {
		
		// 변수
		int a = 3;
		int b = 7;
		
		System.out.println("a : " + a);
		a = 5;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		String name = "홍길동";
		System.out.println(name + "님 반갑습니다.");
		
		
		// 상수(값이 고정)
		
		final int NUM =5;
		
		//NUM =7;
		System.out.println("NUM : " + NUM);
	}
}
