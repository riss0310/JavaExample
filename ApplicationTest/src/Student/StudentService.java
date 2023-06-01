package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentService {
	private static final String studentId = null;
	Scanner sc = new Scanner(System.in);
	Student std = new Student();
	private List<StudentDTO> students;

	//학생 등록
	public void registerStudent() {
		Student std = new Student();
		
		System.out.println("ID 입력>");
		std.setStudentId(sc.nextLine());
		
		System.out.println("이름 입력>");
		std.setStudentName(sc.nextLine());
		
		System.out.println("강의실 입력>");
		std.setStudentClass(sc.nextLine());
		
		System.out.println("주소 입력>");
		std.setStudentAdder(sc.nextLine());
		
		System.out.println("전화번호 입력>");
		std.setStudentTel(sc.nextLine());

		int result = StudentDTO.getInstance().registerStudent(std);
		if(result>0) {
			System.out.println("학생 정보 입력 성공");
		}else {
			System.out.println("학생 정보 입력 실패");
		}
	}
	
	//학생 성적 입력
	public void putGrade() {
		System.out.println("ID 입력>");
		String studentId = sc.nextLine();
		
		StudentDTO student = studentById(studentId);
		
		System.out.println("========성적 입력========");
		System.out.println("1.국어 | 2.영어 | 3.수학" );
		std.setStudentId(sc.nextLine());
		
	
		if(student != null) {
			System.out.print("국어 점수 입력: ");
            int korScore = Integer.parseInt(sc.nextLine());
            student.setStudent_kor(korScore);

            System.out.print("영어 점수 입력: ");
            int engScore = Integer.parseInt(sc.nextLine());
            student.setStudent_eng(engScore);

            System.out.print("수학 점수 입력: ");
            int mathScore = Integer.parseInt(sc.nextLine());
            student.setStudent_math(mathScore);
            
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}	
	}

	
	//학생 정보 수정
	public void updateInfo() {
		StudentDTO student = studentById(studentId);

		System.out.println("ID 입력 >");
		int studentId = Integer.parseInt(sc.nextLine());
		
		if(student != null) {
			System.out.println("변경할 전화번호 입력>");
			String tel = sc.nextLine();
			student.setStudent_tel(tel);
			
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

	}

   
	//학생 정보 조회
    public StudentService() {
    	 sc = new Scanner(System.in);
         students = new ArrayList<>();
    }
    public void getStudentInfo() {
        System.out.println("학생 정보 조회");

        System.out.print("ID 입력> ");
        String studentId = sc.nextLine();

        // 학생 ID로 학생 정보 조회
        StudentDTO student = studentById(studentId);

        if (student != null) {
            System.out.println("studentId: " + student.getStudent_id());
            System.out.println("studentName: " + student.getStudent_name());
            System.out.println("studentClass: " + student.getStudent_class());
            System.out.println("studentAddr: " + student.getStudent_addr());
            System.out.println("studentTel: " + student.getStudent_tel());
        } else {
            System.out.println("ID가 존재하지 않습니다.");
        }
    }
    private StudentDTO studentById(String studentId) {
		// TODO Auto-generated method stub
		return null;
	}





}
