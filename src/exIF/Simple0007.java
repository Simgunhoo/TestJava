/* A       -> A+,    Ao,    A-
 *90~100      97�̻�        93���� 
 */
package exIF;

import java.util.Scanner;

public class Simple0006 {

	public static void main(String[] args) {
		// ����
				Scanner scan = new Scanner(System.in);
				int score = 0; // ����
				char grade ='x';//����    String grade =null; or String grade;
				char buho ='o';
				// �Է�
				System.out.print("������ �Է��ϼ��� : ");
				score = scan.nextInt();
				
			
				// ó��
				if(score >= 90 && score <= 100) { // 90~ 100������ �� 90<= �̰� score <= 100
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
				//% �����������ڸ� �̿��Ͽ� ��ȣ�� �ۼ��ϱ� 
				if(score>=60 && score <= 100) {
					if(score % 10 >=7) {
						buho = '+';
					} else if(score % 10 <=3) {
						buho = '-';
					} 
					
				}
				// ��� "����� ������ 00�̰� ������ 0 �Դϴ�."
				System.out.println("����� ������ " + score + "�̰� ������ " + grade + buho + " �Դϴ�.");
	}

}