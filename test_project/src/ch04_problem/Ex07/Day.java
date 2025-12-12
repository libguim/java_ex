package ch04_problem.Ex07;

public class Day {
	
	private String work;

	//할당하기
	//setter : 매개변수로 새 값을 받아 private 필드에 할당
	public void set(String _work) { 
		work = _work;		
	}

	//반환하기
	//getter : private 필드의 값을 반환(return)
//	public String get() { 
//		return work;
//	}
	
	public void show() {
		if(work == null) {
			System.out.println("할일이 없습니다!");
		}else {
			System.out.println(work+"입니다.");
		}
	}

}
