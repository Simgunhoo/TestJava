/*
 * �μ���
 */
package exIF;

import java.util.Scanner;

public class Simple0004 {

	public static void main(String[] args) {
		//�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		// ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ����ִ�.
		
		/*
		 * ù° �ٿ� ���� ������ �� �ϳ��� ����Ѵ�.
		 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
		 * A�� B���� ������쿡�� '<'�� ����Ѵ�.
		 * A�� B�� ���� ��쿡�� '=='�� ����Ѵ�
		 */
		//����
		Scanner scan = new Scanner(System.in);
		int A =0;
		int B =0;
		
		String str = "x";
		//�Է�
		System.out.print("A�� ���ڴ� ");
		A = scan.nextInt();
		System.out.print("B�� ���ڴ� ");
		B = scan.nextInt();
		//ó��
		if(A > B) {
			str = ">";
		}else if(A < B) {
			str = "<";
		}else {
			str = "==";
		}
		//���
		System.out.println("�Էµ� ���� " + str + " �Դϴ�.");
		
	}

}
