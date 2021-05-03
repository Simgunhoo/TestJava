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
					if(score >=97) { // buho '+'
						buho = '+';
					}else if(score<=93) { // buho '-'
						buho = '-';
					}else { //buho 'o'
						buho = 'o';
					}
				}else if(score >= 80) {
					grade = 'B';
					if(score >=87) { // buho '+'
						buho = '+';
					}else if(score<=83) { // buho '-'
						buho = '-';
					}else { //buho 'o'
						buho = 'o';
					}
				}else if(score >= 70) {
					grade = 'C';
					if(score >=77) { // buho '+'
						buho = '+';
					}else if(score<=73) { // buho '-'
						buho = '-';
					}else { //buho 'o'
						buho = 'o';
					}
				}else if(score >= 60) {
					grade = 'D';
					if(score >=67) { // buho '+'
						buho = '+';
					}else if(score<=63) { // buho '-'
						buho = '-';
					}else { //buho 'o'
						buho = 'o';
					}
				}else {
					grade = 'F';
				}
				
				
				// 출력 "당신의 점수는 00이고 성적은 0 입니다."
				System.out.println("당신의 점수는 " + score + "이고 성적은 " + grade + buho + " 입니다.");
	}

}