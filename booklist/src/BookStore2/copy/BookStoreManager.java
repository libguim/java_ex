package BookStore2.copy;

import java.util.ArrayList;

public class BookStoreManager {
	void run() {

		BookStore bs1 = new BookStore(); //책방을 하나 생성함
		
		bs1.setConnection(); //연결
		bs1.getBooksDB(); //DB받아와서 저장
				
		//출력
		for(int i=0; i<bs1.getBookArrayList().size(); i++)
		{
			bs1.getBookArrayList().get(i).printBook();			
		}	
		
		bs1.setConnection(); 
		bs1.getCustomersDB();

		for(int i=0; i<bs1.getCustArrayList().size(); i++)
			bs1.getCustArrayList().get(i).printCustomer();
	}
}
