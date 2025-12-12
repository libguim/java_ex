package ch05_practice.Pr03_04;

public class Won2Dollar extends Converter {
	
	//생성자
	public Won2Dollar(int ratio) {
		this.ratio = ratio; //부모꺼 사용중
	}
	
	@Override
	protected double convert(double src) {	
		return src / ratio;
	}

	@Override
	protected String srcString() {
		return "원";
	}

	@Override
	protected String destString() {
		return "달러";
	}

}
