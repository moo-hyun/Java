package confirm6;

class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if (balance >=0 && balance <= 1000000) {
			this.balance = balance;
		}
	}
	
}

public class Test7 {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(30000);
		System.out.println("현재잔고 : " + account.getBalance());
	}

}
