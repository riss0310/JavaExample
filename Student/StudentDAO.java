package Student;

import common.DAO;

public class StudentDAO extends DAO{
	private static StudentDAO studentDao = null;
	private StudentDAO() {
		
	}
	
	public static StudentDAO getInstance() {
		if(studentDao == null) {
			studentDao = new StudentDAO();
		}
		return studentDao;
	}
	
	
	//로그인 기능
	public Student login(String id) {
		Student student = null;
		try {
			conn();
			String sql = "SELECT * FROM student WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				student = new Student();
				student.setStudent_id(rs.getString("student_id"));
				student.setStudent_pw(rs.getString("student_pw"));
				student.setStudent_name(rs.getString("student_name"));
				
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return student;
	}

	
	//회원 가입
	public int insertStudent(Student student) {
		int result = 0;
		try {
			conn();
			String sql = "insert into student values('?','?','?','?','?')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, student.getStudent_id());
			pstmt.setString(2, student.getStudent_pw());
			pstmt.setString(3, student.getStudent_name());
			pstmt.setString(4, student.getStudent_tel());
			pstmt.setString(5, student.getStudent_address());
			
			result = pstmt.executeUpdate();
					
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
