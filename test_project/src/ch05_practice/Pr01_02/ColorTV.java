package ch05_practice.Pr01_02;

public class ColorTV extends TV {

//	private int size;
	protected int color;

	public ColorTV(int size, int color) {
		super(size);
//		this.size = size;
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}

}
