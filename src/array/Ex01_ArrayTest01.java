package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_ArrayTest01 {

	public static void main(String[] args) {
		// �迭(Array) : ���� Ÿ���� �����͸� �ϳ��� ������ �����ϴ� ����
				// �迭 ����
				// Ÿ��[] �迭�̸� or Ÿ�� �迭�̸�[]
				// �迭 ����
				int[] number;
				int number1[];
				
				//�迭 ���� �� �� ����� ������ ��� new �����ڸ� ��� �Ͽ� ����� �����Ѵ�
				number = new int[] {10,20};
				System.out.println(number[1]);
				
				
				
				// �迭�� �����ϸ鼭 ���� �ֱ�
				int[] number2 = { 11, 12, 13 };
				// number2 �迭�� ù��° ĭ�� ����� �� ���
				System.out.println(number2[0]);
				System.out.println(number2[1]);
				System.out.println(number2[2]);
//				System.out.println(number2[3]);

				
				
				String[] name = { "�ε���0", "�ε���1", "�ε���2", "�ε���3" };

				System.out.println(name[0]);
				// for���� �̿��ؼ� name �迭�� ����� ���� ��� ���
				for (int i = 0; i < name.length; i++) {
					System.out.println("name["+i+"] = "+name[i]);
				}
				
				// ������ �迭 ������ �ϳ� �����ؼ� ���� 4�� �����ϰ� 
				// �迭������ ����� ��� ���� ���հ� ����� ��� 
				int[] numbers = {1, 2, 3, 5};// index : 3, length(ũ��) :4
				//numbers[4] = 1;
				int sum = 0;
				System.out.println(numbers.length);
				for(int i=0; i<numbers.length;i++) {
					System.out.println(numbers[i]);
					sum += numbers[i];
				}
				System.out.println("���� : "+sum);
				System.out.println("��� : "+sum/numbers.length);
				
				
				// �迭�����ϸ鼭 �迭�� ũ�⸸ �����ϱ� 
				int[] num = new int[3];
				System.out.println(num.length);
				System.out.println(num[0]);
				System.out.println(num[1]);
				System.out.println(num[2]);
				//System.out.println(num[3]);
				num[0] = 5;
				num[1] = 7;
				num[2] = 100;
				System.out.println(num[0]);
				System.out.println(num[1]);
				System.out.println(num[2]);
				
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int[] korJumsu = new int[3]; 
				int sum1 = 0;
				System.out.println("korJumsu �迭�� ���� : " + korJumsu.length);
				
				//�迭�� �� �Է��غ���
				for(int i=0; i<korJumsu.length; i++) {
					System.out.print(i+"��° �����Է� - ");
					korJumsu[i] = scan.nextInt();
					sum1 = sum1 + korJumsu[i];
				}
				//�迭�� �� ����غ���
				System.out.println("===[korJumsu�迭�� �� ���]===");
//				System.out.println(korJumsu[0]);
//				System.out.println(korJumsu[1]);
//				System.out.println(korJumsu[2]);
				for(int i=0; i<korJumsu.length; i++) {
					System.out.println(korJumsu[i]);
				}
				//�Ǵٸ� ���
				System.out.println(Arrays.toString(korJumsu));
				
				System.out.println("korJumsu�迭�� �� : " + sum1);
				
				
				System.out.println("end");
			}

		}