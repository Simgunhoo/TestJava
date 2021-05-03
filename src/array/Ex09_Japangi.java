/*음료의 종류 : 사이다, 콜라, 커피
 *음료의 가격 : 500, 500, 1000
 *남은 음료 : 5 , 8, 7
 *1차원 배열로 작성: drinkName[3], drinkPrice[3], drinkGa[3] 
 *
 *메뉴
 * 1.동전투입
 * 2.음료수 선택 = > 1, 콜라 2. 사이다 3.커피
 * 3. 음료남은개수
 * 99. 자판기 종료(프로그램 종료)
 * -----------------------
 */
package array;

import java.util.Scanner;

public class Ex09_Japangi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//		String[] drinkNames = {"콜라", "사이다", "커피"};
//		int[] drinkPrice = {500, 500, 1000};
//		int[] drinkGa = {5,8,7};
		
		String drinkNames[] = new String[3];
		int drinkPrice[] = new int[3];
		int drinkGa[] = new int[3];
		
		System.out.println("메뉴를 입력하세요");
		for(int i=0; i< drinkNames.length; i++) {
			drinkNames[i]= scan.next();
		}
		System.out.println("가격");
		for(int i=0; i<drinkPrice.length; i++) {
			System.out.print(drinkNames[i] + "가격을 정하세요");
			drinkPrice[i]=scan.nextInt();
		}
		System.out.println("남은갯수");
		for(int i=0; i<drinkGa.length; i++) {
			System.out.print(drinkNames[i] + "남은갯수는 ");
			drinkGa[i]=scan.nextInt();
		}
		
		
		boolean Japangi = false;
		int sel = 0;
		int coin = 0; //동전
		int change =0; //잔돈
		int total = 0; // 금액누적
		
		
		while(!Japangi) {
			System.out.println("****** 동전 투입 *******");
			System.out.println("1. 동전을 넣으세요");
			System.out.println("2." + drinkNames[0]);
			System.out.println("3." + drinkNames[1]);
			System.out.println("4." + drinkNames[2]);
			System.out.println("99. 종료");
			System.out.println("*********************");
			sel = scan.nextInt();
			
			switch(sel) {
			
			case 1:
				System.out.println("동전을 투입하세요");
				coin = scan.nextInt();
				System.out.println(coin + "원이 들어왔습니다");
				total += coin;
				System.out.println(total);
				break;
				
			case 2:
				if(total == drinkPrice[0] ) {
					System.out.println(drinkNames[0] + "가 나왔습니다.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[0] +"가격은 " + drinkPrice[0] + "원 입니다");
						System.out.println("남은 " + drinkNames[0] + "의 갯수는 " + drinkGa[0] + "개 입니다.");
					}
					
				} else if(total > drinkPrice[0] ) {
					System.out.println(drinkNames[0] + "가 나왔습니다.");
					total -= drinkPrice[0];
					System.out.println(total + "원 거스름돈이 있습니다.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[0] +"가격은 " + drinkPrice[0] + "원 입니다");
							System.out.println("남은 " + drinkNames[0] + "의 갯수는 " + drinkGa[0] + "개 입니다.");
						}
				} else if(total < drinkPrice[0]) {
					total-= drinkPrice[0] ;
					System.out.println( total + "원 부족합니다");
				}
				
				
				break;
				
			case 3:
				if(total == drinkPrice[1]) {
					System.out.println(drinkNames[1] + "가 나왔습니다.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[1] +"가격은 " + drinkPrice[1] + "원 입니다");
						System.out.println("남은 " + drinkNames[1] + "의 갯수는 " + drinkGa[1] + "개 입니다.");
					}
					
				} else if(total > drinkPrice[1]) {
					System.out.println(drinkNames[1] + "가 나왔습니다.");
					total -= drinkPrice[1];
					System.out.println(total + "원 거스름돈이 있습니다.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[1] +"가격은 " + drinkPrice[1] + "원 입니다");
							System.out.println("남은 " + drinkNames[1] + "의 갯수는 " + drinkGa[1] + "개 입니다.");
						}
				} else if(total < drinkPrice[1]) {
					total -= drinkPrice[1];
					System.out.println( total + "원 부족합니다");
				}
				break;
				
							
			case 4:
				if(total == drinkPrice[2]) {
					System.out.println(drinkNames[2] + "가 나왔습니다.");
					for(int i=0; i<1; i++) {
						System.out.println(drinkNames[2] +"가격은 " + drinkPrice[2] + "원 입니다");
						System.out.println("남은 " + drinkNames[2] + "의 갯수는 " + drinkGa[2] + "개 입니다.");
					}
					
				} else if(total > drinkPrice[2]) {
					System.out.println(drinkNames[2] + "가 나왔습니다.");
					total -= drinkPrice[2];
					System.out.println(change + "원 거스름돈이 있습니다.");
						for(int i=0; i<1; i++) {
							System.out.println(drinkNames[2] +"가격은 " + drinkPrice[2] + "원 입니다");
							System.out.println("남은 " + drinkNames[2] + "의 갯수는 " + drinkGa[2] + "개 입니다.");
						}
				} else if(total < drinkPrice[2]) {
					total -= drinkPrice[2];
					System.out.println( total + "원 부족합니다");
				}
				break;
			case 99:
				System.out.println("자판기 종료!");
				Japangi = true;
				break;
				
			default :
				System.out.println("1,2,3,99번 만 누르세요");
				break;
				
			}
		}
		
	}

}
