package ch04.ex04;

public class Book {
	String title;
	String author;
	
	public Book(String t) { //생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String title, String _author) { //생성자
		this.title = title; //이름이 같으므로 같은 ?? 내에서 this.매개변수로 표현해줌
		author = _author;
	}
}
