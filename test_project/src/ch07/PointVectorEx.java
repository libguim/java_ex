package ch07;

import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class PointVectorEx {

	public static void main(String[] args) {
		
		//Point 타입의 벡터 컬렉션 생성
		Vector<Point> v = new Vector<Point>();
		
		//Point 객체 삽입
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		//인덱스 1 : Point(-5,20) 삭제
		v.remove(1);
		
		//벡터에 있는 요소 모두 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
	}

}
