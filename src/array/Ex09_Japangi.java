/*������ ���� : ���̴�, �ݶ�, Ŀ��
 *������ ���� : 500, 500, 1000
 *���� ���� : 5 , 8, 7
 *1���� �迭�� �ۼ�: drinkName[3], drinkPrice[3], drinkGa[3] 
 *
 *�޴�
 * 1.��������
 * 2.����� ���� = > 1, �ݶ� 2. ���̴� 3.Ŀ��
 * 3. ���ᳲ������
 * 99. ���Ǳ� ����(���α׷� ����)
 * -----------------------
 */
package array;

import java.util.Scanner;

public class Ex09_Japangi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		String[] drinkNames = {"�ݶ�", "���̴�", "Ŀ��"};
//		int[] drinkPrice = {500, 500, 1000};
//		int[] drinkGa = {5,8,7};
		
		String drinkNames[] = new String[3];
		int drinkPrice[] = new int[3];
		int drinkGa[] = new int[3];
		
		System.out.println("�޴��� �Է��ϼ���");
		for(int i=0; i< drinkNames.length; i++) {
			drinkNames[i]= scan.next();
		}
		System.out.println("����");
		for(int i=0; i<drinkPrice.length; i++) {
			System.out.print(drinkNames[i] + "������ ���ϼ���");
			drinkPrice[i]=scan.nextInt();
		}
		System.out.println("��������");
		for(int i=0; i<drinkGa.length; i++) {
			System.out.print(drinkNames[i] + "���������� ");
			drinkGa[i]=scan.nextInt();
		}
		
		
		boolean Japangi = false;
		int sel = 0;
		int coin = 0; //����
		int change =0; //�ܵ�
		int total = 0; // �ݾ״���
		
		
		while(!Japangi) {
			System.out.println("****** ���� ���� *******");
			System.out.println("1. ������ ��������");
			System.out.println("2." + drinkNames[0]);
			System.out.println("3." + drinkNames[1]);
			System.out.println("4." + drinkNames[2]);
			System.out.println("99. ����");
			System.out.println("*********************");
			sel = scan.nextInt();
			
			switch(sel) {
			
			case 1:
				System.out.println("������ �����ϼ���");
				coin = scan.nextInt();
				System.out.println(coin + "���� ���Խ��ϴ�");
				total += coin;
				System.out.println(total);
				break;
				
			case 2:
				if(total == drinkPrice[0] ) {
					System.out.println(drinkNames[0] + "�� ���Խ��ϴ�.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[0] +"������ " + drinkPrice[0] + "�� �Դϴ�");
						System.out.println("���� " + drinkNames[0] + "�� ������ " + drinkGa[0] + "�� �Դϴ�.");
					}
					
				} else if(total > drinkPrice[0] ) {
					System.out.println(drinkNames[0] + "�� ���Խ��ϴ�.");
					total -= drinkPrice[0];
					System.out.println(total + "�� �Ž������� �ֽ��ϴ�.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[0] +"������ " + drinkPrice[0] + "�� �Դϴ�");
							System.out.println("���� " + drinkNames[0] + "�� ������ " + drinkGa[0] + "�� �Դϴ�.");
						}
				} else if(total < drinkPrice[0]) {
					total-= drinkPrice[0] ;
					System.out.println( total + "�� �����մϴ�");
				}
				
				
				break;
				
			case 3:
				if(total == drinkPrice[1]) {
					System.out.println(drinkNames[1] + "�� ���Խ��ϴ�.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[1] +"������ " + drinkPrice[1] + "�� �Դϴ�");
						System.out.println("���� " + drinkNames[1] + "�� ������ " + drinkGa[1] + "�� �Դϴ�.");
					}
					
				} else if(total > drinkPrice[1]) {
					System.out.println(drinkNames[1] + "�� ���Խ��ϴ�.");
					total -= drinkPrice[1];
					System.out.println(total + "�� �Ž������� �ֽ��ϴ�.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[1] +"������ " + drinkPrice[1] + "�� �Դϴ�");
							System.out.println("���� " + drinkNames[1] + "�� ������ " + drinkGa[1] + "�� �Դϴ�.");
						}
				} else if(total < drinkPrice[1]) {
					total -= drinkPrice[1];
					System.out.println( total + "�� �����մϴ�");
				}
				break;
				
							
			case 4:
				if(total == drinkPrice[2]) {
					System.out.println(drinkNames[2] + "�� ���Խ��ϴ�.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[2] +"������ " + drinkPrice[2] + "�� �Դϴ�");
						System.out.println("���� " + drinkNames[2] + "�� ������ " + drinkGa[2] + "�� �Դϴ�.");
					}
					
				} else if(total > drinkPrice[2]) {
					System.out.println(drinkNames[2] + "�� ���Խ��ϴ�.");
					total -= drinkPrice[2];
					System.out.println(change + "�� �Ž������� �ֽ��ϴ�.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[2] +"������ " + drinkPrice[2] + "�� �Դϴ�");
							System.out.println("���� " + drinkNames[2] + "�� ������ " + drinkGa[2] + "�� �Դϴ�.");
						}
				} else if(total < drinkPrice[2]) {
					total -= drinkPrice[2];
					System.out.println( total + "�� �����մϴ�");
				}
				break;
			case 99:
				System.out.println("���Ǳ� ����!");
				Japangi = true;
				break;
				
			default :
				System.out.println("1,2,3,99�� �� ��������");
				break;
				
			}
		}
		
	}

}
