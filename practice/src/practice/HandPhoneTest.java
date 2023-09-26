package practice;

public class HandPhoneTest {
	public static void main(String[] args) {
		HandPhone samsungHpc = new HandPhone();
		HandPhone lgHpc = new HandPhone();
		HandPhone motoHpc = new HandPhone();  
		// 개체를 각자 생성해서 HandPhone 클래스로부터 받는 값을 각각 달리할 수 있음
		
		//객체 samsungHpc에 들어갈 데이터
		samsungHpc.name = "박현미";
		samsungHpc.address = "서울시 강동구";
		samsungHpc.phoneNumber = "010-1234-1234";
		//출력
		samsungHpc.ownerInfo();
		System.out.println();
		
		lgHpc.name = "현미라";
		lgHpc.address = "서울시 종로구";
		lgHpc.phoneNumber = "010-1234-5556";
		
		lgHpc.ownerInfo();
		System.out.println();
		
		motoHpc.name = "홍길동";
		motoHpc.address = "서울시 구로구";
		motoHpc.phoneNumber = "010-7777-8888";
		
		motoHpc.ownerInfo();
		System.out.println();
		
		// 아래로 전화를 걸거나 받는 메소드 호출
		//객체 samsungHpc를 이용하여 메소드 hangUp에서 사용한 변수를 그대로 가져와서 사용
		samsungHpc.hangUp();
		lgHpc.recieve();
		motoHpc.hangUp();
	}
}
