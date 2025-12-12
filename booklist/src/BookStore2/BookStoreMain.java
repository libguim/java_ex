package BookStore2;

public class BookStoreMain {
	public static void main(String args[]) {

		BookStore bs1 = new BookStore();
		
		bs1.setConnection();
		bs1.getBookList();
		
		System.out.println("2.배열 출력 - 2번(다른클래스에서 출력)");
		bs1.printBookList();
		
		//4.객체배열
		System.out.println("4.객체배열 출력 - 2번(다른클래스에서 출력)");
		
		for(int i=0; i< bs1.getBookArr().length; i++) {
			bs1.getBookArr()[i].printBook();
			System.out.println();
		}
		
		//5.객체배열 템플릿(ArrayList)
		System.out.println("5.객체배열(템플릿 출력 - 2번(다른클래스에서 출력)");
		for(int i=0; i<bs1.getBookArrayList().size(); i++)
		{
			bs1.getBookArr()[i].printBook();
			System.out.println();
		}	
		
//		=====================
		
		bs1.setConnection(); //연결
		bs1.getCustomerList();

		//4.객체배열
		System.out.println("4. customer 객체배열 출력 - 2번(다른 클래스에서 출력)");
		for(int i=0; i<bs1.getCustomerArr().length; i++)
			bs1.getCustomerArr()[i].printCustomer();
			System.out.println();
		
		//5.객체배열(템플릿-ArrayList)
		System.out.println("5. customer 객체배열(템플릿-ArrayList) 출력 - 2번(다른 클래스에서 출력)");
		for(int i=0; i<bs1.getCustArrayList().size(); i++)
			bs1.getCustomerArr()[i].printCustomer();
		

	}
}
