package practice2;

public class StringClassTest01 {
	String name;
	String address;
	String phoneNumber;
	public StringClassTest01(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public void infoDisplay() {
		System.out.printf("���� �̸� : %s, �ּ� : %s, �ڵ�����ȣ : %s\n",
						   name, address, phoneNumber);
	}
	public String toString() {
		return String.format("���� �̸� : %s, �ּ� : %s, �ڵ�����ȣ : %s\n",
				   name, address, phoneNumber);
	}
}
