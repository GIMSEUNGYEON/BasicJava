package ddit.chap06.sec02;

public class Student {
	final String major = "소프트웨어학과";
	static long stdID = 2023000L;
	
	Student(){
		stdID++;
	}
	public long getStdId() {
		return stdID;
	}
}
