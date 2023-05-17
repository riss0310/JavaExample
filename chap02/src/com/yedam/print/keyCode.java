package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class keyCode {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//KeyCode -> 하나의 문자만 받아 올 때
		System.out.println("입력>");
		
		int keyCode = 0;
		
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		
		//Scanner 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		
		//문자열 읽기
		//nextLine()
		//=> enter키 이전까지의 데이터를 받앙 옴.
		//=> enter키 기준으로 데이터를 읽어 옴.
		String inputData = scanner.nextLine();
		//정수 읽기
		int data = scanner.nextInt();
		//엔터키 소멸
		scanner.nextLine();//공백
		
		inputData = scanner.nextLine();
		System.out.println("Scanner 활용 => "+ inputData);
		
		//데이터 비교 -> 입력한 값 == 저장된 값 비교
		
		//기본 타입(정수, 실수 비교 ==)
		//문자열 -> equals
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}//콘솔창에 yedam과 다른 데이터가 들어가면 ^을 통과 못해서 위의 문구 출력되지 않음
		
		
	}

	
}
