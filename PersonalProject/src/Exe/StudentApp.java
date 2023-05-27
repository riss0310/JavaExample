package Exe;

import java.util.Scanner;

import Student.StudentService;
import lecture.LectureService;

public class StudentApp {
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	LectureService ls = new LectureService();
	
	public StudentApp() {
		studentrun();
	}
	
	private void studentrun() {
		boolean flag = true;
		while(flag) {
		menu();
		String selectNo = sc.nextLine();
		switch(selectNo) {
		case "1":
			ss.login();
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
			ss.getStudentInfoAdmin();
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
	
	//회원메뉴
	private void menu() {
		System.out.println(" 1.로그인 | 2.로그아웃 | 3.회원가입 | 4.수강신청 | 5.회원 정보 조회 | 6.회원 정보 수정 | 7.종료 ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
