package Exe;

import java.util.Scanner;
import Admin.AdminService;
import Student.StudentService;
import lecture.LectureService;

public class StudentApp {
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	LectureService ls = new LectureService();
	AdminService as = new AdminService();
	
	public StudentApp() {
		Student();
	}
	
	public void Student() {
		System.out.println("=========================================================================================");
		System.out.println(" 1. 회원 정보 조회 | 2. 회원 정보 수정 | 3. 수강신청 | 4. 로그아웃 |  5. 관리자 메뉴 | 6. 뒤로가기 ");
		System.out.println("=========================================================================================");
		System.out.println("입력>");
		StudentService ss = new StudentService();
		boolean run = true;
		while(run) {
			int selectNo = Integer.parseInt(sc.nextLine()); 
			
			switch(selectNo) {
			case 1:
				ss.getStudentInfo();
				break;
			case 2:
				ss.updateStudentInfo();
				break;
			case 3:
				ls.addLecture();
				break;
			case 4: 
				ss.logout();
				break;
			case 5:
				as.adminMenu();
				break;
			case 6: 
				run = false;
				break;
			default: 
				System.out.println("적절하지 않은 번호입니다.");
				break;
			}
		}
	}

	private void logout() {
		
	}

	private void exit() {
	
	}

	
	
	
	
	
	
}
