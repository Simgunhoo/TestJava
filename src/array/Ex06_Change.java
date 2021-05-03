package array;

public class Ex06_Change {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 33;
		arr[1] = 24;
		arr[2] = 55;
		arr[3] = 82;
		arr[4] = 11;
		
		//배열의 값 출력하기
		for(int i =0; i<arr.length; i++ ) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//배열의 값출력
		
		//배열의 값을 역순으로 출력
		for(int i = 4; i>-1; i-- ) {
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//index 요소번호 2,3번의 값을 변경
		int temp = arr[2];
		arr[2] = arr[3];
		arr[3] = temp;
		
		System.out.println("arr2, arr3 값변경 " + "arr[2] = 55 -> " + arr[2] + " , " + "arr[3] = 82 -> " +arr[3]);
	}

}
