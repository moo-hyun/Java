package Ch08ToString;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성잔자", "안드로이드");
		
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		
		System.out.println(myPhone);
	}

}
