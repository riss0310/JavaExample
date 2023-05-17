package com.yedam.oop;

import java.util.Scanner;

public class Application06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생의 정보를 관리하는 프로그램

		//학생의 정보를관리하는 객체
		//필드 - 정보
		//이름, 학년, 국어, 영어, 수학
	
		//메소드
		//모든 정보를 출력 getInfo()
		
		//1.학생수
		//2.정보 입력
		//3. 정보 확인
		//4.분석 -  전체 학생읠 점수를 종합(국영수)
		//      - 총점의 평균
		//		- 개인별 가장 점수가 높은 과목 / 낮은과목
		//5. 종료
		
//		학생 정보를 보관 배열
		student[] stdAry = null;
//		학생의 정보를 몇영 보관하는 변수
		int stdNum = 0;
		//데이터 입력을 받을 수 있는 스캐너
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("==============================================");
		System.out.println("1.학생 수 | 2.정보 입력 | 3.정보 확인 | 4.분석 | 5.종료");
		System.out.println("==============================================");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if(selectNo==1) {
			System.out.println("학생 수>");
			stdNum = Integer.parseInt(sc.nextLine());
		}else if(selectNo==2) {
			stdAry = new student[stdNum];//stdNum이랑 stdAry.length같음
		}for(int i=0; i<stdAry.length; i++) {
			//배열에 바로 객체 만듬
			stdAry[i] = new student();
			System.out.println("이름>");
			stdAry[i].name = sc.nextLine();
			System.out.println("학년>");
			stdAry[i].sg = Integer.parseInt(sc.nextLine());
			System.out.println("국어>");
			stdAry[i].kor = Integer.parseInt(sc.nextLine());
			System.out.println("영어>");
			stdAry[i].eng = Integer.parseInt(sc.nextLine());
			System.out.println("수학>");
			stdAry[i].mth = Integer.parseInt(sc.nextLine());
			
		}if(selectNo==3) {
			for(int i = 0; i<stdAry.length; i++){
				stdAry[i].getInfo();
			}
		}else if(selectNo==4) {
			int total = 0;
			double avg = 0;
			int max = 0;
			int min =0;
			for(int i =0; i<stdAry.length; i++) {
				total = stdAry[i].kor +stdAry[i].eng +stdAry[i].mth;
				max = stdAry[i].kor;
				min = stdAry[i].kor;
				
			if(stdAry[i].eng < stdAry[i].mth) {
					if(max<stdAry[i].mth) {
						max = stdAry[i].mth;
					}
				}else {
					if(max < stdAry[i].eng) {
						max = stdAry[i].eng;
					}else if(selectNo==5) {
			System.out.println("프로그램 종료");
			break;
		}else {}
				}
		
			}

		}
		}
}
}