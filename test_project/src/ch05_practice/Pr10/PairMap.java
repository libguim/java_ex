package ch05_practice.Pr10;

//추상클래스
//PairMap = HashMap과 동일한 자료구조(몽고DB의 Dictionary와 비슷)
public abstract class PairMap {
	
	//배열
	protected String keyArray[];
	protected String valueArray[];
	
	//추상메소드
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length(); //원소의 개수
}
