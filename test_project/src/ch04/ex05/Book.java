package ch04.ex05;

public class Book {
	String title;
	String author;

	void show() { 
		System.out.println(title + " " + author); 
	}

	public Book() {
		this("", ""); //객체 자신
		System.out.println("생성자 호출됨");
	}

	public Book(String title) {
		this(title, "작자미상");
	}

	public Book(String title, String author) {
		this.title = title; 
		this.author = author;
	}
	
}
