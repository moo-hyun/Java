package test2;
/**
 * 날짜 : 2023/06/15
 * 김무현
 * 내용 : 자바 배열 최대값 찾기 연습문제
 * 
 * 
 */
public class Test2 {
	
	public static void main(String[] args) {
		
		int arr[] = {17, 18, 92, 33, 58, 7, 26, 42};
		
		int maxNum = arr[0];
		
		for (int i =0; i <8; i++) {
			
			if (maxNum < arr[i]) {
				maxNum =arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰수 : " + maxNum);
	}

}
