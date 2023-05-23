package common;
//~~~~~~~~~~~~~~~~~~~~~~~~JDBC 연결법~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {
	//DAO -> Data(DB) Access Object
	//JDBC 를 통해서 JAVA<->DB가 연결이 된다.
	
	//java -> DB 연결할때 쓰는 객체
	protected Connection conn = null;
	
	//Query문 (SQL, 질의)을 가지고 실행 하는 객체
	protected PreparedStatement pstmt = null;
	
	//Query문 (SQL, 질의)을 가지고 실행하는 객체
	protected Statement stmt = null;
	
	//SELECT(조회) 결과 값을 반환받는 객체
	protected ResultSet rs = null;
	
	//DB 접속 정보
	String driver ="oracle.jdbc.driver.OracleDriver";
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_id = "system";
	String db_pw = "1234";
	
	//DB 연결 메소드
	public void conn() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(db_url,db_id,db_pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//DB 연결 해제 (사용한건 다 닫아주기) DB접속 가능자 수는 제한 되어있으므로 연결을 끊어서 길 터놔야함
	public void disconn() {
		try {//if-else문은 하나만 닫히고 나머지는 안닫힐 위험이 있으므로 if만 사용하기
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//정남매 타코야끼 먹고 싶다/
	
	
	
	
}
