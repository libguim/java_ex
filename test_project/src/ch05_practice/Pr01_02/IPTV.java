package ch05_practice.Pr01_02;

public class IPTV extends ColorTV {

	private String ip;
//	private int size;
//	private int color;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	// @override
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + "주소의 " + getSize() + "인치 " + color + "컬러");
	}

}
