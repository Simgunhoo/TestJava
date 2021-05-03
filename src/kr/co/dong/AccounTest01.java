package kr.co.dong;

public class AccounTest01 {

	public static void main(String[] args) {
		
		// 객체생성
		Account obj1 = new Account();
		Account obj2 = new Account();
		Account obj3 = new Account("이순신");
		
		// 객체의 속성값 입력
		
//		obj1.accountNo = "123-2323-42323";
		obj1.setAccountNo("123-2323-42323");
		obj1.ownerName = "홍길동";
		obj1.balance = 50000;
		
		obj2.setAccountNo("2323-232-3-2232");
		obj2.ownerName ="장길산";
		obj2.balance = 2000;
		
		printAccount(obj1);
		printAccount(obj2);
		
//		System.out.println("계좌번호 : " + obj2.accountNo);
//		System.out.println("예금주명 : " + obj2.ownerName);
//		System.out.println("잔액 : " + obj2.balance);
	}

	private static void printAccount(Account obj) {
		// TODO Auto-generated method stub
//		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("계좌번호 : " + obj.getAccountNo());
		System.out.println("예금주명 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
	}

}
