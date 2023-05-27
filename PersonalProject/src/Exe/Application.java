package Exe;

import java.sql.SQLException;

import java.util.Scanner;

import Student.StudentService;
import common.DAO;
import lecture.LectureService;

public class Application extends DAO{
	
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
	LectureService ls = new LectureService();
	
			
	public Application() {
		menu();
	}

//	private void run() {
//		int selectNo=0;
//		while(selectNo != 3) {
//			menu();
//			switch(selectNo) {
//			case 1 : 
//				Student();
//				break;
//			case 2 :
//				ss.insertStudent();
//				break;
//			case 3 :
//				System.out.println(" 종 료 ");
//				break;
//			}
//		}
//	}
	
	private void menu() {
		System.out.println("문화센터 프로그램");
		System.out.println();
			System.out.println(" 1. 로 그 인 | 2. 회 원 가 입 | 3. 종 료 | 4. 뒤로 가기 ");
			System.out.println("입력 >"); 
			String selectNo = sc.nextLine(); 
			switch(selectNo) {
			case "1": 
				
						
				ss.login();
				
				Student();
				
				break;
			case "2":
				ss.insertStudent();
				break;
			case "3": 
				exit();
				break;
			case "4" : 
				break;
			default:
				System.out.println("적절하지 않은 번호입니다");
				break;
		}
	}


	
	
	public void Student() {
		System.out.println("=========================================================================");
		System.out.println(" 1. 회원 정보 조회 | 2. 회원 정보 수정 | 3. 수강신청 | 4. 로그아웃 | 5. 뒤로가기 | 6.종  료");
		System.out.println("=========================================================================");
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
				logout();
				break;
			case 5:
				run = false;
				break;
			case 6:
				exit();
				break;
			}
		}
	}
	
	private void logout() {
	
		
	}

	
	
	
	//회원가입
	public void insertStudent()  {
	int result = 0;
	 try {
		 conn();
		 String sql = "insert into student(student_id,student_pw,student_name,student_tel,student_address)"
				 	+ "values(?,?,?,?,?)";
		 
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, sql);
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally {
		 disconn();
	 }
	}
	
	//수강신청
	public void addLecture() {
		int result = 0;
		try {
			conn();
			
		}catch(Exception e) {
			e.printStackTrace();
			String sql = "insert into student (lecture_name)"
					+ "values(?)";
		}finally {
			disconn();
		}
	}
	
	
	
	
	//회원 정보 조회
	public void getStudentInfo() throws SQLException {
	int result = 0;
	try {
		conn();
		
	}catch(Exception e){
		
		e.printStackTrace();
		String sql = "select * from student";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sql);
		
	}finally {
		
		disconn();
		}
	}
	
	//회원 정보 수정
	public void UpdateStudentInfo()  {
	

	}
	
	
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
	public void run1() {
		StudentService ss = new StudentService();
		while (true) {
			System.out.println("1. 전체 수강생 조회 | 2.개별 수강생 조회");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				ss.getStudentInfo();
			} else if (menu == 2) {
				ss.getStudentInfoAdmin();
			} else if (menu == 3) {
				break;
			}

		}

	}
	
	//수강생 정보 관리
		//수강생 정보 수정
			//주소
			//연락처
		//회원정보 삭제
			//수강생 정보 개별 삭제
			//수강생 정보 전체 삭제
	
	//로그아웃
	
	
	
	
	
	
	
	
	
//	private void ru() {
//		while(true) {
//				System.out.println("============================================================================");
//				System.out.println(" 1.로그인 | 2.로그아웃 | 3.회원가입 | 4.수강신청 | 5.회원 정보 조회 | 6.회원 정보 수정 | 7.종료 ");
//				System.out.println("============================================================================");
//				int menu = Integer.parseInt(sc.nextLine());
//				if(menu == 1) {
//					//로그인 기능
//					if(StudentService.studentInfo == null) {
//						ss=new StudentService();
//						ss.login();
//						}
//					}else if(menu == 2) {
//						System.out.println("로 그 아 웃");
//						break;
//					}
//					if(menu == 3) {
//						System.out.println("회 원 가 입");
//						ss.insertStudent();
//						System.out.println();
//						
//					}else if(menu == 4) {
//						System.out.println("수 강 신 청");
//						ls.addLecture();
//					}else if(menu == 5) {
//						System.out.println("회원 정보 조회");
//						ss.getStudentInfo();
//						ss.getStudentInfoAdmin();
//					}else if(menu == 6) {
//						System.out.println("회원 정보 수정");
//						
//					}else if(menu == 7) {
//						System.out.println("종 료");
//						exit();
//						
//					}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
}
