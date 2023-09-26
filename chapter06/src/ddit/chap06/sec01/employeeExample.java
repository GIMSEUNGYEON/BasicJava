package ddit.chap06.sec01;

public class employeeExample {
	static Employee[] employees;

	public static void main(String[] args) {
		employees = new Employee[] { new Employee(20230512001L, "홍길동"), 
									 new Employee(20190512015L, "강감찬"),
									 new Employee(20101205005L, "정몽주"), 
									 new Employee(20190503005L, "이성계"),
									 new Employee(20200512005L, "김유신") };

	}
}
