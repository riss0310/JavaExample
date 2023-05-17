package com.yedam.loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
//		//for문
//		//1~100까지의 수를 출력
//		for(int i = 0; i<= 100; i++) {
//			System.out.println(i);
//		}
//		int result = 0;
//		
//		for(int i =1; i<=100; i++) {
//			result = result + i;
//		}
//		
//		System.out.print("1~100사이의 합"+result);
//		
//		//1~100사이의 짝, 홀수 구하기.
//		//숫자 % 2 == 0 -> 짝수
//		//위의 경우가 아니라면 홀수
//		for(int i =1; i<= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i+ "는 짝수");
//			} else if(!(i % 2 == 0)){
//				System.out.println(i + "는 홀수");
//			}
//		}
//		
//		//입력한 숫자에 대한 구구단 출력
//		Scanner sc = new Scanner(System.in);
//		
//		//2 -> 2*1 = 2, 2*2 = 4... 2*9=18
//		System.out.println("구구단 입력>");
//		
//		int gugu = Integer.parseInt(sc.nextLine());
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println(gugu + " * " + i + " = " + (gugu*i));
//		}
//		
//		//입력한 값에 대한 총합, 평균, 최대값, 최소값 구하기.
//		//몇번 반복할건지 값을 입력받는다.
//		//예시) 5번 -> 2,50,20,10,5
//		//변수 만들고 싶은만큼 만들고 으엥
//		//반복 횟수 입력
//		System.out.println("반복 횟수>");
//		int count = Integer.parseInt(sc.nextLine());
//		
//		int total = 0; //총합
//		int avg = 0; //평균
//		int max = 0;
//		int min = 0;
//
//		
//		for(int i=1; i<count; i++) {
//			System.out.println("데이터입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			//위까지 기본 세팅
//			//총 합계 -> 데이터를 입력 받는대로 누적 합계
//			total += data; //total = total + 입력한 데이터
//			if(i==0) {
//				max = data;
//				min = data;
//			}else {
//				//최대값 -> 최대값, 입력값을 비교 더 큰 데이터가 최대값
//				if(max < data) {
//					max = data;
//				}
//				//최소값 -> 최소값, 입력값을 비교 더 작은 데이터가 최소값
//				if(min > data ) {
//					min = data;
//				}
//			}
			
			//평 균  -> 총 합계 / 반복문 횟수 
			//total / count
//			System.out.printf("평균 : %5.2f\n", (double)total/count);
//			System.out.println("최대값 : " + max + "최소값 : " + min);

			//임의의 랜덤 값(1~100) 하나 추출->Math.Random(
			//5번 기회안에 해당 랜덤 값을 맞추는 프로그램 구현-> 데이터 입력(Scanner)
			//									  -> 입력 vs 랜덤 비교
			//									  -> if
			//									  -> 입력 > 랜덤 = up
			//									  -> 입력 < 랜덤 = down
			//예시) 랜덤 값 : 50
			//사용자 : 입력 -> 30
			//컴퓨터 : up
			//사용자 : 입력 -> 40
			//컴퓨터 : up
			//사용자 : 입력 -> 60
			//컴퓨터 : 60
			
			//1) 맞춘 경우
			//정답 입니다, 몇 번만에 맞추셨습니다.
			//반복문 강제 종료 -> break;
			
			//2) 기회 안에 못 맞춘 경우
			//모든 기회를 소진하셨습니다.
			//반복문 강제 종료 -> break;
			
			int randomNo = (int) (Math.random() * 100) + 1;
			Scanner sc = new Scanner(System.in);
			
			for(int i=1; i<=5; i++) {
				System.out.println("입력하세요");
				int num = Integer.parseInt(sc.nextLine());
				if(randomNo>=num){
					System.out.println("up");
				} else {
					if(randomNo<=num) {
						System.out.println("down");
					} else {
						if(randomNo == num) {
							System.out.println("정답 입니다," + i +"번 만에 맞추셨습니다.");
						} else {
							if(i == 5) {
								System.out.println("모든 기회를 소진하셨습니다.");
							}
							break;
						}
					}
				}
			
			
			}
			
			
			
			
			
			
		} 
		
	}


	
	
		
		





	

