package com.yedam.oop;

public class Car {
	//필드 : 객체를 만들었을 때 정보를 담아주는 역할
	//필드 선언
	String name; //자동차 이름
	int price; // 자동차 가격
	//클래스 내부에서 필드에 정보를 입력
	String company = "벤틀리"; // 브랜드, 제조사
	//객체 생성할때마다 똑같은 데이터를 넣어야한다면 위와 같이 필드에 이름을 넣어놓을 수 있다
	
	
	//생성자 : 객체로 만들때 내가 하고 싶은 행위를 정의/객체 생성할때 우선적으로 해야할 행동을 정의 해놓는 공간
	//	   : 클래스 이름과 동일
	//	   : 다양한 방법으로 객체를 생성하기 위해서 생성자를 오버로딩
	//클래스로부터 new 연산자로 객체를 생성할 때 호출되어 객체의 초기화(첫번째로 해야할, 우선적으로 해야할 행동)를 담당
	//기본 생성자
	Car(){}
	  //메소드처럼 생겼지만 메소드아님. 생성자 이름은 반드시/무조건/아묻따 클래스이름과 같아야함.
	  //메소드는 매개변수의 성격을 띄고 있음. 생성자는 매개변수를 통해서 데이터를 받아올 수 있다. 
	Car(String name,int price){
		  
	  }
	Car(String name){
		this(name, 10000, "현대");
		this.name = name;
		System.out.println("자동차 이름만 입력");
	}
	
	Car(int price){
		
	  }
	Car(String name, int price, String company){
		this.name = name;
		this.price = price;
		this.company = company;
		System.out.println("모든 필드 초기화");
	}
	
	
	//메소드 : 객체가 사용할 수 있는 기능
	// 반환값(리턴값)이 없는 메소드
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	//문자열을 반환(리턴)하는 메소드
	String info() {
		String data = company + " : " + name + " : " + price;
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


