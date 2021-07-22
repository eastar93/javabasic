import java.sql.*;

public class OjdbcSelect {
	
	public static void main(String[] args) {
		// Oracle SQL과 연동해서
		// Employees 테이블의 모든 인원에 대한 정보를
		// 콘솔창에 띄워주세요.
		// SELECT employee_id, first_name, hire_date, job_id, salary FROM employees;
		// 에 대한 결과물을 콘솔창에 띄워주시면 됩니다.
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// Oracle SQL과 연동할것임을 나타냄
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//접속 URL도 Oracle SQL에 맞춰서 적습니다.
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "hr", "hr");
			
			stmt = con.createStatement();
			
			String ora = "SELECT employee_id, first_name, hire_date, "
					+ "job_id, salary FROM employees";
			
			rs = stmt.executeQuery(ora);
			
			while(rs.next()) {
				int emp_id = rs.getInt(1);
				String f_name = rs.getString(2);
				Date h_date = rs.getDate(3);
				String job_id = rs.getString(4);
				int salary = rs.getInt(5);
				System.out.println("아이디 : " + emp_id + 
									", 성 : " + f_name + 
									", 입사일 : " + h_date +
									", 직무명 : " + job_id + 
									", 연봉 : " + salary);
			}
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
