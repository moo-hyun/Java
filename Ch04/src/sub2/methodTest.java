package sub2;
/**
 * 날짜:2023/06/15
 * 김무현
 * 내용 : Java method 실습
 * 
 *
 */


public class methodTest {
	
	//전역변수
	int num= 1;
	
	//main method : 프로그램 진입점
	public static void main(String[] args) {
		
		
		//메서드 호출 결과가 y1에 들어감 
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		//메서드 지역변수와 스텍
		int t1 = sum(1,10);
		int t2 = sum(1,100);
		System.out.println("t1: " + t1);
		System.out.println("t2: " + t2);
		
		
		
	}    
	
	//메서드 정의  void(그래서 int 로 변환) 반환 타입이라 메서드 출구가 막혀있음 return을 실행하지못함
	
	public static int f(int x) {
		
		int y= 2* x +3;
		return y;
	}
	
	//메서드 정의 
	public static int sum(int start, int end) {
		
		// 지역변수 : 메서드가 종료되면 스택에서 해제 
		int total = 0;
		
		for(int k=start ; k <= end ; k++) {
			
			total +=k;
		}
		return total;
		
		}

 }
	

//디버깅시 메서드 함수 진입은 에프5
