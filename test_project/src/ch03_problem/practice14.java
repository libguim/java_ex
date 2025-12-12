package ch03_problem;

import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {
		 String course [ ] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		 int score [ ] = {95, 88, 76, 62, 55};
		 
		 Scanner sc1 = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("과목 이름>>>");
			 String name = sc1.next();
			 
			 if(name.equals("그만")) {
				 System.out.println("종료합니다!");
				 break;
			 }
			 
			 // 과목 검색 성공 여부를 위한 boolean 플래그
			 boolean found = false; 
            
			 for(int i=0; i<course.length; i++) {
				 if(course[i].equals(name)) {
					 System.out.println(course[i]+"의 점수는 "+score[i]);
					 found = true; // 찾았음을 표시
					 break;       // 찾았으므로 즉시 반복문 종료
				 }
			 }
			 
			 // 루프가 끝난 후, found가 여전히 false라면 과목을 못 찾았다는 의미
			 if(!found) {
				 System.out.println("그런 과목은 없습니다!");
			 }
		 }
        
        sc1.close(); // 스캐너 종료는 while 루프 밖에서 한 번만
	}

}
