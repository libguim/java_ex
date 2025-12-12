package ch05_practice.Pr13_14;

interface Shape {
	
	//상수
	final double PI = 3.14;
	
	//추상 메소드
	void draw();
	double getArea();
	
	//디폴트
	default public void redraw() {
		System.out.print("--------다시 그립니다. ");
		draw(); //자식이 구현한 draw()를 씀
	}

}
