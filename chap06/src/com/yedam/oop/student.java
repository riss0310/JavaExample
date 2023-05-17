package com.yedam.oop;

public class student {
	String name;
	int sg;
	int kor;
	int eng;
	int mth;
	
	student() {}
	
	student(String name, int sg, int kor,int eng,int mth){
		this.name = name;
		this.sg = sg;
		this.kor = kor;
		this.eng = eng;
		this.mth = mth;
	}
	
	void getInfo() {
		System.out.println("이름>" + name);
		System.out.println("학년>" + sg);
		System.out.println("국어 점수>" + kor);
		System.out.println("영어 점수>" + eng);
		System.out.println("수학 점수>" + mth);
	}
	
}
