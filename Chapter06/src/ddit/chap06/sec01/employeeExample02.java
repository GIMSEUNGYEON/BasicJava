package ddit.chap06.sec01;

public class employeeExample02 {
	public static void main(String[] args) {
		System.out.print("�����ȣ\t\t�����\t�޿�\t�μ���\n");
		System.out.println("--------------------------------------");
		Employee e1 = new Employee(202305001L, "ȫ�浿");
		e1.setDeptName("IT���ߺ�");
		e1.setSalary(2000000);
		System.out.println(e1.toString());

	}
}
