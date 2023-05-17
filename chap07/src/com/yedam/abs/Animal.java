package com.yedam.abs;

public abstract class Animal {
	//필드
	public String kind;
	
	
	//메소드
	public void breath() {
		System.out.println("breathing");
	}
 	

	
	
	
	//추상 메소드
	public abstract void sound();
	
}