package ddit.chap07.sec01;

public class ShapeExample {
	public static void main(String[] args) {
		Circle cc = new Circle("��", 3.3);
		// �Ǵ� ��ȣ �ڸ��� ����� ��(���� �׳� null�̶� 0.0���� �ʱ�ȭ�Ǳ� ����
		// cc.kind = "��"; cc.radius = 3.3; ���� �־ ��
		Triangle tr = new Triangle("�ﰢ��", 5, 8);
		Rectangle re = new Rectangle("�簢��", 4, 2);
		cc.getArea();
		tr.getArea();
		re.getArea();
		// ���� Rectangle Ŭ�������� getArea�� ���������� �ʾҴٸ�
		// re.getArea�� ���� ȣ��Ǵ°� �θ�Ŭ������ getArea

		// �ٵ� �������ϰ� ���� �θ��� getArea�� �θ����� ��� �ؾ�����?
		// �ڽ� Ŭ������ �޼ҵ忡�� �θ� �޼ҵ带 �θ� ���� ��� Ŭ�������� �ڽ� �޼ҵ带 �θ���
		// ���� �Ҹ���
		// �� ��� �ۿ� ����
		// �ƴ� �ٵ� �θ� Ŭ������ ��ü�� ����� ������ �Ҹ�����
		Shape s = new Shape("�簢��");
		s.getArea();
		// �׷� �̷��� �ٸ� ���� ������� �� ��ü�� ������ ����� ���ۿ�
	}
}
