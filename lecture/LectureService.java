package lecture;

import java.util.Scanner;

public class LectureService {

	public static Lecture lectureInfo = null;
	Scanner sc = new Scanner(System.in);
	
	public void insertLecture() {
		Lecture lecture = new Lecture();
		
		System.out.println("✨강 의 등 록✨");
		
		System.out.println("LECTURE ID>");
		lecture.setlecture_id(sc.nextLine());
		
		System.out.println("LECTUE NAME>");
		lecture.setLecture_name(sc.nextLine());
		
		System.out.println("LECTURE DAY>");
		lecture.setLecture_teach(sc.nextLine());
	}
}
