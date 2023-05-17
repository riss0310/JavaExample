package com.yedam.variable;

public class variable02 {
	public static void main(String[] args) {
		
		//2진수
		int var1 = 0b1011;
		int var2 = 0206; //8진수
		int var3 = 365; //십진수
//		int var4 = 0xB3l; //16진수

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
//		System.out.println("var4 : " + var4);
		
		//정수타입의 범위
		// byte -> -128 ~ 127
		byte bVar1 = 127;
		
		//Long
		//int 범위 : -2,147,483,648 ~ 2,147,483,647
		long lVar1 = 2000000;
		long lVar2 = 200000000000L;
		//^long에다가 넣을 숫자이니 int 너는 상관하지마
		
		
		//Char
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		
		//이스케이프 문자
		//문자열 String
		String name = "홍길동";
		String job = "프로그래머";
		
		//\t : tab만큰 띄워라
		//\n : enter
		//\\ : 특수한 문자 사용(\)
		//\" : 특수한 문자 사용(")
		
		System.out.println(name + "\n" + job);
		System.out.println("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울"); //뒤에 있는 \는 앞의 \과 구분지어주는 역할을 하는거임

		
		//실수
		//float, double
		
		//float
		float fVar1 = 3.14f;
		
		double dVar1 = 3.14;
		
		float fVar2 = 0.1234567891234f; // 근사치를 프로그램이 뽑아서 출력하기 때문에 9로 끝남(부동소수점)
		double dVar2 = 0.1234567891234;
		
		System.out.println("fVar2 : " + fVar2);
		System.out.println("dVar2 : " + dVar2);
		
		float fVar3 = 3e-3f; // 3 * 0.001
		double dVar3 = 3e6; // 3 * 10(6승)
		
		System.out.println("fVar3 : " + fVar3);
		System.out.println("dVar3 : " + dVar3);
		
		
		//논리타입(Boolean
		boolean stop = true;
//		♡
		if(stop) {
			System.out.println("멈춥니다.");
		} else {
			System.out.println("달립니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
