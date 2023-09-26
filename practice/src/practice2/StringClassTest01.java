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
		System.out.printf("가수 이름 : %s, 주소 : %s, 핸드폰번호 : %s\n",
						   name, address, phoneNumber);
	}
	public String toString() {
		return String.format("가수 이름 : %s, 주소 : %s, 핸드폰번호 : %s\n",
				   name, address, phoneNumber);
	}
}
