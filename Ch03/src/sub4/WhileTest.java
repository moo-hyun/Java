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
		
		//while(조건식 조건이 true이면 계속 반복)(false이 있어야 멈춤 끝이필요)
		// 구조:while(조건식) true면 > { }문 실행 조건식이 false일때까지 실행
		while(k <= 10) {
	    
			sum += k;
			k++;
	    
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		//do~while (두문 실행 > 와일문 > 두부터 반복 거짓일때 멈추고 프린트)
		//do 문 안에 있는 if 문이 false 일때 do 문을 더이상 실행 하지않고 내려감
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
			
	    
		
		
		
		//break ( 와일이 트루 라고 적어서 무한 반복 if문에서 false일때 beack 통과 
		//        &&(둘다참) true일때 break(멈춤) 실행 프린트)
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
				continue; 
			//continue if문이 true이면 while 문으로 이동 false시 
			//	       다음문 실행
			}
			total += j;
		}
		System.out.println("1부터 10까지 짝수합 " + total);
		
	}
}
 

