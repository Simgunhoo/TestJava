package exfor;

import java.util.Scanner;

public class ForDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int dan = 0; 
		
		
		//���
		
		for(dan =2; dan<=9; dan++) {
			System.out.println(dan +"�����");
			for(int i = 1; i<=9; i++ ) {
				result = dan * i;
				System.out.print(dan + " * " + i  + " = " + result + "  ");
			}
			System.out.println();
			
		// 1���� 10������ ���� ���غ���
			int sum = 0 ;// ��
			
			for(int i=1; i<=10; i++) {
				sum = sum +i;
				System.out.println(i + "�϶� sum= " + sum);
	
			}
			System.out.println(sum);
		}
	}
	
}
