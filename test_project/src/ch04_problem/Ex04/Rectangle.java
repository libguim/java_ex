package ch04_problem.Ex04;

public class Rectangle {
	
	//멤버변수
	private int x;
	private int y;
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//출력 메소드
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public int square() {
		return width * height;
	}

	public boolean contains(Rectangle r) {
		if((x < r.x && x+width > r.x+r.width) &&
			(y < r.y && y+height > r.y+r.height))
			return true;
		else
			return false;
	}
	
}
