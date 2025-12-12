package test;

import java.util.Scanner;

public class GBBWithComputer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다!");
		String game[] = {"가위","바위","보"};
		
		//1. 입력받기 (게임을 몇번 진행할지 모름)
		while(true) {
			System.out.print("가위 바위 보! >>");
			String me = sc.next();
			
			//종료식
			if(me.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
						
			//2. 결과 출력하기
			int n = (int)(Math.random()*3); // 0,1,2 세가지 정수 중 하나를 무작위로 선택
			String com = game[n];
			String result[] = {"이겼습니다.", "비겼습니다. 다시하세요!"};
			
			String win = null;
			String com1 = "컴퓨터";
			String me1 = "사용자";
			if(me.equals(com)) { //같을 경우 비김
				System.out.println(result[1]);
				continue;
			}else { //다를 경우 
				if(me.equals("가위")) {
					if(com.equals("바위")) {
						win = com1;
					}else if(com.equals("보")){
						win = me1;
					}
				}else if(me.equals("바위")) {
					if(com.equals("가위")) {
						win = me1;
					}else if(com.equals("보")){
						win = com1;
					}
					
				}else if(me.equals("보")) {
					if(com.equals("가위")) {
						win = com1;
					}else if(com.equals("바위")){
						win = me1;
					}
				}else {
					System.out.println("잘못 입력하셨습니다!");
					continue;
				}
				
			}
			
			System.out.println(me1+" =  "+me+", "+com1+" = "+com+", "+win+"가 "+result[0]);			
		}
		
		sc.close();
	}

}
