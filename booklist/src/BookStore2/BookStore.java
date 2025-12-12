package BookStore2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import BookStore.Book;

public class BookStore 
{
	Connection con; // 멤버변수
	Statement stmt;
	ResultSet rs;
	
	//1.변수
	//2.배열
	//3.객체
	//4.객체배열
	//5.객체배열(템플릿-ArrayList)
	
	//1.변수
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	//2.배열
	private int bookidArr[];
	private String booknameArr[];
	private String publisherArr[];
	private int priceArr[];
	
	//3.객체
	private Book book;
	
	//4.객체 배열
	private Book bookArr[];
	
	public Book[] getBookArr() {
		return bookArr;
	}
	
	//5.객체배열(템플릿-ArrayList)
	private ArrayList<Book> bookArrayList;
	
	public ArrayList<Book> getBookArrayList(){
		return bookArrayList;
	}
	
	
//	=============================================
	
	
	//1.변수
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	//2.배열
	private int custidArr[];
	private String nameArr[];
	private String addressArr[];
	private String phoneArr[];
	
	//3.객체
	private Customer customer;
	
	//4.객체 배열
	private Customer customerArr[];
	
	public Customer[] getCustomerArr() {
		return customerArr;
	}
	
	//5.객체배열(템플릿-ArrayList)
	private ArrayList<Customer> custArrayList;
	
	public ArrayList<Customer> getCustArrayList(){
		return custArrayList;
	}	
	
	
//	=============================================	
	
	
	//생성자는 멤버변수 초기화 담당
	public BookStore() { 
		
		//2.배열
		bookidArr = new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
		
		//3.객체
		book = new Book();
		
		//4.객체 배열
		bookArr = new Book[10];
		for(int i=0; i<bookArr.length;i++) {
			bookArr[i] = new Book();
		}
		
		//5.객체배열(템플릿-ArrayList)
		bookArrayList = new ArrayList<Book>();
		
		
//		=============================================		
		
		
	
		//2.배열
		custidArr = new int[5];
		nameArr = new String[5];
		addressArr = new String[5];
		phoneArr = new String[5];
		
		//3.객체
		customer = new Customer();
		
		//4.객체 배열
		customerArr = new Customer[5];
		for(int i=0; i<customerArr.length;i++) {
			customerArr[i] = new Customer();
		}
		
		//5.객체배열(템플릿-ArrayList)
		custArrayList = new ArrayList<Customer>();		
			
		
		
	}

	public void setConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang"; // c##추가
		String pwd = "madang"; // c##추가

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("데이터베이스 연결 준비 .....");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//1.변수
	private void printBook() {
		System.out.print(bookid +"\t\t");
		System.out.print(bookname + "\t\t");
		System.out.print(publisher +"\t\t");
		System.out.println(price+" " );
	}
	
	//2.배열
	public void printBookList() {
		for(int i=0; i<bookidArr.length; i++) {
			System.out.print(bookidArr[i] +"\t\t");
			System.out.print(booknameArr[i] + "\t\t");
			System.out.print(publisherArr[i] +"\t\t");
			System.out.println(priceArr[i] );
		}
	}

// =============================출력 메서드
	
//	//1.변수
//	public void printCustomer() {
//		System.out.print(custid +"\t\t");
//		System.out.print(name + "\t\t");
//		System.out.print(address +"\t\t");
//		System.out.println(phone+" ");
//	}
//	
//	//2.배열
//	public void printCustArrayList() {
//		for(int i=0; i<customerArr.length; i++) {
//			System.out.print(custidArr[i] +"\t\t");
//			System.out.print(nameArr[i] + "\t\t");
//			System.out.print(addressArr[i] +"\t\t");
//			System.out.println(phoneArr[i] );
//		}
//	}
	
	
	
	public void getBookList() { // 생성자
		String query = "SELECT bookid, bookname, publisher, price FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \tPRICE");
			
			int index=0;
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t\t" + rs.getString(3));
//				System.out.println("\t\t\t\t" + rs.getInt(4));
				
				//1.변수
				bookid = rs.getInt(1);
				bookname = rs.getString(2);
				publisher = rs.getString(3);
				price = rs.getInt(4);
				
//				System.out.println("1.변수 출력");
//				printBook();
				
				//2.배열
				bookidArr[index] = rs.getInt(1);
				booknameArr[index] = rs.getString(2);
				publisherArr[index] = rs.getString(3);
				priceArr[index] = rs.getInt(4);
//				index++;	
				
				//3.객체
				book.setBookid(rs.getInt(1)); 
				book.setBookname(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setPrice(rs.getInt(4));
			
//				System.out.println("3.객체 출력");
//				book.printBook();//1권씩 출력
				
				//4.객체 배열
				bookArr[index].setBookid(rs.getInt(1));
				bookArr[index].setBookname(rs.getString(2));
				bookArr[index].setPublisher(rs.getString(3));
				bookArr[index].setPrice(rs.getInt(4));
				
				//bookArr[index].printBook();//1권씩 출력
				
				//5.객체배열(템플릿-ArrayList)
				Book b1 = new Book(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4) );
				bookArrayList.add(b1);
						
//				bookArrayList.get(index).printBook();//1권씩 출력
				
				index++;

			}
//			con.close();
			
//			System.out.println("2.배열 출력 - 1번");
//			printBookList();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	public void getCustomerList() { // 생성자
		String query = "SELECT CUSTID, NAME, ADDRESS, PHONE FROM CUSTOMER";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("고객ID \t 고객명 \t\t주소 \t\t\t 전화번호");
			
			int index = 0;
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt("CUSTID"));
//				System.out.print("\t" + rs.getString("NAME"));
//				System.out.print("\t\t\t" + rs.getString("ADDRESS"));
//				System.out.println("\t\t\t\t" + rs.getString("PHONE"));
				
				//1.변수
				custid = rs.getInt(1);
				name = rs.getString(2);
				address = rs.getString(3);
				phone = rs.getString(4);
				
//				System.out.println("1.변수 출력");
//				printCustomer();
				
				//2.배열
				custidArr[index] = rs.getInt(1);
				nameArr[index] = rs.getString(2);
				addressArr[index] = rs.getString(3);
				phoneArr[index] = rs.getString(4);
//				index++;
				
				//3.객체
				customer.setCustid(rs.getInt(1)); 
				customer.setName(rs.getString(2));
				customer.setAddress(rs.getString(3));
				customer.setPhone(rs.getString(4));
			
//				System.out.println("3.객체 출력");
//				customer.printCustomer();//1권씩 출력
				
				//4.객체 배열
				customerArr[index].setCustid(rs.getInt(1)); 
				customerArr[index].setName(rs.getString(2));
				customerArr[index].setAddress(rs.getString(3));
				customerArr[index].setPhone(rs.getString(4));
				
				//bookArr[index].printBook();//1권씩 출력
				
				//5.객체배열(템플릿-ArrayList)
				Customer b1 = new Customer(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4) );
				custArrayList.add(b1);
						
//				bookArrayList.get(index).printBook();//1권씩 출력
				
				index++;
				
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
