package sub4;
/**
 * 
 * 날짜 :2023/06/14
 * 이름 :김무현
 * 내용 " Java 배열 실습하기
 *
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//배열 배열기호 [] {타입} 같은 타입만 들어갈수있음 타입출력시 0이 1번째로 시작함
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"부산", "대전", "대구", "서울", "광주"};  
		
		
		//원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr3[3] : " + arr3[3]);
		
		
		
		
		//배일 길이 원소의 갯수를 뜻함 lenght
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		
		//배열 반복문
		for(int i =0 ; i<arr1.length ; i++) {
			
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println(); //개행
		
		for(char c : arr2) {
			System.out.print(c+" ");
		}
		
		System.out.println();//개행
		
		
		for(String city : arr3) {
			System.out.print(city +" ");
		}
		System.out.println();//개행
		
		//1차원 배열 배열 변수 이름도 다 복수로 적어야함 예 s붙이기
		int[] scores = {80, 60, 78, 62, 92};
		int total =0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("cores 합 :" + total);
		
		
		
		
		//2차원 배열
		
		int[][] arr2d = {{1,2,3,4}, 
						 {5,6,7,8}, 
						 {9,10,11,12}};
		
		
		// 원소가 3행4열 이라서 b<4
		for(int a=0; a<3 ; a++) { 
			
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " +arr2d[a][b]);
			}
		}
		
		//3차원 배열  3 3 3 이라서 e r t <3
		int[][][] arr3d = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
						  {{10,11,12},
							{13,14,15},
							{16,17,18}},
						  {{19,20,21},
							{22,23,24},
							{25,26,27}}};
		
		for(int e=0; e<3; e++) {
			
			for(int r=0; r<3; r++) {
				
				for(int t=0; t<3; t++) {
					
					System.out.printf("arr3d[%d][%d][%d] : %d\n", e, r, t, arr3d [e][r][t]);
				}
			}
		}
		
		
		
	}

}
