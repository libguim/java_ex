package ch04.ex08;

public class ex08 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		ArrayParameter.printCharArray(c); //static일 때
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	}

}
