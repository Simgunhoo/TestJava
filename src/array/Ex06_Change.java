package array;

public class Ex06_Change {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 33;
		arr[1] = 24;
		arr[2] = 55;
		arr[3] = 82;
		arr[4] = 11;
		
		//�迭�� �� ����ϱ�
		for(int i =0; i<arr.length; i++ ) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//�迭�� �����
		
		//�迭�� ���� �������� ���
		for(int i = 4; i>-1; i-- ) {
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//index ��ҹ�ȣ 2,3���� ���� ����
		int temp = arr[2];
		arr[2] = arr[3];
		arr[3] = temp;
		
		System.out.println("arr2, arr3 ������ " + "arr[2] = 55 -> " + arr[2] + " , " + "arr[3] = 82 -> " +arr[3]);
	}

}
