package ch03_problem;

public class practice11 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<args.length; i++) {
			int n = Integer.parseInt(args[i]); //문자열을 정수로 저장
			sum = sum + n;
			System.out.println(args[i]);
		}
		
		System.out.println("평균"+sum/args.length);
	}

}
