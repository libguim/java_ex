package ch03_problem;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		while (true) {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = sc1.nextInt();
				int m = sc1.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력해주셔야 해요!");
				sc1.nextLine();
			}
		}

		sc1.close();
	}

}
