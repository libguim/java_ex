package ch02_problem;

import java.util.Scanner;

public class pr10_rrrrrr {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int r1 = a.nextInt();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		int r2 = a.nextInt();
		
//		원의 두 점과 입력점의 길이 계산
		double length = Math.sqrt( ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)) );
		
		if( length > (r1+r2) ) {
			System.out.print("두 원은 서로 겹치지 않습니다.");
		}else {
			System.out.print("두 원은 서로 겹칩니다.");
		}
		
		a.close();
	}

}
