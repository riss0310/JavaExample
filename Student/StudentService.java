package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	public static Student studentInfo = null;
	Scanner sc = new Scanner(System.in);
	
	//로그인 콘솔
	public void login() {
		System.out.println(" 로 그 인 ");
		System.out.println("ID>");
		String id = sc.nextLine();
		
		System.out.println("PW>");
		String pw = sc.nextLine();
		
		Student student = StudentDAO.getInstance().login(id);
		
		if(student != null) {
			if(student.getStudent_pw().equals(pw)) {
				System.out.println("🎉환영합니다🎉");
				studentInfo = student;
				studentApp();
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}	
	}



		public void studentApp() {
		// TODO Auto-generated method stub
		
	}



	//회원가입
	public void insertStudent() {
		Student std = new Student();
		
		System.out.println("⁂회 원 가 입⁂");
		
		System.out.println("ID>");
		std.setStudent_id(sc.nextLine());
		
		System.out.println("PW>");
		std.setStudent_pw(sc.nextLine());
		
		System.out.println("NAME>");
		std.setStudent_name(sc.nextLine());
		
		System.out.println("TEL>");
		std.setStudent_tel(sc.nextLine());
		
		System.out.println("ADDRESS>");
		std.setStudent_address(sc.nextLine());
		
		int result = StudentDAO.getInstance().insertStudent(std);
		if(result>0) {
			System.out.println("✨ 등 록 성 공 ✨");
		}else {
			System.out.println("실패했습니다.");
		}
		
	}



	public void getstudentInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	//회원 정보 조회

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
