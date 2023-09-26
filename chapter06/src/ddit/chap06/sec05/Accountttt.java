package ddit.chap06.sec05;

public class Accountttt {
	private String owner;
	private long balance;
	
	// Singlenton
	//1) private ��ü���� ����(Ÿ���� ���� Ŭ���� Ÿ�Դ��, �������� instance, static)
	private static Accountttt instance = null;
	
	//2) ������ �޼ҵ带 ���� (private ���� �����ڸ� ���� �޼ҵ��)
	
	private Accountttt() {
		owner = "ȫ�浿";
	}
	
	//3) getInstance �޼���(���� ������ public�� ����, ��ȯŸ���� �ڱ� Ŭ����, static)
	public static Accountttt getInstance() {
		if(instance==null) instance = new Accountttt();
		return instance;
		// �ν��Ͻ��� ���� ��� ���ο� ��ü�� ������ �� ������,
		// ���� �ƴ� ��� �̹� ������� �ν��Ͻ��� ��ȯ�Ͽ� �ϳ��� ���� �� �ִ� ����
		// �����ϰ� ������ �޼ҵ带 �����̺����� ����� �ν��Ͻ��� �� ���θ� ���ؼ��� 
		// ��ü�� ������ �� �ְ� ������ش�.
		// �ν��Ͻ��� static Ÿ������ ��ü���� ��� ���� ���� ������ �Ͽ�
		// �����Ǳ� ������ null ������ ��ü�� ����
		// �����ǰ� ������ (else) �̹� ������ ��ü�� ��ȯ���� 
	}
}