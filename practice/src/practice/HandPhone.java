package practice;

public class HandPhone {
	String phoneNumber;
	String name;
	String address;
	
	public void hangUp() {
		System.out.printf("%s에게 %s 번호로 전화를 건다. \n", name, phoneNumber);
	}
	public void recieve() {
		System.out.printf("%s가 %s 번호로부터 전화를 받는다.\n",name,phoneNumber);
		
	}
	public void ownerInfo(){
	System.out.printf("이름 : %s\n", name);
		System.out.printf("주소 : %s\n", address);
		System.out.printf("핸드폰번호 : %s\n", phoneNumber);
	}
}
