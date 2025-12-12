package ch05_practice.Pr13_14;

public class Ex13 {

	public static void main(String[] args) {
		
		//다형성 - 오버라이딩(동적 바인딩)
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}

}
