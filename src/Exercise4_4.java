// ���� 4-4
public class Exercise4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //����
		int num =0;
		int s=1; //��ȣ 
		
		for(int i =1; sum<100; i++, s=-s) {
			num= s * i;
			sum = sum + num;
		}
		System.out.println(" sum="+sum + "num=" + num);
	}

}
