package ch05_practice.Pr13_14;

public class Ex14 {

	public static void main(String[] args) {
		//인터페이스 Shape으로 3개의 객체 배열 생성
		Shape list[] = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		//객체 배열의 요소
		for(int i=0; i<list.length; i++) {
			list[i].redraw();
		}
		
		//
		for(int i=0; i<list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}

}
