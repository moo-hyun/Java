package Ch08ToString;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company ,String os) {
		this.company = company;
		this.os = os;
		
	}
	public String toString() {
		return company + ", " + os;
	}

}
