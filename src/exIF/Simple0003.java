/* ���̸� Ű����� �Է¹޾Ƽ�
 * 60���̻��̸� "����"
 * 60���̸� 40�� �̻��̸� "�߳�"
 * 40���̸��̸� "û�ҳ�"�� ����ϴ� ���α׷����ϱ�.
 * ��)
 * "����� ���̴� 00 �̰� 000�Դϴ�.
 */
package exIF;

import java.util.Scanner;

public class Simple0003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age =0;
		String str = "sss";
		
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		
		if(age >= 60) {
			str = "����";
		}else if(age >=40 ) {
			str = "�߳�";
		}else {
			str = "û�ҳ�";
		}
		System.out.println("����� ���̴� "+ age +"�̰� " + str +"�Դϴ�. ");	
		
	}

}
