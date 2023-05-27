package Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
	private String studentId;
	private String studentPw;
	private String studentName;
	private String studentTel;
	private String studentAddress;
	private String currentLecture;
	

	
	//강좌 조회용 필드 추가
	private String lectureId;
	private String lectureName;
	
	
	//회원가입용
	private String insertStudent;
	
	//사용자 조회
	private String getStudentInfo;
	
	//수강생 전체 조회
	private String getStudentInfo1;
	 //수강생 개별 조회
	private String getStudentInfoAdmin;
	
	
	
}
