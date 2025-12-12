package ch05.ex01;

public class ColorPoint extends Point{
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // 상속 : Point에서 showPoint() 호출
	}
}
