package ddit.chap06.sec01;

public class Employee {
	private long empId;
	private String empName;
	private String deptName;
	private int salary;

	Employee(long empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	//반환타입 없고 매개변수 있는 setter
	}
	
	@Override
	public String toString() {
		return empId+"\t"+empName+"\t"+salary+"\t"+deptName;
	//반환타입 있고 매개변수 없는 getter
	}
//	}
}
