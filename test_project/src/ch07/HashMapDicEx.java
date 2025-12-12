package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapDicEx {

	public static void main(String[] args) {
		
		//HashMap 컬렉션 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		//key, value값을 dic에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//key로 value값 구하기
		Set<String> keys = dic.keySet(); //키값만 배열로 받아옴
		Iterator<String> it = keys.iterator(); //키값을 순차적으로 검색
		
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key); //키에 매핑되는 값을 저장
			System.out.print("{"+key+", "+value+"} ");
		}
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
	}

}
