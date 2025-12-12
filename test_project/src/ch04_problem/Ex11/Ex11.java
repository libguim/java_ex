package ch04_problem.Ex11;

import java.util.Scanner;

class Add {
	private int a;
	private int b;
	
	//받아온 값을 할당하기
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		return a+b;
	}
}

class Sub {
	private int a;
	private int b;
	
	//받아온 값을 할당하기
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		return a-b;
	}
}

class Mul {
	private int a;
	private int b;
	
	//받아온 값을 할당하기
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		return a*b;
	}
}

class Div {
	private int a;
	private int b;
	
	//받아온 값을 할당하기
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		
		try {
			
			int c = a / b;
			
		}catch(Exception e) {
			
			System.out.println( "0으로 나눌수없어요!");
		
		}
		
		return a/b;
	}
}

public class Ex11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오 >>");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String op = scanner.next();

		switch (op) {
			case "+":
				Add add1 = new Add();
				add1.setValue(n, m);
				System.out.println(add1.calculate());
				break;
			case "-":
				Sub sub1 = new Sub();
				sub1.setValue(n, m);
				System.out.println(sub1.calculate());
				break;
			case "*":
				Mul mul1 = new Mul();
				mul1.setValue(n, m);
				System.out.println(mul1.calculate());
				break;
			case "/":
				Div div1 = new Div();
				div1.setValue(n, m);
				System.out.println(div1.calculate());
				break;
			default:
				System.out.println("부호를 잘못 입력하셨어요!");
		}
		
	}

}
