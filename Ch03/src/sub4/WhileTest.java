package sub4;
/**
 * 날짜 : 2023/6/14
 * 이름 : 김무현
 * 내용 : Java 반복문 While 실습하기
 * 
 *
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		//1부터 10까지 합
		int sum =0;
		int k =1;
		
		//while(조건식 조건이 참이면 계속 반복)(거짓이 있어야 멈춤 끝이필요)
		while(k <= 10) {
	    
			sum += k;
			k++;
	    
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		//do~while (두 실행후 와일문 반복)
		int tot= 0;
		int i = 1;
		
		
		do{
			if(i % 2 ==0) {
			tot += i;
			
			}
			
			i++;
			
			}
			
		while(i <= 10);
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
			
	    
		
		
		
		//break
		int num =1;
		
		while(true) {
			
			
			if(num % 5==0 && num % 7 ==0) {
				break;
		}
			
			num++;
			
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
	
        
		
		//continue
		
		int total = 0;
		int j =0;
		
		while(j <=10) {
			j++;
			
			if(j % 2 == 1) {
				continue; // 반복문 처음으로 이동
			}
			total += j;
		}
		System.out.println("1부터 10까지 짝수합 " + total);
		
	}
}
 
