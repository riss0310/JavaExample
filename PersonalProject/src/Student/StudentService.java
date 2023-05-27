package Student;

import java.util.List;
import java.util.Scanner;

import lecture.Lecture;

public class StudentService {
	public static Student studentInfo = null;
	Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		
	}
	//로그인 콘솔
	public void login() {
		System.out.println(" 로 그 인 ");
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("");
		
		System.out.println("PW>");
		String pw = sc.nextLine();
		System.out.println();
		Student student = StudentDAO.getInstance().login(id);
		
		if(student != null) {
			if(student.getStudentPw().equals(pw)) {
				System.out.println("🎉 환영합니다 🎉");
				studentInfo = student;
				System.out.println("");

			}else {
				System.out.println("비밀번호가 틀렸습니다..");
				System.out.println("");
			}
		}
	}

	//회원가입
	public void insertStudent() {
		Student std = new Student();
		
		System.out.println("⁂⁂⁂회 원 가 입⁂⁂⁂⁂");
		
		System.out.println("ID>");
		std.setStudentId(sc.nextLine());
		
		System.out.println("PW>");
		std.setStudentPw(sc.nextLine());
		
		System.out.println("NAME>");
		std.setStudentName(sc.nextLine());
		
		System.out.println("TEL>");
		std.setStudentTel(sc.nextLine());
		
		System.out.println("ADDRESS>");
		std.setStudentAddress(sc.nextLine());

		int result = StudentDAO.getInstance().insertStudent(std);
		if(result>0) {
			System.out.println("✨ 등 록 성 공 ✨");
		}else {
			System.out.println("실패했습니다..");
		}		
	}
	
	
	//사용자 수강관리
	
	//수강신청
	public void addLecture() {
		Lecture lec = new Lecture();
		
		System.out.println("수 강 신 청");
		
		System.out.println();
		
		
	}

	

	//사용자 회원 정보 조회
	public void getStudentInfo() {
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("");
		
		Student std = StudentDAO.getInstance().getStudentInfo(id);
		
			System.out.println("회원 아이디 : " + std.getStudentId());
			System.out.println("회원 이름 : " + std.getStudentName());
			System.out.println("회원 연락처 : " + std.getStudentTel());
			System.out.println("회원 주소 : " + std.getStudentAddress());
			System.out.println("현재 수강중인 강의 : " + std.getCurrentLecture());
			System.out.println("");
		
		
	}

	
	
	//회원 정보 수정
	
	
	
	
	
	//종료
	private void exit() {
		
	}

	//관리자 모드
	
	
		//관리자 등록
		
		
		//관리자 로그인
		
		
		//강의 관리
			//강의 등록
			//강의 삭제
			//수강신청 승인
		
		//수강생 정보 조회
			//전체 수강생 조회
			//개별 수강생 조회
	public void getStudentInfo1() {
		System.out.println("========회원 정보 조회========");
		System.out.println("");
		
		Student std = StudentDAO.getInstance().getStudentInfo1();
		for(int i = 0; i<0; i++) {
			System.out.println("회원 아이디 : " + std.getStudentId());
			System.out.println("회원 이름 : " + std.getStudentName());
			System.out.println("회원 연락처 : " + std.getStudentTel());
			System.out.println("회원 주소 : " + std.getStudentAddress());
			System.out.println("현재 수강중인 강의 : " + std.getCurrentLecture());
			System.out.println("");	
		}
	}
	
	//개별조회 수정해야함
	public void getStudentInfoAdmin() {
		System.out.println("========회원 정보 조회========");
		System.out.println("");
		String id = sc.nextLine();
		
		Student std = StudentDAO.getInstance().getStudentInfoAdmin(id);
		for(int i = 0; i<0; i++) {
			System.out.println("회원 아이디 : " + std.getStudentId());
			System.out.println("회원 이름 : " + std.getStudentName());
			System.out.println("회원 연락처 : " + std.getStudentTel());
			System.out.println("회원 주소 : " + std.getStudentAddress());
			System.out.println("현재 수강중인 강의 : " + std.getCurrentLecture());
			System.out.println("");	
		}
	}
	public void updateStudentInfo() {
		System.out.println("회원 정보 수정");
		System.out.println();
		Student student = new Student();
		System.out.println("ID > ");
		String id = sc.nextLine();
		
		System.out.println("NAME > ");
		String name = sc.nextLine();
		
		System.out.println("TEL > ");
		String tel = sc.nextLine();
		
		System.out.println("ADDRESS > ");
		String address = sc.nextLine();
		
		System.out.println("");
		
	}

	
	
	
	
	
	//수강생 정보 관리
			//수강생 정보 수정
				//주소
				//연락처
			//회원정보 삭제
				//수강생 정보 개별 삭제
				//수강생 정보 전체 삭제
		
		//로그아웃
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
