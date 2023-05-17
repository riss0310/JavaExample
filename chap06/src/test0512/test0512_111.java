package test0512;

import java.util.Scanner;

public class test0512_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			//문제 1		
			double x = 10;
			double y = 2.0;
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			

		//문제 2
		
		int value = 0;
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = (num1 > 10) && (num2 >10);
		System.out.println(result);
		result = ((num1 > 10)) || (num2>10);
		System.out.println(result);
		System.out.println(!result);
		
		
		//문제3
		
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money="+money);
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 : " +(money/coinUnit[i])+"개");
			money = money%coinUnit[i];
		}
			
		
		//문제4
		
			Scanner sc = new Scanner(System.in);
			
			for(int i =2; i<=9; i++) {
				for(int j=1; j<=i; j++) {
				
				System.out.println(i+ "*" + j + " = " + (i*j));
				}
			}
		
		//문제5 
			int[] dice = null;
			
			int diceNo =0;
			
			Scanner scanner = new Scanner(System.in);
			
			int selectNo = 0;
			while(selectNo !=5) {
				System.out.println("===1.주사위 크기 | 2.주사위 굴리기 | 3.결과 보기 | 4. 가장 많이 나온 수 | 5.종료");
				System.out.println("메뉴 >");
				
				selectNo = Integer.parseInt(sc.nextLine());
				
				switch(selectNo) {
				case 1:
					System.out.println("주사위 크기>");
					diceNo = Integer.parseInt(sc.nextLine());
					if(diceNo < 5 || diceNo > 10) {
						System.out.println("주사위의 범위를 벗어났습니다.");
						System.out.println("5~10 사이의 숫자로 입력하세요.");
						
						diceNo=0;
					}
					break;
				case 2:
					//만약... 주사위 크기가 제대로 입력되지 않았다면...?
					if(diceNo == 0 ) {
						System.out.println("주사위 번호가 제대로 입력되지 않음");
						System.out.println("다시 입력하세요.");
					}else {
						//주사위 배열 생성
						dice = new int[diceNo];
						//주사위를 굴린 횟수
						int count = 0;
						while(true) {
							//주사위 굴린 횟수 증가
							count++;
							//랜덤값-> 주사위를 굴려서 나오는 값
							int randomDice = (int)(Math.random()*diceNo)+1;
							//랜덤값을 활용하여 dice배열의 인덱스를 구한 뒤 1씩 증가
							dice[randomDice-1]++;
							if(randomDice == 5) {
								System.out.println("5가 나올 때까지 " + count + "번 굴렸습니다.");
								break;
							}
							
						}
		
					}
					break;
				case 3:
					for (int i=0; i<dice.length; i++) {
						System.out.println((i+1)+"은 "+dice[i]+"번 나왔습니다.");
					}
					break;
				case 4://가장 ㅁ낳이 나온 수가 여러 개일 경우 주사위 눈 중 가장 작은 수가 출력된다
					int max = dice[dice.length-1]; 
					int idx= 0;
					for(int i= dice.length-2; i>=0; i--) {
						if(max < dice[i]) {
							max = dice[i];
							idx = i;
						}
					}
					System.out.println("가장 많이 나온 수는 " + max + "입니다.");
					break;
				case 5:
					System.out.println("프로그램 종료");
					break;
				}
			}
	}

}
