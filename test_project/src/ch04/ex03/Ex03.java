package ch04.ex03;

public class Ex03 {

	public static void main(String[] args) {
		Circle02 pizza = new Circle02(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle02 donut = new Circle02();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 "+area);
	}

}
