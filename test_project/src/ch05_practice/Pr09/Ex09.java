package ch05_practice.Pr09;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//저장 공간 크기 입력받음
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int capacity = scanner.nextInt();
		
		//입력받은 크기의 객체 생성
		StringStack stack = new StringStack(capacity);

		//데이터 입력 루프
		while(true) {
			
			//문자열 입력받음
			System.out.print("문자열 입력 >>");
			String fruit = scanner.next();
					
			//성공실패여부
			boolean ok = stack.push(fruit);
			
			//푸시불가
			if(!ok) {
				System.out.println("스택이 꽉 차서 푸시 불가!!!!");
			}
			
			//종료조건
			if(fruit.equals("그만")) {
				break;
			}

		}
						
		//데이터 출력 루프
		System.out.print("스택에 저장된 모든 과일 출력: ");
		
//		for(int i=0; i<stack.length(); i++) 이거는 안됨
		
		int cnt = stack.length();
		for(int i=0; i<cnt; i++) {
			System.out.print(stack.pop()+ " ");
		}
		
		scanner.close();
	}
}


