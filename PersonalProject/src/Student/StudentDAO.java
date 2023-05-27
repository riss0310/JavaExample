package Student;

import java.util.ArrayList;
import java.util.List;

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
		Student std = null;
		try {
			conn();
			String sql = "SELECT * FROM student WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				std = new Student();
				std.setStudentId(rs.getString("student_id"));
				std.setStudentPw(rs.getString("student_pw"));
//				std.setStudent_name(rs.getString("student_name"));
				
			}
					
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return std;
	}

	
	//회원 가입
	public int insertStudent(Student std) {
		int result = 0;
		try {
			conn();
			String sql = "insert into student(student_id,student_pw,student_name,student_tel,student_address) "
					+ "values(?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentId());
			pstmt.setString(2, std.getStudentPw());
			pstmt.setString(3, std.getStudentName());
			pstmt.setString(4, std.getStudentTel());
			pstmt.setString(5, std.getStudentAddress());
			
			result = pstmt.executeUpdate();
					
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}

	//사용자 회원 정보 조회
	public Student getStudentInfo(String id) {
	Student std = null;
	
	try {
		conn();	
		String sql = "select * from student where student_id = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			std = new Student();
			std.setStudentId(rs.getString("student_id"));
			std.setStudentName(rs.getString("student_name"));
			std.setStudentTel(rs.getString("student_tel"));
			std.setStudentAddress(rs.getString("student_address"));
			std.setCurrentLecture(rs.getString("lecture_name"));
		}		
	}catch(Exception e){
		e.printStackTrace();
	}finally {
		disconn();
	}
	return std;

	}

	
	

	//관리자 모드
	
	
		//관리자 등록
		
		
		//관리자 로그인
		
		
		//강의 관리
			//강의 등록
			//강의 삭제
			//수강신청 승인
		
		//수강생 정보 조회
	
			//전체 수강생 조회
	public Student getStudentInfo1() {
		Student std = null;
		
		try {
			conn();	
			String sql = "select * from student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				std = new Student();
				std.setStudentId(rs.getString("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTel(rs.getString("student_tel"));
				std.setStudentAddress(rs.getString("student_address"));
				std.setCurrentLecture(rs.getString("lecture_name"));

			}		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return std;
		
	}	
	
	
	
	
			//개별 수강생 조회
	public Student getStudentInfoAdmin(String id) {
		Student std = null;
		
		try {
			conn();	
			String sql = "select * from student where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				std = new Student();
				std.setStudentId(rs.getString("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTel(rs.getString("student_tel"));
				std.setStudentAddress(rs.getString("student_address"));
				std.setCurrentLecture(rs.getString("lecture_name"));
			}		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return std;


		
		
		
		
		
		
		//수강생 정보 관리
			//수강생 정보 수정
				//주소
				//연락처
			//회원정보 삭제
				//수강생 정보 개별 삭제
				//수강생 정보 전체 삭제
		
		//로그아웃


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}