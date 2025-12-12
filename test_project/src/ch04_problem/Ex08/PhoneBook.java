package ch04_problem.Ex08;

import java.util.Scanner;

public class PhoneBook {
	
	private Phone phoneArr[];
	private Scanner scanner;
	
	public PhoneBook() {
		scanner = new Scanner(System.in);
	}

	//입력받기
	public void input() {
//		scanner = new Scanner(System.in);
		System.out.print("인원수 >>");
		int num = scanner.nextInt();
		
		this.phoneArr = new Phone[num];
		
		for(int i=0; i<phoneArr.length; i++) {
			
			System.out.print("이름과 번호(번호는 빈칸없이 입력) >>");
			String name = scanner.next();
			String tel = scanner.next();
			
			//전화번호 예외처리
			
			phoneArr[i] = new Phone(name, tel);
//			phoneArr[i].set(name, tel);
			
		}
		System.out.println("저장되었습니다!!!");
		
	}
	
	//검색하기
	public void search() {
		
		while(true) {
//			scanner = new Scanner(System.in);
			System.out.print("검색할 이름 >>");
			String name = scanner.next();

			if(name.equals("그만")) {
				System.out.println("종료합니다!");
				break;
			}
			
			//입력받은 이름이 전화번호 배열을 돌면서 안에 있는지 검사
			int cnt=0;
			for(int i=0; i<phoneArr.length; i++) {
			
				cnt = i;
				if(phoneArr[i].getName().equals(name)) {
					//찾으면
					System.out.println(name+"의 번호는 "+phoneArr[i].getTel()+"입니다.");
					break;
				}
			}
			
			if(cnt == phoneArr.length - 1)
			System.out.println(name+"이 없습니다.");
			
		}//while
		
	}
	
	//실행하기
	public void run() {
		
		input();
		search();
		scanner.close();
	}
	
}
