package chapter03;

public class binaryOperator02 {
		public static void main(String[] args) {
			 //bitwiserOperator();
			 //shiftOperator();
			 assignmentOperator();
		}
		public static void bitwiserOperator() {
			//|, &, ^(exclusive-or)
			//비트 연산자 연산결과가 숫자값으로 반환되는 연산자
			int num1 = 34;
			int num2 = 19;
			System.out.println("&(비트별 and) = " + (num1 & num2));
			System.out.println("|(비트별 or) = " + (num1 | num2));
			System.out.println("^(비트별 ex-or) = " + (num1 ^ num2));
		}
		
		public static void shiftOperator() {
			// >>(right shift),<<(left shift), >>>(logical right shift)
			int num1 = 17;
			int num2 = -17;
			System.out.println("num1>>2 = " + (num1>>2));
			System.out.println("num1<<2 = " + (num1<<2));
			System.out.println("num2>>>2 = " + (num2>>>2));
			
		}
		public static void assignmentOperator() {
			//=원래 이거 하난데
			//결합 할당 연산자라고 +=, -=, *=, /=, %=를 결합연산자라고한다
			//연산식의 형태가 변수1 = 변수1 + 숫자 일 때 이 수식을 변수1 +=숫자로 요약해주는 역할을 한다
			//위 식에서 변수 1은 연산에 참여하는 동시에 결과를 기억하는 기억공간 역할을 동시에 수행한다
			int sum = 0;
			for(int i = 0; i<1000; i++) { 
				sum += i;
				
			}
		}
}
