/*
 * 1. ����� ����

 * [�޴�]
 * min <= ���� ���� �ݾ�
 * 1.����� ���� => 1.�ݶ� 2. ���̴� 3. Ŀ��
 * 2.���ᳲ������
 * 3.�Ž�����
 * 99. ���Ǳ� ����(���α׷� ����)
 * �������� �ݾ� : 0��
 * 
 * ------------------
 * 1�� �������� ��
 * ���Աݾ��� 500��(min)�̸��̸� "�ݾ��� �����մϴ�" -> ��������ȭ�� ����
 * �̻��̸� ���ἱ���ϰ� �ۼ�
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_japangi4 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String[] drinkName = {"1.�ݶ�", "2.���̴�","3.Ŀ��"}; 		
		int[] drinkPrice = {500, 700 , 1000};  
		int[] drinkGa = {5,0,7};              
		boolean done = false; 
		int menu = 0;         
		int selDrink = 0;     
 		int money = 0, total=0;  
 		int min = drinkPrice[0]; //ó�������� �ּҰ����� ����
 		//������ �ּҰ�
 		//for �������� if �� �ּҰ� ���ϱ� 
 		//min�� ����
 		
 		Scanner scan = new Scanner(System.in);


 		while(!done) {
 			menu = menuPrint(total);
 		
 			
 			switch(menu) {
 			
 			
 			case 1:
 				if(total<500) {
 					System.out.println("�ݾ��� ��������");
 					money = scan.nextInt();
 					total += money;
 					System.out.println(total + "���� ���Խ��ϴ�");
 				} else if(total >= 500) {
 					
 					System.out.println("���Ḧ �������ּ���");
 					System.out.println("���� ���� : " + Arrays.toString(drinkName));
 					System.out.println("���� ���� ====> ");
 					selDrink = Integer.parseInt(scan.next());
 					
 					int tmp = selDrink -1;
 					
 					if(total < drinkPrice[tmp]) {
 						System.out.println((drinkPrice[tmp]-total)+"���� ���ڸ��ϴ�.");
 						break;  
 					}
 					
 					if(drinkGa[tmp]<= 0) {
 						System.out.println(drinkName[tmp]+"�� ǰ���Դϴ�.");
 						break;
 					}
 					System.out.println(drinkName[tmp] + "�� ���Խ��ϴ�.");
 					total -= drinkPrice[tmp];  
 					drinkGa[tmp] = drinkGa[tmp] -1; 
 					
 					break;
 					
 				} else if(total <= 500) {
 					
 					System.out.println("�ݾ��� �����մϴ�");
 					System.out.println("�ݾ��� �ٽ� �����ϼ���");
 					money = scan.nextInt();
 					total += money;
 					System.out.println(total + "���� ���Խ��ϴ�");
 					
 					break;
 				}
 
				break;
		
 			case 2:
 				System.out.println("���� ����" );
 				System.out.println(Arrays.toString(drinkName));
 				System.out.println(Arrays.toString(drinkGa));

				break;
 				
 				
 			case 3:
 				System.out.println("�Ž������� ���Խ��ϴ� =====> " + total + "��");
				total = 0;
 				
 				break;
 				
 			case 99 :
 				System.out.println("���α׷� ����");
				done = true;
				break;
 				
 			default :
 				System.out.println("1��, 2��, 3��, 99���� ��������");
 				
 				break;
 				
 				
 			}
 		}
 		System.out.println("���α׷� ����!");

	}

	private static int menuPrint(int total) {

		System.out.println("------------------Menu------------------");
		System.out.println("1.����� ���� => [1.�ݶ�, 2.���̴�, 3.Ŀ��]" );
		System.out.println("2.���� ���� ����");
		System.out.println("3.�Ž����� ��ȯ");
		System.out.println("���� ���� �ݾ� : " + total);
		System.out.println("----------------------------------------");
		

		return Integer.parseInt(scan.next());		

	}

	private static void listAll(String[] drinkName,int[] drinkPrice,int[] drinkGa) {

		System.out.println("-------------------------------------------------");
		System.out.println("���� ���� : " + Arrays.toString(drinkName));
 		System.out.println("���� ���� : " + Arrays.toString(drinkPrice ));
		System.out.println("���� ���� : " + Arrays.toString(drinkGa));
		System.out.println("-------------------------------------------------");

	}
	

}
