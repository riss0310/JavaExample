package com.yedam.oop;

import com.yedam.access.Access;

public class Application07 {
	//import ctrl + shift + o
	//필드 선언
	static int num = 1;
	
	void info() {
		System.out.println("info 출력");
	}

	public static void main(String[] args) {
		//자기 자신을 객체로 만든 예제 -> 절대로/절대로 하지 말 것.
		Application07 app = new Application07();
		
		int a = num + 1;
		
		app.info();
		
		//클래스에 정의된 정적 멤버 사용
		//클래스명.필드명 | 클래스명.메소드명
		//정적 필드
		System.out.println(StaticCal.PI);
		
		//정적 메소드
		System.out.println( StaticCal.minus(10, 5) );
		System.out.println( StaticCal.plus(10, 5) );
		
		Person p1 = new Person("11111-11111", "김또치");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "미국"; final이라 다른 값으로 바꿀 수 없음
		
		System.out.println("지구의 반지름 : " + StaticCal.EARTH_RADIUS);

		
		System.out.println("지구의 표면적 : "
			+ StaticCal.PI * StaticCal.EARTH_RADIUS * StaticCal.EARTH_RADIUS);
		
		Access ac = new Access();
		ac.free = "public";
		ac.parent = "protected";
		ac.basic = "default";
		ac.privacy = "private";
		
		
		
		
	}

}
