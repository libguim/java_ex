package ch03_problem;

public class practice13 {

	public static void main(String[] args) {
			
		for(int i=1; i<100; i++) {
			
			int first = i / 10;
			int second = i % 10;
			
			int cnt = 0;
			
			if(first == 3 || first == 6 || first == 9) {
				cnt++;
			}
			if(second == 3 || second == 6 || second == 9) {
				cnt++;
			}
			
			if(cnt > 0) {
				if(cnt == 1) {
					System.out.println(i + " 박수 짝!");
				}else {
					System.out.println(i + " 박수 짝!짝!");
				}				
			}

			
		} //for
	}

}
