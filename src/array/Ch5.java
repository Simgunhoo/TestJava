package array;

public class Ch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		for(int i=0; i < ball.length; i++) {
			ball[i] = i +1;
		}
		int temp = 0;
		int j = 0;
		
		for(int i=0; i <6; i++) {
			j= (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i <6; i++) {
			System.out.println("ball[" + i +"] = " + ball[i]);
		}
	}

}
