/*
 * �̴�������Ʈ���� 
 */
package exWhile;

import java.util.Scanner;

public class Check01 {

	public static void main(String[] args) {
		boolean done = false;
		int sel = 0;
		Scanner scan = new Scanner(System.in);
		
		while(!done) {
			System.out.println("**********[Menu]**********");
			System.out.println("1�� �޴� :  1~10���� ��");
			System.out.println("2�� �޴� : �Է¹��� ������ �ܼ����");
			System.out.println("99�� �޴� : �����ϱ�");
			System.out.println("**************************");
			System.out.print("�޴�����");
			sel = scan.nextInt();
			
		switch(sel) {
		
			case 1 :
				System.out.println("1~10 �ձ��ϱ�");
				int sum = 0;
				sum= sum();
				break;
				
			case 2 :
				System.out.print("�Է¹��� ������ �ܼ����");
				int dan = 0;
				dan = dan();
				break;
			case 99 :
				System.out.println("�����ϱ�");
				done = true;
				break;
			default:
				System.out.println("1, 2, 99 ���� ��������!");
		}
			
		}
		System.out.println("Program END!!!!");
		
		

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
		int sum = 0;
		for(int i=1; i<=10; i++ ) {
			sum= sum+=i;
		}
		System.out.println("���� " + sum);
		
		return 0;
	} // end of sum()

}
