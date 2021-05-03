package array;

import java.util.Scanner;

public class Ex05_search {

	public static void main(String[] args) {
		// 검색 : 값을 찾아라 -> 위치(index)가 어디야??
		int arr[] = {1,5,3,2,4,7,6,9,10,8};
		System.out.print("arr[]={ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " ); //마지막 콤마 수정 	
			
		}
		System.out.println("}");
		
		int input,index = 0;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력: ");
		input = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == input ) {
				index = i;
				break;
			}
		}
		System.out.println(input + "는 " + index + "번째있습니다.");

	}
}
