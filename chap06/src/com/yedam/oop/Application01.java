package com.yedam.oop;

public class Application01 {
	//실행 클래스
	public static void main(String[] args) {
		//Car Class -> 객체
		Car myCar = new Car();
		//Car는 타입, my car는 변수, new는 객체생성, Car()는 생성자
		//타입은 Car Class안에 정리 해놓은 내용 필드, 메소드와 같은 것들을 쓸 수 있다라는 의미
		//dot,, . 연산자 : 객체가 가지고 있는 필드와 메소드 사용가능
		//ex)배열.length
		System.out.println(myCar.company); 
		System.out.println(myCar.price); 
		System.out.println(myCar.name); //아직 데이터가 들어가지 않음
//		
//		//클래스 외부에서 객체를 생성하고 필드를 호출하여 데이터 입력
		myCar.company = "현대";
		myCar.price = 1234;
		myCar.name = "소나타";
		
		System.out.println("==객체 필드 데이터 입력==");
		System.out.println(myCar.company); 
		System.out.println(myCar.price); 
		System.out.println(myCar.name);

//		내부에서 넣은거
//		벤틀리
//		0
//		null
// 		외부에서 필드에 접근해서 데이터 넣ㅁ음
//		==객체 필드 데이터 입력==
//		현대
//		1234
//		소나타

		//하나의 설계도로 myCar와 다른 객체를 생성가능. 필드를 같이 사용할 수 있다. 
//		Car yourCar = new Car();
		
//		System.out.println("MyCar 와 YourCar 비교");
//		System.out.println(myCar.company);
//		System.out.println(yourCar.company);
		
		System.out.println("==Korean Class를 활용한 객체생성==");
		
		Korean k1 = new Korean("박자바", "930525-0654321");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println("==생성자 오버로딩을 활용한 객체 생성==");
		
		//매개변수가 
		Car oneCar = new Car("소나타");
		System.out.println("oneCar의 필드 name : " + oneCar.name);
		
		oneCar.run();
		
		System.out.println(oneCar.info());
		
		
//		Car threeCar = new Car("그랜저", 3000, "현대");
//		System.out.println("ThreeCar의 필드 : " + threeCar.name);
//		System.out.println("ThreeCar의 필드 : " + threeCar.price);
//		System.out.println("ThreeCar의 필드 : " + threeCar.company);
		
		
		
		
		
		
		
		
		
	}
}
