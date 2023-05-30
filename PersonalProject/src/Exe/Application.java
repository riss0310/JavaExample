package Exe;

import java.util.Scanner;

import Admin.AdminService;
import Student.StudentService;
import common.DAO;
import lecture.LectureService;

public class Application extends DAO{
	
	Scanner sc = new Scanner(System.in);

	public Application() {
		menu();
	}

	
	private void menu() {
		System.out.println("문화센터 프로그램");
		System.out.println();
    	System.out.println("=====================================");
		System.out.println(" 1. 로 그 인 | 2. 회 원 가 입 | 3. 관 리 자 ");
        System.out.println("=====================================");
		System.out.println("입력 >"); 
		String selectNo = sc.nextLine(); 
		StudentService ss = new StudentService();
			switch(selectNo) {
			case "1": 
				ss.studentLogin();
				StudentApp sa= new StudentApp();
				sa.Student();
				break;
			case "2":
				ss.insertStudent();
				break;
			case "3":
				AdminApp aa = new AdminApp();
				aa.adminMenu();
			default:
				System.out.println("적절하지 않은 번호입니다");
				break;
		}
	}

	//회원 정보 수정
	public void UpdateStudentInfo()  {}
	
	//종료
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}


	
}
