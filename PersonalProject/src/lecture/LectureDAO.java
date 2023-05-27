package lecture;


import Student.StudentService;
import common.DAO;

public class LectureDAO extends DAO{
	private static LectureDAO lectureDao = null;
	
	
	private LectureDAO() {
		
	}
	//수강신청
	public int addLecture(String lectureName) {
		
		int result = 0;
		try {
			conn();
			String sql = "insert into lecture_permission values( ? , 'N') where student_id = ?";
					
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lectureName);
			pstmt.setString(2, StudentService.studentInfo.getStudentId());
			
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	

	//강의 관리
	//강의 등록
	public int insertLecture(Lecture lec) {
		int result = 0;
		try {
		conn();
		String sql = "insert into lecture(lecture_id,lecture_name,lecture_day, lecture_teach)"
				+ "values(?,?,?,?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, lec.getLectureId());
		pstmt.setString(2, lec.getLectureName());
		pstmt.setString(3, lec.getLectureDay());
		pstmt.setString(4, lec.getLectureTeach());
		
		result = pstmt.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
//	public static LectureDAO getInstance() {
//		if(lectureDao == null) {
//			lectureDao = new LectureDAO();
//		}
//		return lectureDao;
//	}


	
	
	//강의 삭제 기능

	public int deleteLecture(Lecture lecture) {
		int result = 0;
		try {
			conn();
			String sql = "delete from lecture where lecture_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lecture.getLectureName());
			
			result = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수강신청 승인
public int adminLecture(String lectureName) {
	
	int result = 0;
	try {
		conn();
		String sql = "insert into lecture_permission values( ? , 'y')";
				
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, lectureName);
		
		
		result = pstmt.executeUpdate();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		disconn();
	}
	return result;
}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


