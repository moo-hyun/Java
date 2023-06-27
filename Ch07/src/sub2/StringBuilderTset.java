package sub2;
/**
 * 날씨 : 2023/06/27
 * 이름 : 김무현
 * 내용 : Java StringBuilder 클래스 실습하기
 *
 */
public class StringBuilderTset {
	
	public static void main(String[] args) {
		
		//String immutable 속성
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		str += "Programing";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		//String immutable 특성을 개선한 StringBuilder
		StringBuilder sb= new StringBuilder("Java");
		System.out.println("sb 객체 주소: " + System.identityHashCode(sb));
		
		sb.append("programing");
		System.out.println("ab 객체 주소 : " +System.identityHashCode(sb) );
		
		System.out.println("sb : " + sb);
		
	}

}
