/*
 * ���ڿ��� 12345 ���  1+2+3+4+5 �� ����� 15�� ����̵Ǿ�� �Ѵ�.
 */
package exfor;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";  // String str -> �ڸ��� hello h=0 ~~ ���ڿ��� ����
		int sum = 0;
		
		
		for(int i=0; i <str.length(); i++) {
			sum = sum + str.charAt(i) - '0';
			
			System.out.println("sum="+sum);
		}

	}

}
