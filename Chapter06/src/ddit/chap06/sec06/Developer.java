package ddit.chap06.sec06;

public class Developer {
	String name;
	int career;
	public DeviceType type;
	static Developer d = new Developer();

	public static void main(String[] args) {
		getInfo();
		getDeviceType();
	}

	public static void getInfo() {
		d.name = "정몽주";
		d.career = 5;
		d.type = DeviceType.SERVER;

		System.out.println("개발자명 : " + d.name);
		System.out.println("개발경력 : " + d.career);
		System.out.println("직무파트 : " + d.type);
	}

	public static void getDeviceType() {
		for (DeviceType dev : DeviceType.values()) {
			System.out.println(dev.getName());
			//안드로이드 스프링 리눅스 반환
		}
		DeviceType dp = d.type.WEB;
		System.out.println(dp.ordinal());  //특정 상수값이 저장되어진 순서
		//열거로 봤을 때 0,1,2번째에서 1번째인 스프링의 순번 출력
		
	}
}
