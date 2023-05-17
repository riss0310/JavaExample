package com.yedam.access;

public class Singleton {

	// 싱글톤 세팅
	// 클래스 내부에서 하나의 객체를 생성
	// 하나의 객체는외부에서 접근이 불가능
//	private static Singleton singleton = new Singleton();
//	
//	//외부에서 객체를 생성하지 못하도록 막는 역할
//	private Singleton() {
//	
//	}
//	//클래스 내부에서 만든 단 하나의 객체를 외부에 전달하기 위한 용도
//	public static Singleton getInstance() {
//		return singleton;
//	}
//	//싱글톤 세팅 끝 
//	
//	
//	//필드
//	public String name;
//	public int age;
//	
//	
//	//메소드
//	public void info() {
//		System.out.println("싱글톤의 인스턴스 메소드 info 출력");
//	}
//	
//	}
	//자바에서 디비로 접근할 수 있는 객체 만들어야해~할때 싱글톤쓰나봐~

	private static Singleton singleton = null;

	//외부에서 객체를 생성하지 못하도록 막는 역할
	private Singleton() {
		//참고하는 객체가 없다. 객체가 생성되지 않은 상황
		
	}

	//클래스 내부에서 만든 단 하나의 객체를 외부에 전달하기 위한 용도
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
	return singleton;
	}
	//싱글톤 세팅 끝 

	//필드
	public String name;
	public int age;

	//메소드
	public void info() {
	System.out.println("싱글톤의 인스턴스 메소드 info 출력");
	}
	}