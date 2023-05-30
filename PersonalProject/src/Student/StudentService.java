package Student;

import java.util.Scanner;
import lecture.Lecture;
import lecture.LectureDAO;

public class StudentService {
	public static Student studentInfo = null;
	Scanner sc = new Scanner(System.in);
	
	public StudentService() {
		
	}
	//로그인 콘솔
	public boolean studentLogin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 로 그 인 ");
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("");
		
		System.out.println("PW>");
		String pw = sc.nextLine();
		System.out.println();
		Student student = StudentDAO.getInstance().studentLogin(id);
		
		if(student != null) {
			if(student.getStudentPw().equals(pw)) {
				System.out.println(" 환영합니다 ");
				studentInfo = student;
				System.out.println("");

			}else {
				System.out.println("로그인에 실패했습니다.");
				System.out.println("");
			}
		}
		return false;
	}
	
	//수강생 로그아웃
	public void logout() {
		System.out.println("로그아웃");
		studentInfo = null;
	}
	

	//회원가입
	public void insertStudent() {
		Student std = new Student();
		
		System.out.println("회 원 가 입");
		
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
			System.out.println(" 등 록 성 공 ");
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
		
		Student std = new Student();
		
		System.out.println("강좌명 입력>");
		String lecture_id = sc.nextLine();
		
		int result= LectureDAO.getInstance().addLecture(lecture_id);
		if(result>0) {
			System.out.println("수강신청 성공");
		}else {
			System.out.println("수강신청 실패");
		}
	}

	//사용자 회원 정보 조회
	public void getStudentInfo() {
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("");
		
		Student std = StudentDAO.getInstance().getStudentInfo(id);
		
			
			System.out.println("회원 이름 : " + std.getStudentName());
			System.out.println("회원 연락처 : " + std.getStudentTel());
			System.out.println("회원 주소 : " + std.getStudentAddress());
			System.out.println("현재 수강중인 강의 : " + std.getLectureName());
			System.out.println("");
	}

	
	//회원 정보 조회
	public void updateStudent(Student student) {
		Student std = StudentDAO.getInstance().updateStudent();
		System.out.println("회원 정보 수정");
		System.out.println();
		System.out.println("");
	}

	//종료
	private void exit() {
		System.out.println("종  료");
	}
		
		//수강생 정보 조회
			//전체 수강생 조회
			//개별 수강생 조회
	
	
	//사용자 회원 정보 수정
	public void updateStudentInfo() {
		System.out.println("회원 정보 수정");
		System.out.println("변경할 정보 입력");
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
	public void Student() {
	}


		
		//로그아웃
	
}
