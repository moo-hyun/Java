package sub2;
/**
 * 날짜 : 2023/06/19
 * 이름 : 김무현
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화 (정보은닉, Encapsulation)
 * 	- 캡슐화는 객채의 속성을 외부에 참조하지 못하게 객채의 정보(객체속성)를 은닉하는 특성
 *	- 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 *	- private 속성의 초기화를 위해 생성자(Constructor) 정의
 *	- 은닉된 정보의 안전한 사용을 위해서 Gatter.Setter 제공
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타","회색",10);
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반데","흰색",10);
		avante.setColor("파랑");
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		
		//Account 객체 생성 초기화
		Account kb = new Account("국민은행","101-12-1001","김유신",10000);
		kb.deposit(40000);
		kb.withdraw(25000);
		kb.show();
		
		Account kakao = new Account("카카오뱅크","112-2167-24","김무현",58000);
		kakao.deposit(32000);
		kakao.withdraw(20000);
		kakao.show();
		
	}
	

}
