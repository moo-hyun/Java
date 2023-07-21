package test8;

interface NumericLambda {
	boolean test(int n);
}
public class Test5 {
	public static void main(String[] args) {
		
		NumericLambda isEven = (int n) -> {return n%2 ==0;}; //람다식 본모습
		
		if(isEven.test(2)) {
			System.out.println("2는짝수");
		}
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		NumericLambda isNonNeg = (int n) -> n >=0; //람다식 최소한으로 줄인것
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
			
		if(!isNonNeg.test(-11)) {
			System.out.println("-1은 음수");
		}
		
	}

}
