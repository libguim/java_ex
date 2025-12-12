package ch02_problem;

import java.util.Scanner;

public class pr09_bbbbb {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력 >>");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		double r = a.nextDouble();
		
		System.out.print("점 입력 >>");
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		
//		원의 두 점과 입력점의 길이 계산
		double length = Math.sqrt( ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)) );
		
		if( length < r ) 
			
			System.out.println("점("+ x2 +", "+ y2 +")는 원의 내부에 있습니다.");
			
		else if( length > r ) 
			
			System.out.println("원의 내부에 없습니다.");			
		
		else 
			
			System.out.println("원의 선 위에 있습니다.");
		
		
		a.close();
	}

}
