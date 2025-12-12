package ch03_problem;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
		
		int []unit = {50000,10000,1000,500,100,50,10,1}; //단위 배열 저장함

		Scanner a = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요 >>");
		int won = a.nextInt(); //돈의 액수 입력값 받음
		
		int cnt = 0; //수량 초기화
		
		for(int i=0; i<unit.length; i++) {
			cnt = won / unit[i]; //돈의 수량
			
			if(cnt > 0) {
				won = won % unit[i];
				System.out.println(unit[i]+"권 "+cnt+"개 ");
			}
		}
		
		a.close();
	}

}
