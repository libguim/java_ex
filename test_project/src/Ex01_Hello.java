
public class Ex01_Hello {
	
//	메소드 만들기 : sum() 정의하기 define
	public static int sum(int n, int m) {
		return n + m;
	}

//	메소드 : main() 필수
	public static void main(String[] args) {
//		변수 : 만들고 사용
		int i = 20;
//		변수 만들기 : 변수 선언 declare
		int s;
//		char : 문자 1개만 가능, 작은 따옴표 사용'1'
//		string : 문자열, 큰 따옴표 사용 "1"
//		int : 정수, 1
//		float : 1.0f
//		double : 1.0
		char a;
		
//		sum() 메소드를 사용함
		s = sum(i, 10);
		a = '?';
//		println : line 줄바꿈하기
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
