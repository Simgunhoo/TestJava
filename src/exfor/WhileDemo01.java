package exfor;

public class WhileDemo01 {

	public static void main(String[] args) {
		
		int result = 0;
		int dan = 3;
		
		System.out.println(dan + "단 출력");
		for(int i=1; i<=9; i++) {
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);  // 3 * 1 = 3 
		}
		
		
		
		
		
		
		int i =1;
		
		while(i<5) { //조건이 참이면
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------");
		for(int j=1; j<5; j++) {
			System.out.println(j);
		}
		
		
	}
	

}
