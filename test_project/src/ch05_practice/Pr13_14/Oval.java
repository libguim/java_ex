package ch05_practice.Pr13_14;

public class Oval implements Shape {

	private int w;
	private int h;

	public Oval(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public void draw() {
			System.out.println(w+"x"+h+"에 내접하는 타원입니다.");

	}

	@Override
	public double getArea() {
		return (w * h * PI) / 2;
	}

}
