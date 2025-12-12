package ch05_practice.Pr05_08;

public class Point3D extends Point {

	private int z;
	
	public Point3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y; //private이라 바로 쓸수없음
		super(x, y); //생성자 안에서는 super를 사용
		this.z = z;
	}

	public void moveUp() {
		z = z + 1;
		//z++;
	}

	public void moveDown() {
		z = z - 1;
		//z--;
	}

	public void move(int x, int y, int z) {
		move(x, y); //부모꺼
		this.z = z;
	}

	//문자로 반환
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}

}
