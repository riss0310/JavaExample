package Exe;

import java.util.Scanner;

import Student.StudentService;
import common.DAO;

public class Application extends DAO{
	Scanner sc = new Scanner(System.in);
	StudentService ss = new StudentService();
			
	public Application() {
		run();
	}

	private void run() {
		while(true) {
			if(StudentService.studentInfo==null) {
				System.out.println((" 1.로그인 | 2.로그아웃 | 3.회원가입 | 4.수강신청 | 5.회원 정보 조회 | 6.회원 정보 수정 | 7.종료\""));
				int menu = Integer.parseInt(sc.nextLine());
				if(menu == 1) {
					//로그인 기능
					if(StudentService.studentInfo != null) {
						ss.login();
					}else if(menu ==2) {
						System.out.println("로그아웃");
					}else if(menu ==3) {
						
					}else if(menu ==4) {
						
					}else if(menu ==5) {
						
					}else if(menu ==6) {
						
					}else if(menu ==7) {
						System.out.println("종료");
					}
				}
			}
			
		}
	
	}

	
	
	//회원가입
	public void insertStudent()  {
	int result = 0;
	 try {
		 conn();
		 String sql = "insert into lecture values(?,?,?,?)";
		 
		 pstmt = conn.prepareStatement(sql);
		 pstmt.setString(1, sql);
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }finally {
		 disconn();
	 }
	 	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
