/*은행계좌 클래스 -> Account
 * - 속성
 * 계좌번호  -> accountNo
 * 예금주이름 -> ownerName
 * 잔액  -> balance
 * -기능
 * 예금한다 void deposit(int amount);
 * 인출한다 int withdraw(int amount);
 * 
 * 클래스의 특징 : 속성과 기능, 상속, 오버라이딩, 오버로딩, 캡슐화, 다형성
 * 인터페이스 : final필드, 추상메소드로 구성 => 구현
 * 
 */
package kr.co.dong;

public class Account {
	private String accountNo;
	String ownerName;
	int balance;
	
	Account() {} // 디폴트생성자
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	Account(String ownerName){
		this.ownerName = ownerName;
	}
	
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit(int amount) {
		balance += amount;
	}
	int withdraw(int amount) {
		if(balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}

}
