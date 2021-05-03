/* A       -> A+,    Ao,    A-
 *90~100      97이상        93이하 
 */
package exIF;

import java.util.Scanner;

public class Simple0006 {

	public static void main(String[] args) {
		// 선언
				Scanner scan = new Scanner(System.in);
				int score = 0; // 점수
				char grade ='x';//성적    String grade =null; or String grade;
				char buho ='o';
				// 입력
				System.out.print("점수를 입력하세요 : ");
				score = scan.nextInt();
				
			
				// 처리
				if(score >= 90 && score <= 100) { // 90~ 100사이의 값 90<= 이고 score <= 100
					grade = 'A';
					
				}else if(score >= 80) {
					grade = 'B';
					
				}else if(score >= 70) {
					grade = 'C';
					
				}else if(score >= 60) {
					grade = 'D';
					
				}else {
					grade = 'F';
				}
				//% 나머지연산자를 이용하여 부호를 작성하기 
				if(score>=60 && score <= 100) {
					if(score % 10 >=7) {
						buho = '+';
					} else if(score % 10 <=3) {
						buho = '-';
					} 
					
				}
				// 출력 "당신의 점수는 00이고 성적은 0 입니다."
				System.out.println("당신의 점수는 " + score + "이고 성적은 " + grade + buho + " 입니다.");
	}

}