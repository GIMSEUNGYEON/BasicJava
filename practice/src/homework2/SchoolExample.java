package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolExample {
	public static void main(String[] args) {
		Student[] stu = { new Student("����б�", 8, "�̼���", "��¿�"), 
						  new Student("����б�", 8, "�̼���", "������"),
						  new Student("����б�", 8, "�̼���", "�ڿ���"), 
						  new Student("����б�", 8, "�̼���", "������"),
						  new Student("����б�", 8, "�̼���", "�����"), 
						  new Student("����б�", 8, "�̼���", "������"), 
						  new Student("����б�", 7, "�����", "���ä"), 
						  new Student("����б�", 7, "�����", "������"), 
						  new Student("����б�", 7, "�����", "����ȣ") };
		String scname = "";
		int sclass = 0;
		String tname = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("��ȸ�� �л� �̸��� �Է��ϼ��� : ");
		String sname = sc.next();
		String[] stuName = new String[stu.length];
		int k = 0;
		for (int i = 0; i < stu.length; i++) {
			if (sname.equals(stu[i].studentName)) {
				scname = stu[i].getSchoolName();
				sclass = stu[i].getSchoolClass();
				tname = stu[i].getTeacherName();
				System.out.printf("��ȸ���\n�б� : %s \n�б� : %s\n���Ӽ����� : %s\n", 
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
