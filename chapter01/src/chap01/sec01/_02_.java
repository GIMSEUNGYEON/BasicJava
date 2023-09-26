package chap01.sec01;

public class _02_ {
		public static void main(String[] args) {
			int value;
			value = 10;
			
			int result = value +10;
			
			System.out.println(result);
			
			System.out.println();
			
			int hour = 3;
			int minute = 5;
			System.out.println(hour + "½Ã°£ " + minute + "ºÐ");
			
			System.out.println();
			
			int x = 3;
			int y = 5;
			
			System.out.println("x:" + x + " y:" + y);
			int temp = x;
			x= y;
			y= temp;
			System.out.println("x:" + x + " y:" + y);
			
			System.out.println();
			
			int v1 = 15;
			if (v1>10) {
				int v2;
				v2= v1 - 10;
				System.out.println(v2);
			}
			
			System.out.println();
			
			char var1 = 'a';
			int var2 = 'a';
			
			System.out.println(var1);
			System.out.println(var2);
			
			System.out.println();
			
			int i = 65;
			System.out.println((char)i);
		
			System.out.println();
			
			String str1 = new String("java");
					String str2 = new String("java");
					if(str1==str2){
					System.out.println("equal");
					}else{
					System.out.println("not equal");
		}
		}
}
