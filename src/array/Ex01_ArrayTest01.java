package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_ArrayTest01 {

	public static void main(String[] args) {
		// 배열(Array) : 같은 타입의 데이터를 하나의 변수에 저장하는 구조
				// 배열 선언
				// 타입[] 배열이름 or 타입 배열이름[]
				// 배열 선언
				int[] number;
				int number1[];
				
				//배열 선언 후 값 목록을 지정할 경우 new 연산자를 사용 하여 목록을 지정한다
				number = new int[] {10,20};
				System.out.println(number[1]);
				
				
				
				// 배열을 선언하면서 값을 주기
				int[] number2 = { 11, 12, 13 };
				// number2 배열의 첫번째 칸에 저장된 값 출력
				System.out.println(number2[0]);
				System.out.println(number2[1]);
				System.out.println(number2[2]);
//				System.out.println(number2[3]);

				
				
				String[] name = { "인덱스0", "인덱스1", "인덱스2", "인덱스3" };

				System.out.println(name[0]);
				// for문을 이용해서 name 배열에 저장된 값을 모두 출력
				for (int i = 0; i < name.length; i++) {
					System.out.println("name["+i+"] = "+name[i]);
				}
				
				// 정수형 배열 변수를 하나 선언해서 값을 4개 저장하고 
				// 배열변수에 저장된 모든 값의 총합과 평균을 출력 
				int[] numbers = {1, 2, 3, 5};// index : 3, length(크기) :4
				//numbers[4] = 1;
				int sum = 0;
				System.out.println(numbers.length);
				for(int i=0; i<numbers.length;i++) {
					System.out.println(numbers[i]);
					sum += numbers[i];
				}
				System.out.println("총합 : "+sum);
				System.out.println("평균 : "+sum/numbers.length);
				
				
				// 배열선언하면서 배열의 크기만 지정하기 
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
				System.out.println("korJumsu 배열의 길이 : " + korJumsu.length);
				
				//배열에 값 입력해보기
				for(int i=0; i<korJumsu.length; i++) {
					System.out.print(i+"번째 점수입력 - ");
					korJumsu[i] = scan.nextInt();
					sum1 = sum1 + korJumsu[i];
				}
				//배열의 값 출력해보기
				System.out.println("===[korJumsu배열의 값 출력]===");
//				System.out.println(korJumsu[0]);
//				System.out.println(korJumsu[1]);
//				System.out.println(korJumsu[2]);
				for(int i=0; i<korJumsu.length; i++) {
					System.out.println(korJumsu[i]);
				}
				//또다른 방법
				System.out.println(Arrays.toString(korJumsu));
				
				System.out.println("korJumsu배열의 합 : " + sum1);
				
				
				System.out.println("end");
			}

		}