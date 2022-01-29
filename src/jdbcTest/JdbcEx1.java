package jdbcTest;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx1 {
	
	
	public static void main(String[] args) {
		
		
		Scanner cs = new Scanner(System.in);
		try {
			System.out.println("드라이버 로딩");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="scott";
			String pwd ="1234";
		
			Connection conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("오라클 접속 성공");
			
			
			Statement st = conn.createStatement();
			
			String sql = cs.nextLine();
					
			//"insert into student (name,addr) values ('용석','안산')";
			//update student set age =20 where name = '용석'
			//delete from student  where name = '용석'
			int num = st.executeUpdate(sql);
			System.out.println(num+"개의 행이 실행되었습니다");
			
			
			st.close();
			conn.close();
			
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
		
		
		

	}

}
