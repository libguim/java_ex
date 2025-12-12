package ch05_practice.Pr05_08;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y) {
		super(x, y); //부모의 생성자를 통해서
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		//super(x, y); 생성자는 다른 생성자에서만 쓸수있고 다른 메소드는 안됨
		// this.x = x;
	    // this.y = y; 둘다 잠금처리 돼있어서 바로 쓸수없음
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	//문자로 반환
	@Override
	public String toString() {
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}

}
