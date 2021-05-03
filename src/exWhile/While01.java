/*미니프로젝트 설계
 * 1. 전원ON
 * 1-1. 메뉴(화면설계)  1. 1~10부터의합 2. 입력받은 정수로 단수출력 99. 종료
 * 2. 수행1(화면설계) : 1~10부터의합
 * 3. 수행2(화면설계) : 입력받은 정수로 단수출력
 * 4. 전원오프하고싶어~~~> OFF
 * 5. END
 */
package exWhile;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		//
		boolean done = false; // done false 라면 시작. true 중지
		Scanner scan = new Scanner(System.in);
		int sel = 0; //메뉴 선택 입력 변수
		
		
		
		while(!done) {// 전원ON
			//메뉴설계
			System.out.println("======== [Menu] =======");
			System.out.println("1. 1~10 까지의 합");
			System.out.println("2. 입력받은 정수의 구구단 출력");
			System.out.println("99. 종료하기");
			System.out.println("======================");
			System.out.println("Select Number : ");
			sel = scan.nextInt();
			
			
			if( sel == 1 ) {
				 sel = sel +i;
				 System.out.println("합");
				
			}else if(sel == 2) {
				sel = sel * i;
				System.out.println("단수 출력");
						
			}else if(sel == 99) {
				System.out.println("메뉴종료");
				
			}else {
				System.out.println("1.2.99만 입력하세요");
			}
		
			
		}
		
		System.out.println("Program End!!!");

	}

}
