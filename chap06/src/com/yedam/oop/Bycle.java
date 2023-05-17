package com.yedam.oop;

public class Bycle {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;//끝나고 더 할 행동이 없다 ->void씀
	}
	
	boolean isLeftGas() {
		if(gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false;//클래스 내부 실행하고 외부에서 추가로 쓸 내용이 있다.->리턴문
		}
		System.out.println("gas가 있습니다.");
		return true;
		
	}
	void run( ) {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : "+ gas + ")");
				gas -= 1;
			} else {
				System.out.println ("멈춥니다..(gas잔량 :ㅣ "+ gas + ")");
				return;//메소드 강제종료
			}
		}
	}
	
	
}
