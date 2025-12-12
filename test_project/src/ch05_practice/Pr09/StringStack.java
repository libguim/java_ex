package ch05_practice.Pr09;

//구현 클래스
public class StringStack implements Stack{
	//멤버변수
	private int top; //맨 위 요소의 인덱스(스택이 비었을때 -1)
	
	//스택에 문자열을 저장할 배열(데이터 저장소)
	private String element[];
	
	//생성자 메소드 - 초기화 설정
	public StringStack(int capacity) {
		element = new String[capacity]; //배열을 주어진 용량으로 초기화
		top = -1; //스택이 비었을때 -1 (0이면 1개가 들어있는 거임)
	}

	
	@Override
	public int length() {
		return top+1; // 요소의 개수 반환 - 인덱스가 0이면 1개가 있음 (인덱스+1)
	}

	@Override
	public int capacity() {
		return element.length; //배열의 길이로 스택의 최대용량을 알려줌
	}
	
	//스택이 비어있을 때 top은 -1
	//요소가 하나있을 때 top은 0
	//요소가 n개 있을 때 top은 n-1
	@Override
	public String pop() {
		
		if(top == -1) { //비어있는지 검사
			return null;			
		}else {
			String s = element[top]; //배열의 맨 위 요소를 저장
			top--; //한칸씩 내림(요소 제거)
			return s;

//			return element[top--]; 축약형
		}
	}

	@Override
	public boolean push(String fruit) {
		if(top == element.length-1) { //맨 위 요소의 인덱스가 배열 크기만큼 꽉 찼는지 검사 			
			return false;
		}else {
			element[top+1] = fruit; //top 위에 새로운 요소 추가
			top++; //한칸씩 올림
			return true;
			
//			element[++top] = fruit; 동일한 의미
//			return true;
		}
	}
	
}
