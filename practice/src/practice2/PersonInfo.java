package practice2;

public class PersonInfo {
	String name;
	String address;
	String phoneNumber;
	
	public PersonInfo(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public PersonInfo(String name) {
		this(name, "������ �浿", "010-1111-2222");
		
	}
	
	public PersonInfo(String name, String phoneNumber) {
		this(name, "������ �浿", phoneNumber);
	}
	public void personInfoDisplay() {
		System.out.printf("�̸� : %s, �ּ� : %s, �ڵ��� ��ȣ : %s\n", 
						   name, address, phoneNumber);	
	}
}
