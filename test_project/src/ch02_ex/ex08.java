package ch02_ex;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("커피를 주문하세요(음료명 잔수) >>");
		String name = a.next();
		int num = a.nextInt();
		int price1 = 2000;
		int price2 = 2500;
		int price3 = 3000;
		int price4 = 3500;
		
		int price = 0 ;
		
//		switch(name) {
//			case "에스프레소":
//				price = num * price1;
//				break;
//			case "아메리카노":
//				price = num * price2;
//				break;
//			case "카푸치노":
//				price = num * price3;
//				break;
//			case "카페라떼":
//				price = num * price4;
//				break;
//			default:
//				System.out.println("해당사항없음");
//				a.close();
//				return;
//		}
		
		if(name.equals("에스프레소")) {
			price = num * price1;
		}else if(name.equals("아메리카노")){
			price = num * price2;
		}else if(name.equals("카푸치노")){
			price = num * price3;
		}else if(name.equals("카페라떼")){
			price = num * price4;
		}else {
			System.out.println("해당사항없음");
			a.close();
			return;
		}
			
		
		System.out.println("커피의 가격은 "+price+"원입니다.");
		a.close();
	}

}
