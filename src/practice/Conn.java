package practice;

import java.sql.*;

public class Conn {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.oracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:oracl:thin:@localhost:1521:xe","mdm","mdm");
		if(con==null)
			System.out.println("jdbc connection is not establlished");
		else
			System.out.println("jdbc connection is established");
}

}
