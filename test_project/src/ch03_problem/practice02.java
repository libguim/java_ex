package ch03_problem;

// 다차원 배열 - 2차원 배열

public class practice02 {

	public static void main(String[] args) {
		int n[][] = {
						{1},
						{1,2,3},
						{1},
						{1,2,3,4},
						{1,2}
					};	
		
		int a = 0;
		
		for(int i=0; i<n.length; i++) {

			for(int j=0; j<n[i].length; j++) {
				a = n[i][j];
				System.out.print(a + "\t"); //출력의 모양새
			}

			System.out.print("\n");
		}
		
	}

}
