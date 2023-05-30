package lecture;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Lecture {
	private String lectureId;
	private String lectureName;
	private String lectureDay;
	private String lectureTeach;
		
	//수강신청
	private String addLecture;
	
	//강의등록
	private String insertLecture;
	
	//강의삭제
	private String deleteLecture;
	
	//수강신청 승인
	private String authLecture;

	public void setLectureId(String nextLine) {
	
	}

	public void setLectureName(String nextLine) {

	}

	public void setLectureDay(String nextLine) {

	}

	public void setLectureTeach(String nextLine) {
	
	}

	public void getLectureId(String string) {

	}

	public void getLectureName(String string) {
	}

	public void getLectureDay(String string) {
	}

	public void getLectureTeach(String string) {
	}
}

