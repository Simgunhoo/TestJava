package array;

import java.util.Scanner;

public class Ex05_search {

	public static void main(String[] args) {
		// �˻� : ���� ã�ƶ� -> ��ġ(index)�� ����??
		int arr[] = {1,5,3,2,4,7,6,9,10,8};
		System.out.print("arr[]={ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " " ); //������ �޸� ���� 	
			
		}
		System.out.println("}");
		
		int input,index = 0;
		Scanner scan =new Scanner(System.in);
		
		System.out.print("ã�� ���� �Է�: ");
		input = scan.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == input ) {
				index = i;
				break;
			}
		}
		System.out.println(input + "�� " + index + "��°�ֽ��ϴ�.");

	}
}
