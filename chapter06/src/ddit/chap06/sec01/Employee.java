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
	//��ȯŸ�� ���� �Ű����� �ִ� setter
	}
	
	@Override
	public String toString() {
		return empId+"\t"+empName+"\t"+salary+"\t"+deptName;
	//��ȯŸ�� �ְ� �Ű����� ���� getter
	}
//	}
}
