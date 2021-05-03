package exfor;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		
		for(int i =0; i<5; i++) {
			sum= sum + num % 10 ; // 
			num = num/10;
			System.out.println("sum= "+ sum);
		}
	}

}
