/*메뉴 [ 사칙연산 ]

 * 1. 합 2. 빼기 3. 곱 4. 나누기 99.종료
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
			System.out.println("1번 합구하기");
			System.out.println("2번 뺄셈구하기");
			System.out.println("3번 곱하기");
			System.out.println("4번 나누기");
			System.out.println("99번 종료");
			System.out.println("******************************");
			System.out.print("입력  : ");
			sel = scan.nextInt();
			int n1 =0;
			int n2 =0;
			
			switch(sel) {
			case 1 :
				System.out.println("합구하기");
				int sum = 0;
				sum = sumTwo();
				System.out.println(sum);
				break;
			case 2 :
				System.out.println("뺄셈구하기");
				int sub = 0;
				sub = subTwo();
				System.out.println(sub);
				break;
			case 3 :
				System.out.println("곱하기");
				int mul = 0;
				mul = mulTwo();
				System.out.println(mul);
				break;
			case 4 :
				System.out.println("나누기구하기");
				int div = 0;
				div = divTwo();
				System.out.println(div);
				break;
			case 99 :
				System.out.println("종료");
				ss = true;
				break;
			default :
				System.out.println("1번,2번,3번,4번,99번 만 누르세요");
			
				
			}
		}

		
		System.out.println("종료!!");
	}

	private static int divTwo() {
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int div = 0;
		
		System.out.println("첫번째 숫자입력");
		n1 = scan.nextInt();
		System.out.println("두번째 숫자입력");
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
		
		System.out.println("첫번째 숫자입력");
		n1 =scan.nextInt();
		System.out.println("두번째 숫자입력");
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
		
		System.out.println("첫번째 숫자입력");
		n1 = scan.nextInt();
		System.out.println("두번째 숫자입력");
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
		
		System.out.println("첫번째 숫자입력");
		n1=scan.nextInt();
		System.out.println("두번째 숫자입력");
		n2=scan.nextInt();
		sum = n1+n2;

		
		return sum;
	}

}
