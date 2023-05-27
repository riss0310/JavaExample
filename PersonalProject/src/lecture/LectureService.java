package lecture;

import java.util.Scanner;

public class LectureService {

	public static Lecture lectureInfo = null;
	Scanner sc = new Scanner(System.in);
	public LectureService() {
		
	}
	
	//수강생 수강신청
	public void addLecture() {
		
		System.out.println("수강신청 할 과목입력>");
		String lectureName = sc.nextLine();
		
		int result = LectureDAO.getInstance().addLecture(lectureName);
		if(result>0) {
			System.out.println("수강신청 성공");
		}else {
			System.out.println("수강신청 실패");
		}
		
		
		
		
		
	}
	

	//강의 관리
		//강의 등록
	
	public void insertLecture() {
		Lecture lecture = new Lecture();
		
		System.out.println("✨강 의 등 록✨");
		
		System.out.println("LECTURE ID>");
		lecture.setLectureId(sc.nextLine());
		
		System.out.println("LECTUE NAME>");
		lecture.setLectureName(sc.nextLine());
		
		System.out.println("LECTURE DAY>");
		lecture.setLectureDay(sc.nextLine());
		
		System.out.println("LECTURE INSTRUCTOR>");
		lecture.setLectureTeach(sc.nextLine());
	
		int result = LectureDAO.getInstance().insertLecture(lecture);
		if(result>0) {
			System.out.println("✨ 등 록 성 공 ✨");
		}else {
			System.out.println("실패했습니다..");
		}
	}
	
	
		//강의 삭제
	public void deleteLecture() {
		Lecture lecture = new Lecture();
		
		System.out.println("강의 삭제");
		
		System.out.println("LECTURE NAME TO DELETE>");
		int result = LectureDAO.getInstance().deleteLecture(lecture);
		if(result>0) {
			System.out.println("DELETED!");
		}else {
			System.out.println("FAILD");
		}
				
		
		
		
	}
	
	
	
	
	//수강신청 승인
	
	
	
	
	
	
	
	
	
	
	
	
}
