package ch05_practice.Pr05_08;

public class PositivePoint extends Point {

	public PositivePoint() {
		super(0, 0);
	}

	public PositivePoint(int x, int y) {
		super(x, y); //부모의 생성자
		if(x < 0 || y < 0) {
//			super.move(0, 0);
			 move(x,y);
		}
	}
	
	public void move(int x, int y) {
		if(x > 0 && y > 0) {
			super.move(x, y);
		}
	}

	//문자로 반환
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
	
}
