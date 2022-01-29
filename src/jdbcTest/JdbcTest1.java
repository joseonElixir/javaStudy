package jdbcTest;

import java.sql.*;


public class JdbcTest1 {
	
	public static void main(String[] args) {
		
		//DB연동은 이 절차를 무지성으로 따라가면 됨.
		
		try {
			System.out.println("드라이버 연동 시작");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pwd ="1234";

			Connection conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("연동성공");
			/////////////////////
			
			Statement st = conn.createStatement();
			
			String sql = "insert into student values('jdbc',10,'02-1212-3434','서울')";
			int count = st.executeUpdate(sql);
			System.out.println(count+"개의 행이 입력되었습니다.");
			st.close();
			
			
			//////////////////////
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패 : 주소나 계정 비번 틀림");
		}
		
		
	}
}
