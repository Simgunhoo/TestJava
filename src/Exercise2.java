
public class Exercise2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		for(i=1; i<=6; i++) { // i주사위
			for(j=1; j<=6; j++) {  // j 주사위
				if( i + j == 6) {
					System.out.println("i = " + i + " , j = " + j + " : " +(i+j));
				}
			}
		}
		
	
	}

}
