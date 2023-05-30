package Exe;

import java.util.Scanner;

import Admin.AdminDAO;
import Admin.AdminService;
import Student.Student;
import Student.StudentService;
import lecture.LectureService;

public class AdminApp {
	private boolean loggedIn = false;
	StudentService ss = new StudentService();
	LectureService ls = new LectureService();
	
    Scanner sc = new Scanner(System.in);
	    public AdminApp() {

	    	AdminService as = new AdminService();
	    	adminMenu();
	    }

	  //관리자 모드
		public void adminMenu() {
		Scanner sc = new Scanner(System.in);
	    boolean loggedIn = false;
	    boolean flag = true;

		while (flag) {
		  	System.out.println(" 관리자 메뉴 ");
		  	System.out.println("=====================================");
		    System.out.println("1. 관리자 등록 | 2. 관리자 로그인  ");
		    System.out.println("=====================================");
		    System.out.print("메뉴를 선택하세요: ");
	    int menu = Integer.parseInt(sc.nextLine());

		 	switch (menu) {
			  	case 1:

			  		 AdminService.registerAdmin();
			  		 break;
			  	case 2:
			  		
			  		loggedIn = AdminService.adminLogin();
			  		adminLogged();
			  		break;
			  	default:
			  		System.out.println("적절하지 않은 번호입니다.");
			  		break;
			            }
			}
		    }
		


		//관리자 로그인 후 메뉴
		private void adminLogged( ) {
			Scanner sc = new Scanner(System.in);
			boolean run = true;
		while(true) {
	        System.out.println("===========================================================");
			System.out.println(" 1.수강생 정보 삭제  | 2. 수강생 정보 조회 | 3. 관리자 로그아웃   ");
	        System.out.println("===========================================================");
	        System.out.print("메뉴를 선택하세요: ");
	    int menu = Integer.parseInt(sc.nextLine());
	        switch (menu) {
		        case 1:
	
		        		AdminService as= new AdminService();
			        as.deleteStudentInfo();
				   
		            break;
		        case 2:
		        	inquiryStudent();
		            break;
		        case 3:
		        	 if (loggedIn) {
		        		 loggedIn = false;
		     	        AdminService.adminLogout();
		     	    } else {
		     	        System.out.println(" 로 그 아 웃 ");
		     	    }
		     	    break;
		        default:
		            System.out.println("적절하지 않은 번호입니다.");
		            break;
		    }
		}
		}

		
		//수강생 정보 조회
		private void inquiryStudent() {
			AdminService as = new AdminService();
			while (true) {
				System.out.println("==========================================");
				System.out.println("1. 전체 수강생 조회 | 2.개별 수강생 조회  ");
				System.out.println("==========================================");
				int menu = Integer.parseInt(sc.nextLine());
				if (menu == 1) {
					as.getAllStudent();
				} else if (menu == 2) {
				System.out.println("수강생 ID 입력>");
				String Id = sc.nextLine();
				Student s=AdminDAO.getInstance().getStudentById(Id);
				System.out.println("ID: "+s.getStudentName() + "입니다.");
				System.out.println("Tel: " + s.getStudentTel() + "입니다.");
				System.out.println("Address: " + s.getStudentAddress() + "입니다.");
				
				} else if (menu == 3) {
					
				}
				}

			

		}
		
		
	
		
}
