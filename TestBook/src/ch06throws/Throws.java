package ch06throws;

class NotExistIDEexception extends Exception {
	public NotExistIDEexception() {}
	public NotExistIDEexception(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
		

public class Throws {
	public static void main(String[] args) {
		
		try {
			login("white","12345");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
public static void login(String id, String password) throws NotExistIDEexception, WrongPasswordException{
	if(!id.equals("blue")) {
		throw new NotExistIDEexception("아이디가 존재하지 않습니다.");
		
	}
	if(!password.equals("아1234")) {
		throw new WrongPasswordException("비밀번호가 틀립니다.");
	}else {
		throw new WrongPasswordException("로그인 중입니다.");	
		}
		
}

}
