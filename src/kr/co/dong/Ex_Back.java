package kr.co.dong;

import java.util.Scanner;

public class Ex_Back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 1; i<=T; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			
			System.out.println();
		
		}
	
	
	}

}
