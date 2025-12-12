package ch05_practice.Pr11;

//추상 클래스
public abstract class Calc {
	// 멤버변수
	protected int a;
	protected int b;

	// 추상메소드
	public abstract int calculate();

	// 메소드
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
