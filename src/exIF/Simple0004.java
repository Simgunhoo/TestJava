/*
 * 두수비교
 */
package exIF;

import java.util.Scanner;

public class Simple0004 {

	public static void main(String[] args) {
		//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		// 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져있다.
		
		/*
		 * 첫째 줄에 다음 세가지 중 하나를 출력한다.
		 * A가 B보다 큰 경우에는 '>'를 출력한다.
		 * A가 B보다 작은경우에는 '<'를 출력한다.
		 * A와 B가 같은 경우에는 '=='를 출력한다
		 */
		//선언
		Scanner scan = new Scanner(System.in);
		int A =0;
		int B =0;
		
		String str = "x";
		//입력
		System.out.print("A의 숫자는 ");
		A = scan.nextInt();
		System.out.print("B의 숫자는 ");
		B = scan.nextInt();
		//처리
		if(A > B) {
			str = ">";
		}else if(A < B) {
			str = "<";
		}else {
			str = "==";
		}
		//출력
		System.out.println("입력된 값은 " + str + " 입니다.");
		
	}

}
