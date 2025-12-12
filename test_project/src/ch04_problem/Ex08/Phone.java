package ch04_problem.Ex08;

import java.util.Scanner;

public class Phone {

	//멤버변수
	private String name;
	private String tel;
	
	//생성자 : 처음에 만들때 초기화, 딱 한번 사용하면 끝!	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	//setter : 두번째부터 바꿀때는 setter메서드를 사용함! 
//	public void set(String name, int tel) {
//		this.name = name;
//		this.tel = tel;
//	}
	
	
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
	
}
