/*
 * 1. 음료수 선택

 * [메뉴]
 * min <= 제일 낮은 금액
 * 1.음료수 선택 => 1.콜라 2. 사이다 3. 커피
 * 2.음료남은개수
 * 3.거스름돈
 * 99. 자판기 종료(프로그램 종료)
 * 현재투입 금액 : 0원
 * 
 * ------------------
 * 1번 선택했을 때
 * 투입금액이 500원(min)미만이면 "금액이 부족합니다" -> 동전투입화면 구현
 * 이상이면 음료선택하게 작성
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09_japangi4 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		String[] drinkName = {"1.콜라", "2.사이다","3.커피"}; 		
		int[] drinkPrice = {500, 700 , 1000};  
		int[] drinkGa = {5,0,7};              
		boolean done = false; 
		int menu = 0;         
		int selDrink = 0;     
 		int money = 0, total=0;  
 		int min = drinkPrice[0]; //처음가격을 최소값으로 지정
 		//가격의 최소값
 		//for 문돌려서 if 로 최소값 구하기 
 		//min에 대입
 		
 		Scanner scan = new Scanner(System.in);


 		while(!done) {
 			menu = menuPrint(total);
 		
 			
 			switch(menu) {
 			
 			
 			case 1:
 				if(total<500) {
 					System.out.println("금액을 넣으세요");
 					money = scan.nextInt();
 					total += money;
 					System.out.println(total + "원이 들어왔습니다");
 				} else if(total >= 500) {
 					
 					System.out.println("음료를 선택해주세요");
 					System.out.println("음료 종류 : " + Arrays.toString(drinkName));
 					System.out.println("음료 선택 ====> ");
 					selDrink = Integer.parseInt(scan.next());
 					
 					int tmp = selDrink -1;
 					
 					if(total < drinkPrice[tmp]) {
 						System.out.println((drinkPrice[tmp]-total)+"원이 모자릅니다.");
 						break;  
 					}
 					
 					if(drinkGa[tmp]<= 0) {
 						System.out.println(drinkName[tmp]+"가 품절입니다.");
 						break;
 					}
 					System.out.println(drinkName[tmp] + "가 나왔습니다.");
 					total -= drinkPrice[tmp];  
 					drinkGa[tmp] = drinkGa[tmp] -1; 
 					
 					break;
 					
 				} else if(total <= 500) {
 					
 					System.out.println("금액이 부족합니다");
 					System.out.println("금액을 다시 투입하세요");
 					money = scan.nextInt();
 					total += money;
 					System.out.println(total + "원이 들어왔습니다");
 					
 					break;
 				}
 
				break;
		
 			case 2:
 				System.out.println("남은 수량" );
 				System.out.println(Arrays.toString(drinkName));
 				System.out.println(Arrays.toString(drinkGa));

				break;
 				
 				
 			case 3:
 				System.out.println("거스름돈이 나왔습니다 =====> " + total + "원");
				total = 0;
 				
 				break;
 				
 			case 99 :
 				System.out.println("프로그램 종료");
				done = true;
				break;
 				
 			default :
 				System.out.println("1번, 2번, 3번, 99번만 누르세요");
 				
 				break;
 				
 				
 			}
 		}
 		System.out.println("프로그램 종료!");

	}

	private static int menuPrint(int total) {

		System.out.println("------------------Menu------------------");
		System.out.println("1.음료수 선택 => [1.콜라, 2.사이다, 3.커피]" );
		System.out.println("2.음료 남은 개수");
		System.out.println("3.거스름돈 반환");
		System.out.println("현재 투입 금액 : " + total);
		System.out.println("----------------------------------------");
		

		return Integer.parseInt(scan.next());		

	}

	private static void listAll(String[] drinkName,int[] drinkPrice,int[] drinkGa) {

		System.out.println("-------------------------------------------------");
		System.out.println("음료 종류 : " + Arrays.toString(drinkName));
 		System.out.println("음료 가격 : " + Arrays.toString(drinkPrice ));
		System.out.println("남은 수량 : " + Arrays.toString(drinkGa));
		System.out.println("-------------------------------------------------");

	}
	

}
