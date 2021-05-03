package array;

import java.util.Scanner;

public class Exo2_MaxNum {

	public static void main(String[] args) {
		/*
		 * 5열짜리 1차원 배열을 선언하고
		 * 스캐너를 이용하여 값은 하나하나 입력하고
		 * 입력한 값 중 가장 큰 값을 구하시오.
		 */
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;  //큰값
		int min = 200;  //작은값을 할때는 초기화를 조심하세요.
		int i = 0;
		System.out.println("정수 " + arr.length +"개를 입력하세요.");
		
		for(i = 0; i<arr.length; i++) {
			System.out.print(i + "번째 정수를 입력하세요.>");
			arr[i] = scan.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}else if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		System.out.println("가장 작은 수는 " + min + " 입니다.");
		
	}

}