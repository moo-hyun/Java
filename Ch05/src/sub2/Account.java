package sub2;

public class Account {
	
	//속성
	
	private String bank;
	private String id;
	private String name;
	private int balnce;
	
	public Account() {
	
	}
	
	public Account(String bank, String id, String name, int balnce) {
		this.bank= bank;
		this.id = id;
		this.name= name;
		this.balnce= balnce;
	}
	
	public void deposit(int money) {
		this.balnce += money;
	
	}
	
	public void withdraw(int money) {
		this.balnce -= money;
		
	}
	public void show() {
		System.out.println("---------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balnce);
		System.out.println("---------------");
	}

}
