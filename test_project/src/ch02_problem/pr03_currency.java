package ch02_problem;
import java.util.Scanner;

public class pr03_currency {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오. >>");
		int money = scanner.nextInt();
		
		int cnt = 0;
		
		cnt = money/50000;
		money = money%50000;
		System.out.println("오만원권 " + cnt + "매");
		
		cnt = money/10000;
		money = money%10000;
		System.out.println("만원권 " + cnt + "매");
		
		cnt = money/5000;
		money = money%5000;
		System.out.println("오천원권 " + cnt + "매");

		cnt = money/1000;
		money = money%1000;
		System.out.println("천원권 " + cnt + "매");
		
		cnt = money/500;
		money = money%500;
		System.out.println("오백원짜리" + cnt + "매");
		
		cnt = money/100;
		money = money%100;
		System.out.println("백원짜리 " + cnt + "매");
		
		cnt = money/10;
		money = money%10;
		System.out.println("십원짜리 " + cnt + "매");
		
		
//		int won_50000 = a / 50000;
//		int won_10000 = (a % 50000) / 10000;
//		int won_1000 = (a % 10000) / 1000;
//		int won_500 = (a % 1000) / 500;
//		int won_100 = (a % 500) / 100;
//		int won_50 = (a % 100) / 50;
//		int won_10 = (a % 50) / 10;
//		int won_1 = (a % 10) / 1;
//		
//		
//		System.out.println("만원권 " + won_10000 + "매");
//		System.out.println("천원권 " + won_1000 + "매");
//		System.out.println("오백원 " + won_500 + "매");
//		System.out.println("백원 " + won_100 + "매");
//		System.out.println("오십원" + won_50 + "매");
//		System.out.println("십원 " + won_10 + "매");
//		System.out.println("일원 " + won_1 + "매");
		
		scanner.close();
	
	}

}
