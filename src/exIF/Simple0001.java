/*
 * Ű����� ������ �Է¹޾Ƽ� ¦������ Ȧ������ ��� 
 */
package exIF;

import java.util.Scanner;

public class Simple0001 {

	public static void main(String[] args) {
		//����
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		//�Է�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		//ó�� num1 % 2 => ���������� 1�̸� Ȧ�� 
//		if(���ǹ�) 
		if(num1 % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}else {
			System.out.println("¦���Դϴ�.");
		}
		
		System.out.println("program End!");
	}

}
