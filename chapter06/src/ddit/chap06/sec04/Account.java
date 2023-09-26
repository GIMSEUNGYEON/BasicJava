package ddit.chap06.sec04;

public class Account {
	private String owner;
	private long balance;

	public static void main(String[] args) {
		Account ac = new Account();
		ac.checkBalance();
		ac.deposit(2000);
		ac.withdraw(1000);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setOwner(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setBalance(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public long checkBalance() {
		balance = 1000; 
		System.out.println("현재 통장 잔액은 " + balance + "원 입니다.");
		return balance;
	}

	public long deposit(long amount) {
		balance += amount;
		System.out.println(amount + "원을 입금하셨습니다. 통장 잔액은 " + balance + "원 입니다.");
		return balance;
	}

	public void withdraw(long amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + "원을 출금하셨습니다. 통장 잔액은 " + balance + "원 입니다.");
		} else {
			System.out.println(amount + "원을 출금할 수 없습니다. 잔액이 부족합니다. 남은 잔액은 " + balance + "원 입니다.");
		}		
	}
}
