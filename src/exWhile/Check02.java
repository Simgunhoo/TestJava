/*
 * 사칙연산구하기 [두 수 입력 받아서 사칙연산
 * 1.합 2. 빼기 3. 곱 4. 나눗셈 5.종료
 */
package exWhile;

import java.util.Scanner;

public class Check02 {
	
	static Scanner scan = new Scanner(System.in); //전역변수(타입)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = true; // 종료가 되면 false로 변경
		int sel = 0; //메뉴선택자 - 변수,항목,필드, 아이템, 파라미터, 매개변수, 인자
		int num1 =0, num2 =0; //두 수
		
		while(done) {
			//메뉴 보이기 ->메소드로 //콘솔로 입력값받기
			System.out.println(done);
			sel = menuPrint();
			
			//두수 입력을 받기
			if(sel < 5 && sel > 0) {   //sel ==1 || sel ==2 ~
				// sel이 1,2,3,4 일때만 동작시키려고 조건을 줌! 
				System.out.print("First Number : ");
				num1 = scan.nextInt();
				System.out.print("Second Number : ");
				num2 = scan.nextInt();
			}
			
			
			switch(sel) {
			// case 3,4,5: 입력가능
			
			
			
			case 1: //합을 구하는 메소드  ->데이터 추가
				int sum = sum(num1,num2);
				System.out.println(sum);
//				sum();
				break;
			case 2: //빼기 ->데이터 수정
				int minus = minus(num1,num2);
				System.out.println(minus);
				break;
			case 3: //곱셈 ->데이터 조회
				int mul = mul(num1,num2);
				System.out.println(mul);
				break;
			case 4: //나눗셈 ->데이터 삭제
				int div = div(num1,num2);
				System.out.println(div);
				break;
			case 99: //종료
				done = false;
				break;
				
			default: //재입력
					System.out.println("1,2,3,4,99번 만 누르세요");
					break;
			
			
			}//end of switch(sel)
			
		} // end of while(done)
		
		System.out.println("프로그램 종료!");
	} //end of main

	private static int div(int num1, int num2) {
		// TODO Auto-generated method stub
		int div = num1 / num2;
		return div;
	}

	private static int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		int mul = num1 * num2;
		return mul;
	}

	private static int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		int minus = num1 - num2;
		return minus;
	}

	private static void sum() {
		// TODO Auto-generated method stub
		// 두 수를 입력받아서 합을 계산하는 메소드 임
	}

//	두 수를 넘겨받아서 합을 리턴함.
	private static int sum(int num1, int num2) { // call by value
		
		int sum = num1 + num2;
//		System.out.println(" 합 : " +sum);
		return sum; // num1+ num2
	}

	private static int menuPrint() {
		System.out.println("************[Menu]************");
		System.out.println("1. sum");
		System.out.println("2. minus");
		System.out.println("3. mul");
		System.out.println("4. div");
		System.out.println("99번 종료");
		System.out.println("******************************");
		System.out.print("입력  : ");
		// int sel = scan.nextInt();
		// return sel;
		return scan.nextInt();
		
	}

}
