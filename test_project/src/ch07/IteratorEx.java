package ch07;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		//정수형 벡터 컬렉션 생성
		Vector<Integer> v = new Vector<Integer>();
		
		//정수 삽입
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		//Iterator를 이용한 모든 정수 출력
		Iterator<Integer> it = v.iterator(); //순차 검색

		while(it.hasNext()) {
			int n =it.next();
			System.out.println(n);
		}
		
		//Iterator를 이용하여 모든 정수 더하기
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n =it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+ sum);
	}

}
