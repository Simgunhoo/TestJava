/*�̴�������Ʈ ����
 * 1. ����ON
 * 1-1. �޴�(ȭ�鼳��)  1. 1~10�������� 2. �Է¹��� ������ �ܼ���� 99. ����
 * 2. ����1(ȭ�鼳��) : 1~10��������
 * 3. ����2(ȭ�鼳��) : �Է¹��� ������ �ܼ����
 * 4. ���������ϰ�;�~~~> OFF
 * 5. END
 */
package exWhile;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		//
		boolean done = false; // done false ��� ����. true ����
		Scanner scan = new Scanner(System.in);
		int sel = 0; //�޴� ���� �Է� ����
		
		
		
		while(!done) {// ����ON
			//�޴�����
			System.out.println("======== [Menu] =======");
			System.out.println("1. 1~10 ������ ��");
			System.out.println("2. �Է¹��� ������ ������ ���");
			System.out.println("99. �����ϱ�");
			System.out.println("======================");
			System.out.println("Select Number : ");
			sel = scan.nextInt();
			
			
			if( sel == 1 ) {
				 sel = sel +i;
				 System.out.println("��");
				
			}else if(sel == 2) {
				sel = sel * i;
				System.out.println("�ܼ� ���");
						
			}else if(sel == 99) {
				System.out.println("�޴�����");
				
			}else {
				System.out.println("1.2.99�� �Է��ϼ���");
			}
		
			
		}
		
		System.out.println("Program End!!!");

	}

}
