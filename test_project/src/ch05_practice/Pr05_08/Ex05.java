package ch05_practice.Pr05_08;

public class Ex05 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		//주소가 가리키는 값을 출력해줘
		String str = cp.toString(); 
		System.out.println(str +"입니다.");
	}

}
