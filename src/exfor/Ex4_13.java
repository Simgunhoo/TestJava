package exfor;

public class Ex4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34";   // 1 = 0 ,2 = 1, o =2, 3=3, 4=4
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i< value.length(); i++) {
			 ch = value.charAt(i);
		}
		
		if (isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		} else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}
	}

}
