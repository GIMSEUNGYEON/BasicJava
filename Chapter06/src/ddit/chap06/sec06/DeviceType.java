package ddit.chap06.sec06;

public enum DeviceType {
	MOVABLE("안드로이드"), WEB("스프링"), SERVER("리눅스");

	private final String name;

	private DeviceType(String name) {
		this.name = name;
	} // 세터

	public String getName() {
		return name;
	}// 게터
}
