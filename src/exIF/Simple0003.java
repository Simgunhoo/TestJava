/* 나이를 키보드로 입력받아서
 * 60세이상이면 "노인"
 * 60세미만 40세 이상이면 "중년"
 * 40세미만이면 "청소년"을 출력하는 프로그래밍하기.
 * 예)
 * "당신의 나이는 00 이고 000입니다.
 */
package exIF;

import java.util.Scanner;

public class Simple0003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age =0;
		String str = "sss";
		
		System.out.print("당신의 나이를 입력하세요 : ");
		age = scan.nextInt();
		
		if(age >= 60) {
			str = "노인";
		}else if(age >=40 ) {
			str = "중년";
		}else {
			str = "청소년";
		}
		System.out.println("당신의 나이는 "+ age +"이고 " + str +"입니다. ");	
		
	}

}
