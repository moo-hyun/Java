package ch04;

public class star2 {
	public static void main(String[] args) {
		
		int count = 0;
		
		//총 반복문
		for(int a=1; a<=4; a++) {
			//반복문이 실행 될때마다 count는 증가
			count++;
			
			//앞에 올 흰별 출력
			for(int b=1; b<=4-count; b++) {
				System.out.print("☆");
			}
			
			//2개씩 늘어나는 검은별 출력
			for(int c=1; c<=count*2-1; c++) {
					System.out.print("★");
			}
			
			//뒤에 올 흰별 출력
			for(int b=1; b<=4-count; b++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
	}

}
