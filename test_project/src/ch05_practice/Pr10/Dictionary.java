package ch05_practice.Pr10;
//구현 클래스
public class Dictionary extends PairMap {

	private int count; //현재 배열에 들어있는 아이템 개수
	
	//생성자 - 초기화
	public Dictionary(int capacity) {
		super();
		//부모에게 상속받은 변수 초기화
		keyArray = new String[capacity];
		valueArray = new String[capacity];
		count = 0;
	}

	@Override
	String get(String key) {
		
		//key값 받으면 순회하면서 value값 찾아야함
		for(int i=0; i<count; i++) {
			if(key.equals(keyArray[i])){
				return valueArray[i];
			}
		}
		return null; //없으면 null
	}

	@Override
	void put(String key, String value) {
		//있으면 해당위치에 value를 넣어줌
		//없으면 꽉 찼는지 검사
				
		//1. key값이 같은게 몇번에 있는지 검사
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i])) {
				 break; //반복문 나가라
			}
		}
		
		//2. 다돌았는데 없고, 꽉 찼는지 검사
		if(i==count) {
			//신규
			if(i<keyArray.length) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
			}
		}else {
			//수정
			keyArray[i] = key;
			valueArray[i] = value;
		}
	}

	@Override
	String delete(String key) {
		//키값 같은게 있는지 검사
		int i=0;
		for(i=0; i<count; i++) {
			if(key.equals(keyArray[i])) {
				 break; //반복문 나가라
			}
		}
		
		if(i==count) { //같은게 없음
			return null;			
		}
		
		String s = valueArray[i];
		
		//
		int start = i;
		int end = count-1;
		for(int j=start; j<end; j++) {
			keyArray[j] = keyArray[j+1];
			valueArray[j] = valueArray[j+1];
		}
		count--;
		return s;
	}

	@Override
	int length() {
		return count;
	}

}



