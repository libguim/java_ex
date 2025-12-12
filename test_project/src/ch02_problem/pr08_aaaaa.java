package ch02_problem;

import java.util.Scanner;

public class pr08_aaaaa {
	
//	반환한 값 : boolean
//  점(x,y)가 (rect_x1, rect_y1),(rect_x2, rect_y2) 사각형 안에 있으면 true를 반환하는 메소드
	public static boolean inRect(int x, int y, int rect_x1, int rect_y1, int rect_x2, int rect_y2) {
		
		if( (x>=rect_x1 && x<=rect_x2)&&(y>=rect_y1 && y<=rect_y2) )
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("두 점 (x1,y1), (x1,y1)의 좌표를 입력하시오 >>");
		int x1 = a.nextInt();
		int y1 = a.nextInt();
		int x2 = a.nextInt();
		int y2 = a.nextInt();
		
//		점1 : (x1,y1)
//		점2 : (x2,y2)
//		점3 : (x1,y2)
//		점4 : (x2,y1)		
//		4점 중 1개라도 걸리면, 겹침
		if(inRect(x1, y1, 100, 100, 200, 200) || 
			inRect(x1, y2, 100, 100, 200, 200) ||
			inRect(x1, y2, 100, 100, 200, 200) ||
			inRect(x2, y1, 100, 100, 200, 200)
		   ) {
			
			System.out.println("사각형이 겹칩니다.");
			
		}else if(inRect(100, 100, x1, y1, x2, y2) || 
				inRect(200, 200, x1, y1, x2, y2) ||
				inRect(100, 200, x1, y1, x2, y2) ||
				inRect(200, 100, x1, y1, x2, y2)
			   ) {
			
			System.out.println("사각형이 겹칩니다.");
			
		}else if( (x1<100 && x2>200)&&(y1>100 && y2<200) ) {
			System.out.println("사각형이 겹칩니다.");
		}else if( (x1>100 && x2<200)&&(y1<100 && y2>200) ) {
			System.out.println("사각형이 겹칩니다.");
		}else if( (x1>100 && x2<200)&&(y1<100 && y2<200) ) {
			System.out.println("사각형이 겹칩니다.");
		}else if( (x1<100 && x2>200)&&(y1<100 && y2>200) ) {
			System.out.println("사각형이 겹칩니다.");
		}else {
			System.out.println("사각형이 겹치지 않습니다.");
		}
		
		a.close();
		
	}

}
