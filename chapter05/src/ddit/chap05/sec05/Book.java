package ddit.chap05.sec05;

public class Book {
	private String title;
	private String writer;
	private int price;

	//������ �޼ҵ�
	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	@Override //toString �޼ҵ带 Override
	public String toString() {
		String str = "���� : " + title + "\n";
		str += "���� : " + writer + "\n";
		str += "���� : " + price + "\n";
		
		return str;
	}
}
