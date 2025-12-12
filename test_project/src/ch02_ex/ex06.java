package ch02_ex;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요 >>");
		int won = a.nextInt();
		
		int cnt = 0;
		
		cnt = won / 50000;
		won = won % 50000;
		System.out.print("오만원권 "+cnt+"개, ");
		
		cnt = won / 10000;
		won = won % 10000;
		System.out.print("만원권 "+cnt+"개, ");
		
		cnt = won / 1000;
		won = won % 1000;
		System.out.print("천원권 "+cnt+"개, ");
		
		cnt = won / 500;
		won = won % 500;
		System.out.print("500원짜리 "+cnt+"개, ");
		
		cnt = won / 100;
		won = won % 100;
		System.out.print("100원짜리 "+cnt+"개, ");
		
		cnt = won / 10;
		won = won % 10;
		System.out.print("10원짜리 "+cnt+"개, ");
		
		cnt = won / 1;
		won = won % 1;
		System.out.print("1원짜리 "+cnt+"개 ");
		
		
		a.close();
	}

}
