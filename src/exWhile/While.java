/*�̴� ������Ʈ ����
 * 1. ���� ON
 * 1-1. �޴� ȭ�鼳�� 1. 1~10������ 2. �Է¹��������� �ܼ���� 99. ����
 * 2. ����1(ȭ�鼳��) :1~10 ������
 * 3. ����2(ȭ�鼳��) : �Է¹��������� �ܼ����
 * 4. �������� OFF
 * 
 * �޼ҵ� ����
 * ������ �޼ҵ��(�μ�1,�μ�2...){    �μ�1, �μ�2.=> arg, �Ű����� 
 */
package exWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean done = false; // done false ��� ����. true ����
		Scanner scan = new Scanner(System.in);
		int sel = 0; //�޴� ���� �Է� ����
		
		
		
		while(!done) {// ����ON
			//�޴�����
			menuPrint();  // �޴� �޼ҵ�
			sel = scan.nextInt();
			
			
			switch(sel) { // switch(���ǽ� �Ǵ� ��)
			
				case 1:
					System.out.println("��");
					int sum = 0;
					sum = sum(); // ���� ���ϴ� �޼ҵ�
					System.out.println("���� sum = " + sum);
					break;
				case 2:
					System.out.println("�ܼ����ϱ�");
					int dan = 0;
					dan =dan();
					break;
				case 99:
					System.out.println("�޴�����");
					done = true;
					break;
				default :
					System.out.println("1,2,99�� �Է��ϼ��� ~~ ���Է��ϼ���");
					
			}
			
//			if( sel == 1 ) {
				 
//				 System.out.println("��");
				
//			}else if(sel == 2) {
				
//				System.out.println("�ܼ� ���");
//					
//			}else if(sel == 99) {
//				System.out.println("�޴�����");
				
//			}else {
//				System.out.println("1.2.99�� �Է��ϼ���");
//			}
		
			
		}
		
		System.out.println("Program End!!!");


	}

	private static void menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("======== [Menu] =======");
		System.out.println("1. 1~10 ������ ��");
		System.out.println("2. �Է¹��� ������ ������ ���");
		System.out.println("99. �����ϱ�");
		System.out.println("======================");
		System.out.println("Select NumBer");
	}

	private static int dan() {
		// TODO Auto-generated method stub
		int dan = 0;
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
		int result = 0;
		int i = 0;
		for(i=1; i<=9; i++) {
			result = dan * i;
			System.out.println(dan + "*" + i + "=" + result);
		}
		return 0;
	}

	private static int sum() {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);
		System.out.println("====================");
		return sum;
	}

}
