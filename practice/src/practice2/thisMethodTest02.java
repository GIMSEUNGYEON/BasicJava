package practice2;

public class thisMethodTest02 {
	public static void main(String[] args) {
		PersonInfo p1 = new PersonInfo("½Å¹Î¾Æ");
		PersonInfo p2 = new PersonInfo("±è¹ÎÁ¤", "010-1111-1234");
		PersonInfo p3 = new PersonInfo("Á¶¼­¾Æ", "Á¾·Î±¸ ÇÊ¿îµ¿", "010-3333-3333");
		p1.personInfoDisplay();
		p2.personInfoDisplay();
		p3.personInfoDisplay();
	}
}
