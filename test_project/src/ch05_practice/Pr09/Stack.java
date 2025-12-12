package ch05_practice.Pr09;

//인터페이스 - 설계도 역할
public interface Stack {
	int length(); //요소의 개수
	int capacity(); //스택의 최대 용량
	String pop(); //스택의 맨 위 요소를 꺼내고 반환
	boolean push(String val); //스택의 맨 위에 새요소 추가
}
