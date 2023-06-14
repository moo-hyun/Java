package ch04;
/**
 * 
 * 
 *
 */
public class start2 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int a=1; a<=9; a++) {
			
			if(a<=5) {
				count++;
			}else {
				count--;
			}
			for(int b=1; b<=5-count; b++) {
				System.out.print(" ");
			}
				
			for(int c=1; c<=count*2-1; c++) {
				System.out.print("♥");
			}
			System.out.print("\n");
		}
		
	}

}
