/*
 * 문자열이 12345 라면  1+2+3+4+5 의 결과인 15를 출력이되어야 한다.
 */
package exfor;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";  // String str -> 자리수 hello h=0 ~~ 문자열의 길이
		int sum = 0;
		
		
		for(int i=0; i <str.length(); i++) {
			sum = sum + str.charAt(i) - '0';
			
			System.out.println("sum="+sum);
		}

	}

}
