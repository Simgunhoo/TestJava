/*
 * 1 + (1+2) + (1+2+3) + ... (1+2+3..+10)
 */
public class Exercise {

	public static void main(String[] args) {
		int sum = 0;  //��
		int totalSum =0; // ���� ��
		
		for(int i =1; i<=10; i++) {
			sum= sum +i;   // i�� ���� ������(1+2...10)
			totalSum = totalSum + sum;  //sum�� ���� ������ 
			
		}
		
		System.out.println(totalSum);
		
			
	}

}
