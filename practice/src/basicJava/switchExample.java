package basicJava;
import java.util.Random;
public class switchExample {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6)+1;
		String message = "";
		
		switch(num) {
		case 1 :
			message = "1������";
			break;
		case 2 :
			message = "2������";
			break;
		case 3 :
			message = "3������";
			break;
		case 4 :
			message = "4������";
			break;
		case 5 :
			message = "5������";
			break;
		case 6 :
			message = "6������";
			break;
		}
		System.out.println(message);
	}
}
