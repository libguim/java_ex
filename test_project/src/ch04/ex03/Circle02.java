package ch04.ex03;

public class Circle02 {
	
	int radius;
	String name;
	
	public Circle02() { //기본 생성자(메소드) : 다른 생성자가 있으면 만들어줘야 함
		radius = 1; 
		name = "";
	}
	
	public Circle02(int r, String n) { //생성자(메소드) : 핵심적 역할은 멤버변수를 초기화하는 것!
		radius = r; 
		name = n;
	}
	
	public double getArea() { //(멤버) 메소드
		return 3.14*radius*radius;
	}
	
}
