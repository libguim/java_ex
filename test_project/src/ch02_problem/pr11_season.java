package ch02_problem;

import java.util.Scanner;

public class pr11_season {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("달을 입력하세요 >>");
		int s = a.nextInt();
		if(s < 1 || s > 12){
			System.out.println("1~12 사이의 수를 입력해주세요.");
			return;
		}
		
		String season = "";

//		1) if - else 문
//		if(s>=3 && s<=5) {
//			season = "봄봄봄!";
//		}else if(s>=6 && s<=8) {
//			season = "여름여름!";
//		}else if(s>=9 && s<=11) {
//			season = "가을가을!";
//		}else {
//			season = "겨울이다!";
//		}
	
//		2) switch 문
		switch(s) {
			case 3: case 4: case 5:
				season = "봄봄봄!";
			break;
			case 6: case 7: case 8:
				season = "여름여름!";
				break;
			case 9: case 10: case 11:
				season = "가을가을!";
				break;
			case 12: case 1: case 2:
				season = "겨울이다!";
				break;
		}
		
		System.out.println("지금 계절은 "+season+"입니다.");
	
		
		a.close();
	}

}
