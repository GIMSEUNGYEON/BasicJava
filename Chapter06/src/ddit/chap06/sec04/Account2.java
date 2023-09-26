package ddit.chap06.sec04;

public class Account2 {
	private String owner;
	private long balance;
	//멤버필드 변수는 클래스를 객체로 만들때마다 매번 초기화된다.
	Account2(String owner) {
		this.owner = owner;
	}

	Account2() {
	} // 매개변수를 갖지 않는 생성자

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}
	
	public void setBalance(long balance){
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}

	public long deposit(long amount) {
		balance += amount;
		return balance;
	}

	public long withDraw(long amount) {
		if (balance < amount) {
			
		} else {
			balance -= amount;
		}
		return balance;
	}
}
