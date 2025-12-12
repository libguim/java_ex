package ch05_practice.Pr05_08.ex06;

public class Point {
	
	//멤버변수
	private int x, y;

	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//getter
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	//메소드
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
