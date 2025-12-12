package ch04.ex06;

public class Circle
{
	private int x;
	private int y;
	private int radius;
	
	public Circle()
	{
		x=0;
		y=0;
		radius=1;
	}
	
	public void setX(int x) {
		this.x = x;
		printX();
	}
	
	public int getX()
	{
		return x;
	}
	
	private void printX()
	{
		System.out.println("x값은: "+ x);
	}
	
}

//public class Circle {
//	int radius;//멤버 변수(필드)
//	
//	public Circle(int radius) {//생성자 - 반환값이 없음, void쓰면 안됨
//		this.radius = radius;
//	}
//	public double getArea() {//메소드
//		return 3.14*radius*radius;
//	}
//	public void show() {
//		System.out.println("("+x+", "+y+")"+radius);
//	}
//}
