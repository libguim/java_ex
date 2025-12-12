package ch05_practice.Pr03_04;

public class Km2Mile extends Converter {
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String srcString() {
		return "Km";
	}

	@Override
	protected String destString() {
		return "mile";
	}

}
