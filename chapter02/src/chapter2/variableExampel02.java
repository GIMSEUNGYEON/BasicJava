package chapter2;

public class variableExampel02 {
	
 public static void main(String[] args) {
	 int sum= 0;
	for(int i = 1; i<= 100; i++) {
		sum= sum + i;
		System.out.println(sum);
	}
	
		myMethod();
	}

// 첫날에 100원, 둘째날부터 전날의 두배씩 저축한다면 최초로 100만원을 넘는 날은 며칠이 경과된 날이며 그때까지의 금액은 얼마나 되는가?
public static void myMethod() {
	int money = 100;
	int sum = 0;
	int days = 0;
	
	while(true) {
		
		
		if (sum>= 1000000) {
			break;
		}
		sum = sum+money;
		money = money*2;
		days++;
	}
		//System.out.println("경과 일수 : " + days);
		System.out.println("저축 금액 : " + sum);
	

	
}
}