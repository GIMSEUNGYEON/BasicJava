package homework2;

public class School {
	String SchoolName;
	int SchoolClass;

	School(String SchoolName, int SchoolClass) {
		this.SchoolName = SchoolName;
		this.SchoolClass = SchoolClass;
	}

	School() {
	}

	public String getSchoolName() {
		return SchoolName;
	}
	public int getSchoolClass() {
		return SchoolClass;
	}
}

class Teacher extends School {
	String teacherName;

	Teacher(String SchoolName, int SchoolClass, String teacherName) {
		super(SchoolName, SchoolClass);
		this.teacherName = teacherName;
	}
	Teacher(){}
	
	public String getTeacherName() {
		return teacherName;
	}
}

class Student extends Teacher {
	String studentName;

	Student(String SchoolName, int SchoolClass, String teacherName, String studentName) {
		super(SchoolName, SchoolClass, teacherName);
		this.studentName = studentName;

	}
	public String getStudentName() {
		return studentName;
	}
}
