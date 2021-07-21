import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcInsert {
	
	public static void main(String[] args) {
	Connection con = null;
	Statement stmt = null; 
	Scanner sc = new Scanner(System.in);
	System.out.print("num컬럼 : ");
	int n = sc.nextInt();
	System.out.print("str컬럼: ");
	String a = sc.next();
	
	// resultSet은 SELECT구문에 대한 결과만 처리함. 이외 구문에는 불필요.
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/sqldb";
		con = DriverManager.getConnection(url, "root", "mysql");	
		
		stmt = con.createStatement();
		// 쿼리문이 길다면 아래와 같이 + 로 여러줄로 나눠 연결합니다.
		String sql = "INSERT INTO JDBCInsert (num, str)" + 
					"VALUES (" + n + ", '" + a + "')";
		System.out.println(sql);
		// SELECT문은 executeQuery(sql구문); 형식으로 호출하지만
		// 이외 구문은 executeUpdate(sql구문); 으로 호출합니다.
		stmt.executeUpdate(sql);
			
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		System.out.println("에러 : " + e);
	} finally {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
			}
		}
	}
}
