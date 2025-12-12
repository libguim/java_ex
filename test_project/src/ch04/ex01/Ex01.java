package ch04.ex01;

public class Ex01 {

	public static void main(String[] args) {
		Circle pizza; //객체 변수
		pizza = new Circle(); //객체 생성
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); //객체 생성
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
