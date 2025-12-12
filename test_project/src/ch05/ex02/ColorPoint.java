package ch05.ex02;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // 상속 : Point에서 showPoint() 호출
	}
}
