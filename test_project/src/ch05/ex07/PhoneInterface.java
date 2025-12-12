package ch05.ex07;

//인터페이스는 공개적으로 연결하는 가교역할
interface PhoneInterface {
	final int TIMEOUT = 10000;
	abstract void sendCall(); //추상메소드 내용없음
	abstract void receiveCall(); 
	public default void printLogo() {
		System.out.println("** Phone **");
	}
}
