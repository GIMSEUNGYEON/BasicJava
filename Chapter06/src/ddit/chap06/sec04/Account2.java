package ddit.chap06.sec04;

public class Account2 {
	private String owner;
	private long balance;
	//����ʵ� ������ Ŭ������ ��ü�� ���鶧���� �Ź� �ʱ�ȭ�ȴ�.
	Account2(String owner) {
		this.owner = owner;
	}

	Account2() {
	} // �Ű������� ���� �ʴ� ������

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
