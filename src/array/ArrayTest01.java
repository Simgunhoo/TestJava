/*10명의 국어점수를 입력하세요.
 * korScore 
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] korJumsu = new int[3];
		int sum = 0;
		
		System.out.println("korJumsu 배열의 길이 : " + korJumsu.length);
		
		//배열에 값 입력해보기
		for(int i=0; i<korJumsu.length; i++) {
			System.out.print(i+ "번째 점수입력 - ");
			korJumsu[i] = scan.nextInt();
			sum = sum +korJumsu[i];
			
		}
		//배열의 값 출력해보기
		System.out.println("===[korJumsu배열의 값 출력]===");
//			System.out.println(korJumsu[0]);
//			System.out.println(korJumsu[1]);
//			System.out.println(korJumsu[2]);
			for(int i=0; i < korJumsu.length; i++ ) {
				System.out.println(korJumsu[i]);
			}
			//또 다른 방법
			System.out.println(Arrays.toString(korJumsu)); 
			
			System.out.println("korJumsu배열의 합 : " + sum);
			
			System.out.println("end");
	}

}


