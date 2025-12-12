package ch03_problem;

public class practice12 {

	//2 3 aa 5 6.5
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<args.length; i++) {
			try {
				int n = Integer.parseInt(args[i]); //문자열을 정수로 저장
				sum = sum + n;				
			}catch(Exception e) {
				System.out.println(args[i]+"얘는 못 더해요!!!!!!!");
			}
			
		}
		
		System.out.println(sum);

	}

}
