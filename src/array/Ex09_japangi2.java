package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_japangi2 {
	

static Scanner scan = new Scanner(System.in);

 

	static final int COUNT = 3; // 음료의 type

	public static void main(String[] args) {

		//init(); 초기화
		String[] drinkName = {"콜라", "사이다","커피"}; //음료명		
		int[] drinkPrice = {500, 700 , 1000};  // 음료의 가격
		int[] drinkGa = {5,0,7};              // 음료의 남은개수
		boolean done = false; // 자판기중지여부
		int menu = 0;         // 메뉴선택키
		int selDrink = 0;     // 음료선택키
 		int money = 0, total=0;        // 투입된 돈, 금액누적
 		//

 		while(!done) {
			//메뉴			
			//메뉴선택입력받기			
 			menu = menuPrint(total);
 			listAll(drinkName, drinkPrice, drinkGa);
 
			// 메뉴분기
			switch(menu) {
 
			case 1 :
 				System.out.println("동전투입");
 				money = Integer.parseInt(scan.next());
				total += money;
				break;
				
			case 2 :
				System.out.println("음료 종류 : " + Arrays.toString(drinkName));
				System.out.print("음료 선택 ===> ");
				selDrink = Integer.parseInt(scan.next());
 				// selDrink = 1   => drinkName[0],drinkPrice[0],drinkGa[0]
 				// selDrink = 2   => drinkName[1],
 				// selDrink = 3   => drinkName[2]
 				int tmp = selDrink -1;  // 배열은 0부터 시작합니다.
 				if(total < drinkPrice[tmp]) {
					System.out.println((drinkPrice[tmp]-total)+"원이 모자릅니다.");
					break;  // 안되는경우먼저입력!
 				}
				if(drinkGa[tmp]<= 0) {
					System.out.println(drinkName[tmp]+"가 품절입니다.");
 					break;
				}
				// 음료 나오는 딜레이 시간 작성
				try {  
					for(int i=1;i<4;i++) {
						Thread.sleep(1000);//1초 정지
						System.out.println(i + "초 .");
 					}
				} catch (InterruptedException e) {
 					// TODO Auto-generated catch block
 					e.printStackTrace();
				}
 				// 딜레이 시간 끝
				System.out.println(drinkName[tmp] + "가 나옵니다.");
				total -= drinkPrice[tmp];  // 남은돈 계산
				drinkGa[tmp] = drinkGa[tmp] -1; // 수량 -1개
				listAll(drinkName, drinkPrice, drinkGa);
				break;
			case 3 : 
				listAll(drinkName, drinkPrice, drinkGa);
				break;
			case 4 :
				System.out.println("거스름돈 반환 ====>" + total);
				total = 0; //초기화				
				break;
			case 5 :
				System.out.println("음료가격확인");
				System.out.println(Arrays.toString(drinkName));
				System.out.println(Arrays.toString(drinkPrice));
				break;
			case 88:
				System.out.println("관리자 모드 온");
				admin_mode(drinkPrice,drinkName);
 				break;
			case 99:
				System.out.println("프로그램종료");
				done = true;
				break;
			default :
				System.out.println("1~4를 선택하세요");
			}

		}

		System.out.println("Program End!");

	}

	private static void listAll(String[] drinkName,int[] drinkPrice,int[] drinkGa) {

		// 음료 종류, 가격 , 남은 갯수
		System.out.println("-------------------------------------------------");
		System.out.println("음료 종류 : " + Arrays.toString(drinkName));
 		System.out.println("음료 가격 : " + Arrays.toString(drinkPrice ));
		System.out.println("남은 수량 : " + Arrays.toString(drinkGa));
		System.out.println("-------------------------------------------------");

	}

 

	private static int menuPrint(int total) {

		System.out.println("===Menu===");
		System.out.println("1.동전투입 2. 음료선택 3.전체보기 99.종료");
		System.out.println(" 투입된 금액 : " + total);
		System.out.print("Select Menu:");

		return Integer.parseInt(scan.next());		

	}

	static void admin_mode(int[] drinkPrice,String[] drinkName) {

	      int adminSel = 0;
	      int sel = 0;
	      int value = 0;
	      String name = "";
	      System.out.println("=============관리자모드=============");
	      System.out.println("사용할 메뉴를 선택하세요");
	      System.out.println("1. 음료 가격 조정  2. 음료 메뉴 조정");
	      System.out.print("선택  :  ");
	      adminSel = Integer.parseInt(scan.next());
	      
	      switch (adminSel) {

	      case 1:
	         System.out.println("현재 메뉴 목록 = " + Arrays.toString(drinkName));
	         System.out.print("변경할 메뉴를 입력하세요 : ");
	         sel = Integer.parseInt(scan.next());
	         System.out.print("변경할 메뉴의 금액을 입력하세요 : ");
	         drinkPrice[sel-1] = Integer.parseInt(scan.next());
	         System.out.println(drinkPrice[sel-1]);
	         System.out.println(Arrays.toString(drinkName));
	         System.out.println(Arrays.toString(drinkPrice));
	         System.out.println("==========================");
	         break;

	      case 2:
	    	  
	         System.out.println("현재 메뉴 목록 = " + Arrays.toString(drinkName));
	         System.out.print("변경할 메뉴를 입력하세요 : ");
	         sel = Integer.parseInt(scan.next());
	         System.out.print("변경할 메뉴의 이름을 입력하세요 : ");
	         name = scan.next();
	         drinkName[sel - 1] = sel + ". " + name + "(" + drinkPrice[sel - 1] + ")";

	         break;
	         
	      default:

 

	         break;

 

	      }

 

 

 

	   }

 

 

 

}
