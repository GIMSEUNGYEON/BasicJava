package ddit.chap06.sec01;

public class employeeExample02 {
	public static void main(String[] args) {
		System.out.print("사원번호\t\t사원명\t급여\t부서명\n");
		System.out.println("--------------------------------------");
		Employee e1 = new Employee(202305001L, "홍길동");
		e1.setDeptName("IT개발부");
		e1.setSalary(2000000);
		System.out.println(e1.toString());

	}
}
