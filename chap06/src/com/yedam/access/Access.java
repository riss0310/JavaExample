package com.yedam.access;

public class Access {

//	접근 제한자 : 필드, 메소드, 클래스, 생성자, 인터페이스 등 앞에 사용 가능
//	public : 어디서든 누구나 다 사용할 수 있다.
//	protected : 같은 패키지 내에서만 사용 가능, 다른 패키지일 경우에는 사용 x
//				상속이란느 관계를 맺은 부모 - 자식은 사용 가능(패키지가 달라도 가능)
//	default : 같은 패키지 내에섬나 사용 가능, 다른 패키지일 경우에는 사용 X
//	private : 내가 속한 클래스, 객체에서만 사용 가능
	
//필드
	public String free;
	protected String parent;
	String basic;
	private String privacy;
	
	//생성자에 접근 제한 -> 객체를 생성하는 범위를 제한
	//public -> 어디서든지 객체 생성 가능
	//protected -> 같은 패키지에서만 객체 생성가능하나 부모-자식관계에서는 어디서든지 객체 생성 가능
	//default -> 같은 패키지에서만 객체 생성 가능
	//private -> 객체 생성 불가능(막음)
	
	public Access() {
		
	}
	
	protected Access(int a) {
		
	}
	
	Access(String s){
		
	}
	
	
	
	//이클립스에서 노란줄의 의미 : warning. 한번도 사용하지 않음.
	private Access(double a) {
		
	}
	
	//메소드
	private void info() {
		System.out.println("private 메소드");
	}
	
	public void instead() {
		info();
	}
	
	protected void parent() {
		System.out.println("protected 메소드");
	}
	
	void basic() {
		System.out.println("default 메소드");
	}
	
	
	
	//객체지향의 특징
	//-캡슐화(정보은닉) 안의 정보를 private을 이용해서 꽁꽁싸매고 있어
	//-상속
	//-추상화
	//-다양성
	
	
}
