package ch05_practice.Pr10;

//import java.util.Dictionary;

public class DictionaryApp {

	public static void main(String[] args) {
		
		//용량 10인 Dictionary 객체 생성 
		Dictionary dic = new Dictionary(10);
		
		//key, value 넣기
		dic.put("손흥민", "축구");
		dic.put("아이유", "가수");
		dic.put("아이유", "배우"); //key값이 동일하므로 덮어씀
		
		//출력
		System.out.println("아이유의 값은 "+dic.get("아이유"));
		System.out.println("손흥민의 값은 "+dic.get("손흥민"));
		
		//삭제
		dic.delete("손흥민");
		System.out.println("손흥민의 값은 "+dic.get("손흥민"));
	}

}
