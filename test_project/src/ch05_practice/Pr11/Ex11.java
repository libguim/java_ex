package ch05_practice.Pr11;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char op = sc.next().charAt(0); // 입력받은 연산자 첫번째 문자

		Calc calc1 = null; //지역변수는 반드시 초기화해줘야 함

		//같은 리모컨으로 다른 배터리를 꽂아쓰는 느낌
		switch (op) {
		case '+':
			calc1 = new Add();
			break;
		case '-':
			calc1 = new Sub();
			break;
		case '*':
			calc1 = new Mul();
			break;
		case '/':
			calc1 = new Div();
			break;
		}
		calc1.setValue(a, b);

		if (calc1 instanceof Div && b == 0)
			System.out.println("0으로 나눌 수 없습니다!!!");
		else
			System.out.print(calc1.calculate());
	}

}
