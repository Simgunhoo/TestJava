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

public class Ex09_japangi3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] drinkName = {"�ݶ�", "���̴�","Ŀ��"}; 		
		int[] drinkPrice = {500, 700 , 1000};  
		int[] drinkGa = {5,0,7};              
		boolean done = false; 
		int menu = 0;         
		int selDrink = 0;     
 		int money = 0, total=0;  
 		int min =0;

 		while(!done) {
 			System.out.println("***************�޴�***************");
 			System.out.println("1. ���ἱ�� 3.�Ž����� ��ȯ 99.����");
 			System.out.println(" ���� ���� �ݾ� : " + total + "��");
 			System.out.println("*********************************");
 			System.out.print("Select Menu:");
 			menu =scan.nextInt();
 			
 			switch(menu) {
 			
 			
 			case 1:
 				System.out.println("������ �����ϼ���");
 					money = scan.nextInt();
					total += money;
					System.out.println(total + "���� ���Խ��ϴ�");
 				if(money >= 500) {
 					System.out.println("���Ḧ �������ּ���");
 					listAll(drinkName, drinkPrice, drinkGa);
 					System.out.println("���� ���� : " + Arrays.toString(drinkName));
 					System.out.print("���� ���� ===> ");
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
 					listAll(drinkName, drinkPrice, drinkGa);
 					break;
 				} else if(money <= 500) {
 					System.out.println("�ݾ��� �����մϴ�");
 					System.out.println("�ݾ��� �ٽ� �����ϼ���");
 					money = scan.nextInt();
					total += money;
					System.out.println(total + "���� ���Խ��ϴ�");
 					
 				}
 				
 				break;
 				
 			case 2:
 				listAll(drinkName, drinkPrice, drinkGa);
 				System.out.println("���� ���� : " + Arrays.toString(drinkName));
				System.out.print("���� ���� ===> ");
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
				listAll(drinkName, drinkPrice, drinkGa);
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

	private static void listAll(String[] drinkName,int[] drinkPrice,int[] drinkGa) {

		System.out.println("-------------------------------------------------");
		System.out.println("���� ���� : " + Arrays.toString(drinkName));
 		System.out.println("���� ���� : " + Arrays.toString(drinkPrice ));
		System.out.println("���� ���� : " + Arrays.toString(drinkGa));
		System.out.println("-------------------------------------------------");

	}
	

}
