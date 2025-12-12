package ch07;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		//정수형의 벡터 컬렉션 객체 생성
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		System.out.println(v);
		
		//인덱스 2에 100 삽입
		v.add(2, 100);
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
		//모든 요소의 정수 출력
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i); // v[i]
			System.out.println(n);
		}
		
		//모든 요소의 정수 더하기
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i); // v[i]
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : "+ sum);
	}

}
