//두번째

package ch05.ex04;

public class Ex04 {

	public static void main(String[] args) {
		Line line = new Line();
		MethodOverridingEx.paint(line);
		
		MethodOverridingEx.paint(new Shape());
		MethodOverridingEx.paint(new Line());
		MethodOverridingEx.paint(new Rect());
		MethodOverridingEx.paint(new Circle());
	}

}
