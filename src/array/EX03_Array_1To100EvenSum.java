package array;

import java.util.Scanner;

public class EX03_Array_1To100EvenSum {

	public static void main(String[] args) {
		/*
		 * 100��¥�� 1���� �迭�� �����ϰ� 
		 * for ���� �̿� �Ͽ� 1 ~ 100 ���� 100���� ���� �Է��ϰ�
		 * �Էµ� 100���� ���� �� ¦������ �� ���ϱ�
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[100];
		int sum = 0;
		int i=0;
		System.out.println("���� 1 ~ 100 �� �ԷµǾ����ϴ�.");

		for (i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		//i�� �ʱ�ȭ	     for(;;){  <=> while(true){	
		for (i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("1~100������ ¦������ ���� "+sum+" �Դϴ�");
	}

}
