package ch05_practice.Pr13_14;

public class Rect implements Shape {

	private int w;
	private int h;

	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
			System.out.println(w+"x"+h+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		
		return w * h;
	}

}
