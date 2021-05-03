package array;

import java.util.Scanner;

public class EX03_Array_1To100EvenSum {

	public static void main(String[] args) {
		/*
		 * 100열짜리 1차원 배열을 선언하고 
		 * for 문을 이용 하여 1 ~ 100 까지 100개의 값을 입력하고
		 * 입력된 100개의 값의 중 짝수들의 합 구하기
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[100];
		int sum = 0;
		int i=0;
		System.out.println("정수 1 ~ 100 이 입력되었습니다.");

		for (i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		//i를 초기화	     for(;;){  <=> while(true){	
		for (i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				sum = sum + arr[i];
			}
		}
		System.out.println("1~100까지의 짝수들의 합은 "+sum+" 입니다");
	}

}
