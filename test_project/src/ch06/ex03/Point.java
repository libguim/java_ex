package ch06.ex03;

public class Point {
	//멤버변수
	int x, y;

	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드
	public boolean equals(Object obj) {
		Point p = (Point) obj; //다운캐스팅
		if (x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
