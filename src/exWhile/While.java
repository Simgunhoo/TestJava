/*미니 프로젝트 설계
 * 1. 전원 ON
 * 1-1. 메뉴 화면설계 1. 1~10부터합 2. 입력받은정수로 단수출력 99. 종료
 * 2. 수행1(화면설계) :1~10 부터합
 * 3. 수행2(화면설계) : 입력받은정수로 단수출력
 * 4. 전원오프 OFF
 * 
 * 메소드 정의
 * 리턴형 메소드명(인수1,인수2...){    인수1, 인수2.=> arg, 매개변수 
 */
package exWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = false; // done false 라면 시작. true 중지
		Scanner scan = new Scanner(System.in);
		int sel = 0; //메뉴 선택 입력 변수
		
		
		
		while(!done) {// 전원ON
			//메뉴설계
			menuPrint();  // 메뉴 메소드
			sel = scan.nextInt();
			
			
			switch(sel) { // switch(조건식 또는 값)
			
				case 1:
					System.out.println("합");
					int sum = 0;
					sum = sum(); // 합을 구하는 메소드
					System.out.println("최종 sum = " + sum);
					break;
				case 2:
					System.out.println("단수구하기");
					int dan = 0;
					dan =dan();
					break;
				case 99:
					System.out.println("메뉴종료");
					done = true;
					break;
				default :
					System.out.println("1,2,99를 입력하세요 ~~ 재입력하세요");
					
			}
			
//			if( sel == 1 ) {
				 
//				 System.out.println("합");
				
//			}else if(sel == 2) {
				
//				System.out.println("단수 출력");
//					
//			}else if(sel == 99) {
//				System.out.println("메뉴종료");
				
//			}else {
//				System.out.println("1.2.99만 입력하세요");
//			}
		
			
		}
		
		System.out.println("Program End!!!");


	}

	private static void menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("======== [Menu] =======");
		System.out.println("1. 1~10 까지의 합");
		System.out.println("2. 입력받은 정수의 구구단 출력");
		System.out.println("99. 종료하기");
		System.out.println("======================");
		System.out.println("Select NumBer");
	}

	private static int dan() {
		// TODO Auto-generated method stub
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
		int result = 0;
		int i = 0;
		for(i=1; i<=9; i++) {
			result = dan * i;
			System.out.println(dan + "*" + i + "=" + result);
		}
		return 0;
	}

	private static int sum() {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);
		System.out.println("====================");
		return sum;
	}

}
