package ch04_problem.Ex07;

import java.util.Scanner;

public class MonthSchedule {

	//멤버변수
	private int allDay;
	private Day dayArr[];
	// Day dayArr[] = new Day[] 
	private Scanner scanner; 
	
	//생성자 - 초기화
	public MonthSchedule(int allDay) {
		this.allDay = allDay;
		this.dayArr = new Day[allDay];
		
		for(int i=0; i<dayArr.length; i++) {
			dayArr[i] = new Day();
		}
		
		scanner = new Scanner(System.in);
	}
	
	//메소드
	private void input() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		
		if(day < 1 || day > 30) //예외처리
			System.out.println("1~30 사이의 날짜를 입력해주세요!!!");
		
		System.out.print("할일(빈칸없이입력)");
		String work = scanner.next();
		
		//입력받은 work를 처리
		dayArr[day-1].set(work);
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();

		if(day < 1 || day > 30) //예외처리
			System.out.println("1~30 사이의 날짜를 입력해주세요!!!");
		
		System.out.print(day+"월의 할일은 ");
		
		dayArr[day-1].show();
//		System.out.println(dayArr[day-1].get()+ "입니다");
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
						
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int pick = scanner.nextInt();
			
			switch(pick) {
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("잘못입력하셨습니다!!!!");				
			} //switch
			
		} //while
	}
	
}
