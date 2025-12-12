package ch07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//String타입의 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//4개의 입력값을 받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String s = scanner.next();
			a.add(s);		
		}
		
		//ArrayList에 있는 모든 요소 출력
		for(int i=0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		//가장 긴 이름 출력
		int longestIndex = 0;
		for(int i=0; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			} 
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
	}

}
