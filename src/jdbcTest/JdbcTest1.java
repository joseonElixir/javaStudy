package jdbcTest;

import java.sql.*;


public class JdbcTest1 {
	
	public static void main(String[] args) {
		
		//DB������ �� ������ ���������� ���󰡸� ��.
		
		try {
			System.out.println("����̹� ���� ����");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pwd ="1234";

			Connection conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("��������");
			/////////////////////
			
			Statement st = conn.createStatement();
			
			String sql = "insert into student values('jdbc',10,'02-1212-3434','����')";
			int count = st.executeUpdate(sql);
			System.out.println(count+"���� ���� �ԷµǾ����ϴ�.");
			st.close();
			
			
			//////////////////////
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ���� : �ּҳ� ���� ��� Ʋ��");
		}
		
		
	}
}
