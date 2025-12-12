package ch02_problem;

import java.util.Scanner;

public class pr07_radius {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오 >>");
		int x = a.nextInt();
		int y = a.nextInt();
		
//		if((x + y)>=200 && (x + y)<=400) {
//			System.out.println("(" + x +"," + y +")는 사각형 안에 있습니다.");
//		}else {
//			System.out.println("(" + x +"," + y +")는 사각형 안에 없습니다!!!");
//		}
		
		if((x>100 && x<200) && (y>100 && y<200)) {
			System.out.println("(" + x +"," + y +")는 사각형 안에 있습니다.");
		}else {
			System.out.println("(" + x +"," + y +")는 사각형 안에 없습니다!!!");
		}
		
		a.close();
	}

}
