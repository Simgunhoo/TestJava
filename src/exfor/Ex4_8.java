/*
 * ������ 2x+4y=10�� ����ظ� ���Ͻÿ� �� x�� y�� �����̰� ������ ������ 0<=x<=10,   0<=y<=10�̴� 
 */
package exfor;

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if(2 * x + 4 * y == 10) {
			    	System.out.println("x =" + x + " y = " +y );
				}
			}
		}

	}

}