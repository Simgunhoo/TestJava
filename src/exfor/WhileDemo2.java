
package exfor;

import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {
		// 키보드로 단수를 입력받아 1~9까지 곱을 구하세요
		//선언
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int dan = 0; 
		
		//입력
		System.out.print("입력할단");
		dan = scan.nextInt();
		
		//출력
		System.out.println(dan +"단출력");
		
		for(int i=1; i<=9; i++) {
			//처리전 동작
			result = dan * i ; //처리 
			System.out.println(dan + " * " + i + " = " + result);
			//처리후 동작
		}
		
		
	} //end of main(String[] args)
		
		
} // end of Class
	

