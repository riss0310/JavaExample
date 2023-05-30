package Admin;

import java.util.List;
import java.util.Scanner;

import Student.Student;
import Student.StudentDAO;

public class AdminService {
	public static Admin adminInfo = null;
	Scanner sc = new Scanner(System.in);
	
	
	public AdminService() {
		
	}
	  
	//관리자 등록
	public static void registerAdmin() {
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin();
		
		System.out.println("관리자 등록");
		
		System.out.println("adminID>");
		admin.setAdminId(sc.nextLine());
		
		System.out.println("adminPW>");
		admin.setAdminPw(sc.nextLine());
		
		int result = AdminDAO.getInstance().registerAdmin(admin);
		if(result>0) {
				System.out.println("관리자 등록 완료");
			}else {
				System.out.println("관리자 등록 실패");
			}
	}
	
	
	
	//관리자 로그인
	public static boolean adminLogin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("관리자 로그인");
		System.out.println("관리자 ID>");
		String id = sc.nextLine();
		System.out.println();
		
		System.out.println("관리자 PW");
		String pw = sc.nextLine();
		System.out.println();
		Admin admin = AdminDAO.getInstance().login(id);
		
		if(admin != null) {
			if(admin.getAdminPw().equals(pw)) {
				System.out.println("관리자 로그인 성공");
				adminInfo = admin;
				System.out.println();
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println();
			}
		}
		return false;
	}
	
	//관리자 로그아웃
	public void logout() {
		System.out.println("로그아웃");
		adminInfo = null;
	}

	public void deleteStudentInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 수강생 ID>");
		String id = sc.nextLine();
		int result = AdminDAO.getInstance().deleteStudentById(id);
		if(result > 0) {
			System.out.println("수강생 정보 삭제 완료");
		}else{
			System.out.println("삭제 실패");
		}
	}
	public static void adminLogout() {}
	

	//수강생 전체 조회
	public void getAllStudent() {
		System.out.println("========수강생 정보 조회========");
		System.out.println("");
		
		List<Student> list= StudentDAO.getInstance().getStudentById();
		for(int i = 0; i<list.size(); i++) {
			System.out.println("회원 이름 : " + list.get(i).getStudentName());
			System.out.println("회원 연락처 : " + list.get(i).getStudentTel());
			System.out.println("회원 주소 : " + list.get(i).getStudentAddress());
			System.out.println("현재 수강중인 강 의 : " + list.get(i).getLectureName());
			System.out.println("");	
		}
	}
	
//	public void getStudentById() {
//		StudentDAO.getInstance().getStudentInfoAdmin(id);
////		S
////		System.out.println("=========수강생 개별 조회=========");
////		System.out.println("회원 이름 : " + rs.getStudentName());
////		System.out.println("회원 연락처 : " + list.get(i).getStudentTel());
////		System.out.println("회원 주소 : " + list.get(i).getStudentAddress());
////		System.out.println("현재 수강중인 강 의 : " + list.get(i).getLectureName());
////		System.out.println("");	
//	}
//	
	
	public void deleteStudentById(String studentId) {
		System.out.println("=======수강생 정보 삭제========");
		System.out.println("삭제 할 ID를 입력>");
		String id = sc.nextLine();
		int result = AdminDAO.getInstance().deleteStudentById(id);
		if (result > 0) {
		System.out.println("삭제가 완료 되었습니다.");
		    }
	}

	public void adminMenu() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
