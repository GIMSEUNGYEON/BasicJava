package basicJava;
import java.util.Random;
public class switchExample {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		String message = "";
		
		switch(num) {
		case 1 :
			message = "1¹ø´«±Ý";
			break;
		case 2 :
			message = "2¹ø´«±Ý";
			break;
		case 3 :
			message = "3¹ø´«±Ý";
			break;
		case 4 :
			message = "4¹ø´«±Ý";
			break;
		case 5 :
			message = "5¹ø´«±Ý";
			break;
		case 6 :
			message = "6¹ø´«±Ý";
			break;
		}
		System.out.println(message);
	}
}
