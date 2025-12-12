package ch02_ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점(x,y)의 좌표를 입력하세요. >>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x>50 && x<100)&&(y>50 && y<100))
			System.out.println("점(x,y)는 (50,50)과 (100,100)의 사각형 내에 있습니다.");
		else if((x<50 && x>100)&&(y<50 && y>100))
			System.out.println("점(x,y)는 (50,50)과 (100,100)의 사각형 내에 없습니다!!!!");
		else
			System.out.println("점(x,y)는 (50,50)과 (100,100)의 사각형 선 위에 있습니다.");
		
		scanner.close();
	}

}
