package com.yedam.Exception;

public class Applicaton01 {
	public static void main(String[] args) {
//		try { 
//			//예외가 발생할만한 코드
//		}catch(예외 종류(nullpoint, numberformat,,,)) {
//			//예외, 문제가 발생했을 때 처리하는 코드
//		}finally
//	}		//try 또는 catch문 실행하고 나서 무조건!
//			//실행하는 코드
//			//필수는 아니고 선택
		
		try {
			double avg = 1/0;
			System.out.println(avg);
		}catch(ArithmeticException e) {//예외가 발생하면 잡는다
			System.out.println("숫자는 0으로 나누기 못함");
			e.printStackTrace();//ArithmeticException 부모꺼임/예외가 발생했을때 그 발자취를 추적,위치표현
		}
		
		
		try {
			String str="123";
			int a = Integer.parseInt(str);//문자열을 숫자로 바꿨을 때 바꾸지못하면 numberof오류로 보여준다
			//ClassNotFound
			Class clazz = Class.forName("java.lang.String2");
			
		}catch(ArithmeticException e) {//예외가 발생하면 잡는다
			System.out.println("숫자는 0으로 나누기 못함");
			e.printStackTrace();//ArithmeticException 부모꺼임/예외가 발생했을때 그 발자취를 추적,위치표현
		}catch(NumberFormatException e) {//예외가 발생하면 잡는다
			System.out.println("문자열 -> 정수로 변환 실패");
			e.printStackTrace();//ArithmeticException 부모꺼임/예외가 발생했을때 그 발자취를 추적,위치표현
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally 항상 실행");
		}
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lng.String2");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
