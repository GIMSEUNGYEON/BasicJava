package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolExample {
	public static void main(String[] args) {
		Student[] stu = { new Student("대덕학교", 8, "이성엽", "김승연"), 
						  new Student("대덕학교", 8, "이성엽", "김차은"),
						  new Student("대덕학교", 8, "이성엽", "박우재"), 
						  new Student("대덕학교", 8, "이성엽", "송은비"),
						  new Student("대덕학교", 8, "이성엽", "남희수"), 
						  new Student("대덕학교", 8, "이성엽", "김태은"), 
						  new Student("대덕학교", 7, "하재관", "김민채"), 
						  new Student("대덕학교", 7, "하재관", "정소현"), 
						  new Student("대덕학교", 7, "하재관", "김지호") };
		String scname = "";
		int sclass = 0;
		String tname = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 학생 이름을 입력하세요 : ");
		String sname = sc.next();
		String[] stuName = new String[stu.length];
		int k = 0;
		for (int i = 0; i < stu.length; i++) {
			if (sname.equals(stu[i].studentName)) {
				scname = stu[i].getSchoolName();
				sclass = stu[i].getSchoolClass();
				tname = stu[i].getTeacherName();
				System.out.printf("조회결과\n학교 : %s \n학급 : %s\n담임선생님 : %s\n", 
								   scname, sclass, tname);
				for (int j = 0; j < stu.length; j++) {
					if(stu[j].teacherName.equals(stu[i].getTeacherName())){
						stuName[k] = stu[j].studentName;
						k++;
					}
				}
				System.out.println(Arrays.asList(stuName));
			}
		}
	}
}
