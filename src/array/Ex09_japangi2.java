package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_japangi2 {
	

static Scanner scan = new Scanner(System.in);

 

	static final int COUNT = 3; // ������ type

	public static void main(String[] args) {

		//init(); �ʱ�ȭ
		String[] drinkName = {"�ݶ�", "���̴�","Ŀ��"}; //�����		
		int[] drinkPrice = {500, 700 , 1000};  // ������ ����
		int[] drinkGa = {5,0,7};              // ������ ��������
		boolean done = false; // ���Ǳ���������
		int menu = 0;         // �޴�����Ű
		int selDrink = 0;     // ���ἱ��Ű
 		int money = 0, total=0;        // ���Ե� ��, �ݾ״���
 		//

 		while(!done) {
			//�޴�			
			//�޴������Է¹ޱ�			
 			menu = menuPrint(total);
 			listAll(drinkName, drinkPrice, drinkGa);
 
			// �޴��б�
			switch(menu) {
 
			case 1 :
 				System.out.println("��������");
 				money = Integer.parseInt(scan.next());
				total += money;
				break;
				
			case 2 :
				System.out.println("���� ���� : " + Arrays.toString(drinkName));
				System.out.print("���� ���� ===> ");
				selDrink = Integer.parseInt(scan.next());
 				// selDrink = 1   => drinkName[0],drinkPrice[0],drinkGa[0]
 				// selDrink = 2   => drinkName[1],
 				// selDrink = 3   => drinkName[2]
 				int tmp = selDrink -1;  // �迭�� 0���� �����մϴ�.
 				if(total < drinkPrice[tmp]) {
					System.out.println((drinkPrice[tmp]-total)+"���� ���ڸ��ϴ�.");
					break;  // �ȵǴ°������Է�!
 				}
				if(drinkGa[tmp]<= 0) {
					System.out.println(drinkName[tmp]+"�� ǰ���Դϴ�.");
 					break;
				}
				// ���� ������ ������ �ð� �ۼ�
				try {  
					for(int i=1;i<4;i++) {
						Thread.sleep(1000);//1�� ����
						System.out.println(i + "�� .");
 					}
				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
				}
 				// ������ �ð� ��
				System.out.println(drinkName[tmp] + "�� ���ɴϴ�.");
				total -= drinkPrice[tmp];  // ������ ���
				drinkGa[tmp] = drinkGa[tmp] -1; // ���� -1��
				listAll(drinkName, drinkPrice, drinkGa);
				break;
			case 3 : 
				listAll(drinkName, drinkPrice, drinkGa);
				break;
			case 4 :
				System.out.println("�Ž����� ��ȯ ====>" + total);
				total = 0; //�ʱ�ȭ				
				break;
			case 5 :
				System.out.println("���ᰡ��Ȯ��");
				System.out.println(Arrays.toString(drinkName));
				System.out.println(Arrays.toString(drinkPrice));
				break;
			case 88:
				System.out.println("������ ��� ��");
				admin_mode(drinkPrice,drinkName);
 				break;
			case 99:
				System.out.println("���α׷�����");
				done = true;
				break;
			default :
				System.out.println("1~4�� �����ϼ���");
			}

		}

		System.out.println("Program End!");

	}

	private static void listAll(String[] drinkName,int[] drinkPrice,int[] drinkGa) {

		// ���� ����, ���� , ���� ����
		System.out.println("-------------------------------------------------");
		System.out.println("���� ���� : " + Arrays.toString(drinkName));
 		System.out.println("���� ���� : " + Arrays.toString(drinkPrice ));
		System.out.println("���� ���� : " + Arrays.toString(drinkGa));
		System.out.println("-------------------------------------------------");

	}

 

	private static int menuPrint(int total) {

		System.out.println("===Menu===");
		System.out.println("1.�������� 2. ���ἱ�� 3.��ü���� 99.����");
		System.out.println(" ���Ե� �ݾ� : " + total);
		System.out.print("Select Menu:");

		return Integer.parseInt(scan.next());		

	}

	static void admin_mode(int[] drinkPrice,String[] drinkName) {

	      int adminSel = 0;
	      int sel = 0;
	      int value = 0;
	      String name = "";
	      System.out.println("=============�����ڸ��=============");
	      System.out.println("����� �޴��� �����ϼ���");
	      System.out.println("1. ���� ���� ����  2. ���� �޴� ����");
	      System.out.print("����  :  ");
	      adminSel = Integer.parseInt(scan.next());
	      
	      switch (adminSel) {

	      case 1:
	         System.out.println("���� �޴� ��� = " + Arrays.toString(drinkName));
	         System.out.print("������ �޴��� �Է��ϼ��� : ");
	         sel = Integer.parseInt(scan.next());
	         System.out.print("������ �޴��� �ݾ��� �Է��ϼ��� : ");
	         drinkPrice[sel-1] = Integer.parseInt(scan.next());
	         System.out.println(drinkPrice[sel-1]);
	         System.out.println(Arrays.toString(drinkName));
	         System.out.println(Arrays.toString(drinkPrice));
	         System.out.println("==========================");
	         break;

	      case 2:
	    	  
	         System.out.println("���� �޴� ��� = " + Arrays.toString(drinkName));
	         System.out.print("������ �޴��� �Է��ϼ��� : ");
	         sel = Integer.parseInt(scan.next());
	         System.out.print("������ �޴��� �̸��� �Է��ϼ��� : ");
	         name = scan.next();
	         drinkName[sel - 1] = sel + ". " + name + "(" + drinkPrice[sel - 1] + ")";

	         break;
	         
	      default:

 

	         break;

 

	      }

 

 

 

	   }

 

 

 

}
