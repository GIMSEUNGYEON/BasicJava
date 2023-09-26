package ddit.chap05.sec05;

public class Book {
	private String title;
	private String writer;
	private int price;

	//생성자 메소드
	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	@Override //toString 메소드를 Override
	public String toString() {
		String str = "제목 : " + title + "\n";
		str += "저자 : " + writer + "\n";
		str += "가격 : " + price + "\n";
		
		return str;
	}
}
