package jdbcTest;

import java.sql.*;
import java.util.Scanner;

public class JdbcEx1 {
	
	
	public static void main(String[] args) {
		
		
		Scanner cs = new Scanner(System.in);
		try {
			System.out.println("����̹� �ε�");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="scott";
			String pwd ="1234";
		
			Connection conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("����Ŭ ���� ����");
			
			
			Statement st = conn.createStatement();
			
			String sql = cs.nextLine();
					
			//"insert into student (name,addr) values ('�뼮','�Ȼ�')";
			//update student set age =20 where name = '�뼮'
			//delete from student  where name = '�뼮'
			int num = st.executeUpdate(sql);
			System.out.println(num+"���� ���� ����Ǿ����ϴ�");
			
			
			st.close();
			conn.close();
			
		
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("����Ŭ ���� ����");
			e.printStackTrace();
		}
		
		
		

	}

}
