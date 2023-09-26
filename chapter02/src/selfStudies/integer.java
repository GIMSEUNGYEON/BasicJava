package selfStudies;

public class integer {
  public static void main(String[] args) {
	  float var = 3.14f;
		double var1 = 3.14;
		System.out.println(var);
		int a ='A';
		System.out.println(a);
		
		byte res = 127;
		System.out.println(++res); // 128이 되어야하는데 표기하지 못하므로 -128로 표기함
		//수식에 의해 적용범위가 초과된 경우엔 순환적용 된다 
		
		short sh1 = 200;
		//short sh2 = sh1 + 10; //오류 발생 코드
		short sh2 = 10;
		short sh3 = (short)(sh1 + sh2);
		System.out.println((short)(sh1+sh2));
intInteger();
longInteger();
  }
  public static void intInteger() {
	  // int : 4byte 공간
	  int num = 200;
	  int res = 1000000*1000000;
	  System.out.println("res : " + res); //순환 결과 출력
	  
}
  public static void longInteger() {
	  //long : 8byte
	  long num = 100L;
	  long res1 = 1000000 * 1000000;
	  long res2 = 1000000l * 1000000l;
	  
	  System.out.println(res1);
	  System.out.println(res2);
  }
}