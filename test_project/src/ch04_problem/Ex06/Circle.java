package ch04_problem.Ex06;

class Circle {

	private double x;
	private double y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("가장 면적인 큰 원은 ("+x+", "+y+")"+radius);
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * 3.14;
	}
}
