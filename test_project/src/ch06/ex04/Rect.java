package ch06.ex04;

public class Rect {
	int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Object obj) {
		Rect p = (Rect) obj; // obj를 Point 타입으로 다운 캐스팅
		if (width * height == p.width * p.height)
			return true;
		else
			return false;
	}
}
