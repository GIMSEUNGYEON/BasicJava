package ddit.chap06.sec06;

public enum DeviceType {
	MOVABLE("�ȵ���̵�"), WEB("������"), SERVER("������");

	private final String name;

	private DeviceType(String name) {
		this.name = name;
	} // ����

	public String getName() {
		return name;
	}// ����
}
