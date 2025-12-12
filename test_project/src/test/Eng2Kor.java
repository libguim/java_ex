package test;

import java.util.Scanner;

public class Eng2Kor {

	public static void main(String[] args) {
		//1. 배열 생성
		String[] eng = {"student","love","java","happy","future"};
		String[] kor = {"학생","사랑","자바","행복한","미래"};
		
		Scanner sc = new Scanner(System.in);
		
		//2. 영어 단어 입력받음 (검색을 몇번할지 모름)
		while(true) {
			System.out.print("영어 단어를 입력하세요 >>");
			String e = sc.next();

			//종료식
			if(e.equals("exit")) {
				System.out.print("종료합니다!");
				break;
			}
			
			//단어가 없을 경우
			int foundIdx = 0;
			for(int i=0; i<eng.length; i++) {
				if(e.equals(eng[i])) {
					foundIdx = i;
					break;
				}
			}
			
			//3. 단어가 있을 경우 출력하기
			if(eng[foundIdx].equals(e)) {
				System.out.println(kor[foundIdx]);
			}else {
				System.out.println("그런 영어 단어가 없습니다!"); 
			}
			
		}
		
	}

}
