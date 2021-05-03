	// 학생 수 입력을 받아서 학생의 이름과 점수를 입력하자 
		
		// N              배열명 name , score
		//1. 학생수 입력받기
		
		//2. 이름과 점수 선언 및 생성
		
		//3. 학생의 이름 입력
		
		//4. 학생의 점수 입력
		
		//학생이름 출력for
		
		//점수 출력for
package array;

import java.util.Scanner;

public class Ex07_NameScorePrint {

	public static void main(String[] args) {
		// 학생수 입력을 받아서 학생의 이름과 점수를 입력하자
		// N               배열명:  name , score
		//학생수입력받기
		Scanner scan = new Scanner(System.in);

		System.out.print("학생수는 몇명>");
		int N = scan.nextInt();
		
		// 이름과 점수 선언 및 생성
		String names[] = new String[N];
		int scores[] = new int[N];
		// 학생의 이름 입력		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(i + "번 학생의 이름입력>");
			 names[i] = scan.next();
			 
		}
		System.out.println("학생명단출력");// 학생이름출력
		for (int i = 0; i < names.length; i++) {
			System.out.println(i+" 번 : "+names[i]);
		}
		// 학생의 점수 입력
		System.out.println("학생 점수 입력");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i]+"의 점수>");
			int score = scan.nextInt();
			scores[i] = score;
		}
		
		System.out.println("명단 및 점수 출력");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" : "+scores[i]+" 점");
		}		
		
		

	}

}
