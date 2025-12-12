package ch05_practice.Pr12;

public abstract class Shape {
	
	//자기 순환 참조
	private Shape next;

	//생성자
	public Shape() {
		next = null;
	}
	//현재꺼를 다음꺼에 꽂아줌
	public void setNext(Shape obj) {
		next = obj;
	}

	public Shape getNext() {
		return next;
	}

	public abstract void draw();
}
