package ch05_practice.Pr03_04;

import java.util.Scanner;

//추상 클래스
abstract class Converter {
	
	//추상 메소드
	protected abstract double convert(double src);
	protected abstract String srcString();
	protected abstract String destString();
	
	protected double ratio;
	
	//일반 메소드 : 자식이 구현한 것을 가져옴
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+ "을 "+ destString() + "로 바꿉니다.");
		System.out.print(srcString()+ "을 입력하세요 >>");
		
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+ res + destString() + " 입니다.");
		scanner.close();
	}
}
