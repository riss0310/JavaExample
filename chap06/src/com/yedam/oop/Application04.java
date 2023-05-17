package com.yedam.oop;

public class Application04 {
	public static void main(String[] args) {
		Book book1 = new Book("혼자 공부하는 자바","학습서","24000원","한빛 미디어","0001");
//		System.out.println(book1.name);
//		System.out.println(book1.kind);
//		System.out.println(book1.price);
//		System.out.println(book1.pub);
//		System.out.println(book1.bid);
//		
		book1.getInfo();
		
		Book book2 = new Book("자바스크립트", "학습서","15000원","어포스트","0002");
		
		book2.getInfo();
		
		
//book1=new Book("자바스크립트", "학습서","15000원","어포스트","0002");
	}
}