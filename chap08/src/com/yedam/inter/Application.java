package com.yedam.inter;

import com.yedam.inter2.A;

public class Application {

	public static void main(String[] args) {
		//A(I) < - B <- C
		A a = new B();
		a.info();
		
		a = new C();
		a.info();

		System.out.println("배고파요배고파요집에가서밥먹고싶어요교수님타자너무빨라요집에가서할래요");
	}
