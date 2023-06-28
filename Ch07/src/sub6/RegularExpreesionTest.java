package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 날짜 : 2023/06/28
 * 이름 : 김무현
 * 내용 : Java 정규표현식
 *
 */
public class RegularExpreesionTest {
	public static void main(String[] args) {
		
		
		//정규표현식
		String strpatt = "a[a-z]*"; //이 문자열은 a로시작해서 a~z시작 *(없어도되고 하나이상) a다음은 소문자로 나와야함
		
		boolean r1 = Pattern.matches(strpatt, "apple");
		boolean r2 = Pattern.matches(strpatt, "banana");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		//정규표현식 패턴
		String[] patterns = {
								"[0-9]+",	// 숫자 1개 이상
								"1[0-9]*",  // 1로 시작하는 숫자 0개 이상
								"^[0-9]", 	// 숫자로 시작하는 문자
								"[^0-9]", 	// 숫자가 아닌 문자
								".",      	// 문자 1개
								"[a-z]?", 	// 영어 소문자 1개
								"[a-z]*",	// 영어 소문자 0개 이상
 								"[a-z]+",	// 영어 소문자 1개 이상
								"[A-Z]*",	// 영어 대문자 0개 이상
								"[가-힣]+",	// 한글 1자 이상
								"^[0-9a-z]+",// 숫자 + 영어 조합 0개 이상
								"^[0-9가-힣]+",// 숫자 + 한글 조합0개이상
								"^[A-Z][a-z]+",// 영어 대문자로 시작하는 문자 0개이상
								"\\s",		// 공백
								"\\S",		// 공백이 아닌 문자
								"\\d",		// 숫자
								"\\w",		// 숫자와 문자
								"\\W",		// 특수문자
				
							};
		
		String[] words = {"apple","123abc","123456","011한글","hellp","홍길동","1","Banana","APPLE","#"};
		
		for(String word : words) {
			System.out.println(word + "문자와 일치하는 패턴 : " );
			for(String pattern : patterns) {
				
				boolean result = Pattern.matches(pattern, word);
			
			if(result) {
				System.out.println(pattern + ", ");
				
			}
		}
		System.out.print("\n");
		
	}
		//자주 사용하는 정규표현식
		String ptt1 = "^[a-zA-Z0-9]*$"; //아이디 
		String ptt2 = "^[가-힣]*$"; // 이름 
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})"; // 휴대폰
		String ptt4 = "(\\w+)@(\\w+).(\\w+)"; // 이메일
		
		String str = "이름:홍길동, 휴대폰:010-1234-1001, 휴대폰:017-123-5544,이메일:aksnd@naver.com";
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		System.out.println("이메일 조회");
		while(m2.find()) {
			System.out.println(m2.group());
		}

		
		
		
		
		
	}
}	
