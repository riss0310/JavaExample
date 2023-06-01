package Exe;

import java.util.Scanner;

import Student.StudentService;
import common.DTO;

public class Application extends DTO{
	
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	
	public Application() {
		menu();
	}
	
	private void menu() {
		System.out.println("학생 정보관리 프로그램");
		System.out.println();
		System.out.println(" 1. 학생 등록 | 2. 학생 성적 입력 | 3. 학생 정보 수정 | 4. 학생 정보 조회 ");
		System.out.println();
		System.out.println("입력 >");
		String selectNo = sc.nextLine();
			switch(selectNo) {
			case "1" : 
				ss.registerStudent();
				break;
			case "2" : 
				ss.putGrade();		
				break;
			case "3" : 
				ss.updateInfo();
				break;
			case "4" : 
				ss.getStudentInfo();
				break;
			default:
				System.out.println("적절하지 않은 번호입니다.");
			
	}
	}
	

	
	
	
	
}
