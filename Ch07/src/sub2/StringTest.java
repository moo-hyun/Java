package sub2;
/**
 * 날씨 : 2023/06/27
 * 이름 : 김무현
 * 내용 : Java String 클래스 실습하기
 * 
 *  String 클래스
 *	-String 문자열을 처리하는 클래스
 *	- 문자열 비교는 equals. 다양한 문자열 가공 메서드 제공
 *	-String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 */
public class StringTest {
	public static void main(String[] args) {
		
		//문자열(문자+배열) 생성
		String str1 = "Hello";  		  // 암시적 (리터럴)
		String str2 = new String("Hello");// 명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//문자열 비교 (틀린예시)
		if(str1 == str2) {
			System.out.println("str1, str2 주소가 같다.");
		}else {
			System.out.println("str1, str2 주소가 다르다.");
		}
		//문자열 비교 
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 값이 같다.");
		}else {
			System.out.println("str1, str2 문자열이 값이 다르다.");
		}
		
		//문자열 길이
		String msg = "Hello Korea";
		System.out.println("msg 길이 : " + msg.length());
		
		//문자열 추출
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(6);
		
		System.out.println("msg 1번째 문자 : " + c1);
		System.out.println("msg 7번째 문자 : " + c2); //인덱스 번호로 적용해서 7번째 문자가 K
		
		//문자열 자르기
		String sub1 = msg.substring(0,5);// 0부터 5까지 (start, end)
		String sub2 = msg.substring(6); //6번부터 마지막까지 짜를때 
		
		System.out.println("sub1 : " + sub1);
		System.out.println("sub2 : " + sub2);
		
		//문자열 인덱스
		int idx1 = msg.indexOf("e"); // e가 2개면 앞에서 부터 구함
		int idx2 = msg.lastIndexOf("e");//e가 2개고 라스트가 붙으면 뒤에서 부터 구함.
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		//문자열 교체
		String rs1 = msg.replace("Korea", "Bosan"); //앞에는 바꿀문자 뒤에는 변경되는문자
		String rs2 = msg.replace("Hello", "Welcome");
		
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		//문자열 변환
		int 	var1 = 1;
		double	var2 = 3.14;
		boolean var3 = true;
		
		String s1= String.valueOf(var1);
		String s2= String.valueOf(var2);
		String s3= ""+var3; //암묵적으로 이렇게 더 자주씀
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
	}
}
