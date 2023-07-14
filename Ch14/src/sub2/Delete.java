package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2023/07/10
 * 이름 : 김무현
 * 내용 : Delete 실습하기
 */
public class Delete {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb"; 
		String name = "root";
		String pass	= "1234";
	
		try {
			// 1단계 -
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2단계 -
			Connection conn = DriverManager.getConnection(host,name,pass);
			// 3단계 -
			Statement stmt = conn.createStatement();
			// 4단계 -
			String sql ="DELETE FROM `user1` WHERE `uid`='j101'";
			stmt.executeUpdate(sql);
			// 5단계 -
			// 6단계 -
			stmt.close();
			conn.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
		
	}

}
