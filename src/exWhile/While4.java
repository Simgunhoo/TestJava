/*�޴� [ ��Ģ���� ]

 * 1. �� 2. ���� 3. �� 4. ������ 99.����
 * 
 */
package exWhile;

import java.util.Scanner;

public class While4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ss = false;
		int sel = 0;
		Scanner scan = new Scanner(System.in);
		
		while(!ss) {
			System.out.println("************[Menu]************");
			System.out.println("1�� �ձ��ϱ�");
			System.out.println("2�� �������ϱ�");
			System.out.println("3�� ���ϱ�");
			System.out.println("4�� ������");
			System.out.println("99�� ����");
			System.out.println("******************************");
			System.out.print("�Է�  : ");
			sel = scan.nextInt();
			int n1 =0;
			int n2 =0;
			
			switch(sel) {
			case 1 :
				System.out.println("�ձ��ϱ�");
				int sum = 0;
				sum = sumTwo();
				System.out.println(sum);
				break;
			case 2 :
				System.out.println("�������ϱ�");
				int sub = 0;
				sub = subTwo();
				System.out.println(sub);
				break;
			case 3 :
				System.out.println("���ϱ�");
				int mul = 0;
				mul = mulTwo();
				System.out.println(mul);
				break;
			case 4 :
				System.out.println("�����ⱸ�ϱ�");
				int div = 0;
				div = divTwo();
				System.out.println(div);
				break;
			case 99 :
				System.out.println("����");
				ss = true;
				break;
			default :
				System.out.println("1��,2��,3��,4��,99�� �� ��������");
			
				
			}
		}

		
		System.out.println("����!!");
	}

	private static int divTwo() {
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int div = 0;
		
		System.out.println("ù��° �����Է�");
		n1 = scan.nextInt();
		System.out.println("�ι�° �����Է�");
		n2 = scan.nextInt();
		
		div = n1 / n2;
		return div;
	}

	private static int mulTwo() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int mul = 0;
		
		System.out.println("ù��° �����Է�");
		n1 =scan.nextInt();
		System.out.println("�ι�° �����Է�");
		n2 =scan.nextInt();
		mul = n1 * n2;
		return mul;
	}

	private static int subTwo() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1=0;
		int n2=0;
		int sub =0;
		
		System.out.println("ù��° �����Է�");
		n1 = scan.nextInt();
		System.out.println("�ι�° �����Է�");
		n2 = scan.nextInt();
		sub = n1-n2;
		
		return sub;
	}

	private static int sumTwo() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1=0; 
		int n2=0;
		int sum=0;
		
		System.out.println("ù��° �����Է�");
		n1=scan.nextInt();
		System.out.println("�ι�° �����Է�");
		n2=scan.nextInt();
		sum = n1+n2;

		
		return sum;
	}

}
