package exfor;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		int dan = 0;
		
		for(dan=2; dan<=9; dan++) {
			for(int i=1; i<=3; i++) {
				result = dan * i;
				System.out.println(dan + " * " + i + " = " + result + " ");
			}
			System.out.println();
		}
			
	}

}
