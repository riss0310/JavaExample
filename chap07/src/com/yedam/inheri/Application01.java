package com.yedam.inheri;

public class Application01 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("아이폰","스그","SK");
		
		//CellPhone(부모) class
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		
		
		//SmartPhoen(자식) class
		System.out.println("통신사 : " + sp.agency);

		
		//CellPhone(부모)class
		sp.powerOn();
		sp.bell();
		sp.hangUp ();
		sp.powerOff();
		
		sp.kakaoExe();
		sp.kakaoExit();
		sp.Info();
	}

}
