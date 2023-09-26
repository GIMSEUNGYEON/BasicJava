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
		this(name, "강동구 길동", "010-1111-2222");
		
	}
	
	public PersonInfo(String name, String phoneNumber) {
		this(name, "강동구 길동", phoneNumber);
	}
	public void personInfoDisplay() {
		System.out.printf("이름 : %s, 주소 : %s, 핸드폰 번호 : %s\n", 
						   name, address, phoneNumber);	
	}
}
