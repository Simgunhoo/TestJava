
package exfor;

import java.util.Scanner;

public class WhileDemo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum =0;
		
		for(int i=1; i<=20; i++) {
			if(i%2 !=0 && i%3 !=0) {
				sum = sum + i;
				System.out.println("sum = " +sum);	
			}
			

		}
		System.out.println("sum = " +sum);
//		System.out.printf("sum= %d \n" ,sum); %c, %s
		
		
	} //end of main(String[] args)
		
		
} // end of Class
	

