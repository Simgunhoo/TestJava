package array;

import java.util.Scanner;

public class Exo4_Array_1To100sum3 {

	public static void main(String[] args) {
		/*
		 * 100��¥�� 1���� �迭�� �����ϰ�
		 * for���� �̿��Ͽ� 1 ~100���� 100���� ���� �Է��ϰ�
		 * �Էµ� 100���� ���� �� 4�� ������� �հ� 4�� ����� ����� ���ϱ�
		 */
		Scanner scan = new Scanner(System.in); 
		System.out.print("�迭�� ���� �Է�: ");
		int N = scan.nextInt();
		
		int[] num = new int [N]; // �迭 ���� �� ����\
		int sum4 = 0; //4�ǹ���� ��
		int count = 0; //ī����
		
		//�Է�
		for(int i=0; i<num.length; i++) {
			num[i] = i +1;
		}
		//ó��
		for(int i=0; i<num.length; i++) {
			if(num[i] % 4 == 0) { //4�� ����̸�
				sum4 =sum4 +num[i]; //��
				count++; //��������
				
			}
		}
		//���
		System.out.println("4�� ����� �� : " +sum4);
		System.out.println("4�� ����� ���� : " + count);
	}

}
