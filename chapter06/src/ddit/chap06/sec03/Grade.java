package ddit.chap06.sec03;

public class Grade {
	int kor;
	int eng;
	int mth;
	int sum;
	double avg;

	Grade() { // 매개변수가 없는 기본생성자
		this(90, 80, 70); // 생성자 호출
//		kor = 90;
//		eng = 80;
//		mth = 70;
	}

	Grade(int kor) {
		this(kor, 80, 70);
//		this.kor = kor;
//		eng = 80;
//		mth = 70;
	}

	Grade(int kor, int eng) {
		this(kor, eng, 70);
	}

	Grade(int kor, int eng, int mth) {
		this.kor = kor;
		this.eng = eng;
		this.mth = mth;

	}

	public int sum() {
		sum = kor + eng + mth;
		return (sum);
	}

	public double avg() {
		avg = (double) sum / 3;
		return avg;
	}
}
