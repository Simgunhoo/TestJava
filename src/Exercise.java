/*
 * 1 + (1+2) + (1+2+3) + ... (1+2+3..+10)
 */
public class Exercise {

	public static void main(String[] args) {
		int sum = 0;  //합
		int totalSum =0; // 합의 합
		
		for(int i =1; i<=10; i++) {
			sum= sum +i;   // i에 대한 누적합(1+2...10)
			totalSum = totalSum + sum;  //sum에 대한 누적합 
			
		}
		
		System.out.println(totalSum);
		
			
	}

}
