
package exfor;

import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {
		// Ű����� �ܼ��� �Է¹޾� 1~9���� ���� ���ϼ���
		//����
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int dan = 0; 
		
		//�Է�
		System.out.print("�Է��Ҵ�");
		dan = scan.nextInt();
		
		//���
		System.out.println(dan +"�����");
		
		for(int i=1; i<=9; i++) {
			//ó���� ����
			result = dan * i ; //ó�� 
			System.out.println(dan + " * " + i + " = " + result);
			//ó���� ����
		}
		
		
	} //end of main(String[] args)
		
		
} // end of Class
	

