/*
 * 콘솔 입력 : Scanner 클래스
 * 키보드(콘솔)로 숫자를 입력받아서 출력
 */
package kr.co.dong; // 연습용 소스 모으기

import java.util.Scanner;

// public:모두,모든   private : 개인의(혼자), 다른곳에서 볼수가없음.
public class TestExam02 {

	// static : 정적의, 정적인 -> 메모리에 로드가 되어서 바로 호출가능
	public static void main(String[] args) {
		//두수를 키보드 입력(문자열->정수)받아서 출력해보기
		// 선언
		Scanner scan = new Scanner(System.in);
		int num1 = 0; // = 대입연산자
		int num2 = 0;
		
		// 입력
		System.out.print("첫번째 숫자 입력");
		num1 = Integer.parseInt(scan.next());
		System.out.print("두번째 숫자 입력");
		num2 = Integer.parseInt(scan.next());
		// 처리
		
//		주석처리 단축키  : Ctrl + /
		// 출력
		System.out.println("입력받은 숫자1 : " + num1);
		System.out.println("입력받은 숫자2 : " + num2);
	}

}
