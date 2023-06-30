package test4;


public class Test5 {
	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");  //문자열을 배열로 만드는것 스플릿() 안에는 구분자를 넣어서 어떻게 구분할지 정하는것
		int total =0;
		
		for(int i=0; i<scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]);
		}
		
		System.out.println("총점 : " +total);
	}
	


	}