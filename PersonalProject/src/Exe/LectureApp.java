package Exe;

import java.util.Scanner;
import Admin.AdminService;
import Student.StudentService;
import lecture.LectureService;

public class LectureApp {
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	LectureService ls = new LectureService();
	AdminService as = new AdminService();
			
	
	private void lecturerun() {
		boolean flag = true;
		while(flag) {
		menu();
		String selectNo = sc.nextLine();
		switch(selectNo) {
		case "1":
			ss.studentLogin();
			break;
		case "2":
			
			break;
		case "3":
			ss.insertStudent();
			break;
		case "4":
			ls.addLecture();
			break;
		case "5":
			ss.getStudentInfo();
//			ss.getStudentInfoAdmin();
			break;
		case "6":
			
			break;
		case "7":
			flag = false;
			System.out.println("종료");
			StudentService.studentInfo = null;
					
			break;

		}		
		
		
		}
	}

	private void menu() {
		System.out.println(" 1.로그인 | 2.로그아웃 | 3.회원가입 | 4.수강신청 | 5.회원 정보 조회 | 6.회원 정보 수정 | 7.종료");		
	}	
}
