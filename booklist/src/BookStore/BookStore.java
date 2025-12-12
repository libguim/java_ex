package BookStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookStore {
	Connection con; // DB관련 멤버변수
	Statement stmt;
	ResultSet rs;

	// 1.변수
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;
	
	// 2.배열
	private int bookidArr[];
	private String booknameArr[];
	private String publisherArr[];
	private int priceArr[];

	//3.객체
	private Book book;
	
	//4.객체배열
	private Book bookArr[];
	public Book[] getBookArr() {
		return bookArr; 
	}
	
	//5.객체배열(템플릿-ArrayList)
	private ArrayList<Book> bookArrayList;
	public ArrayList<Book> getBookArrayList() { //반환값 : ArrayList<Book>
		return bookArrayList; 
	}
	
	//생성자는 멤버변수 초기화 담당
	public BookStore() {
		
		//2.배열
		bookidArr= new int[10];
		booknameArr = new String[10];
		publisherArr = new String[10];
		priceArr = new int[10];
	
		//3.객체
		book = new Book();
		
		//4.객체배열
		bookArr = new Book[10];
		
		for(int i=0; i>bookArr.length; i++) {
			bookArr[i] = new Book();
		}
		
		//5.객체배열(템플릿-ArrayList)
		bookArrayList = new ArrayList<Book>();
		
	}
	


	public void setConnection() {
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";
		String userid = "madang";
		String pwd = "madang";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//1.변수
	private void printBook() {
		System.out.print(bookid + "\t ");
		System.out.print(bookname + "\t\t ");
		System.out.print(publisher + "\t\t ");
		System.out.print(price + " ");
	}
	
	//2.배열
	public void printBookList() {
		for(int i=0; i<bookidArr.length; i++) {
			System.out.print(bookidArr[i] +"\t");
			System.out.print(booknameArr[i] + "\t");
			System.out.print(publisherArr[i] +"\t");
			System.out.println(priceArr[i] );	
		}
		
	}

	public void getBookList() {
		String query = "SELECT bookid,bookname,publisher,price FROM Book";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			
			int index=0;
			while (rs.next()) {
				// 오리지널
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
				
				//1. 변수활용 테스트
				bookid = rs.getInt(1);
				bookname = rs.getString(2);
				publisher = rs.getString(3);
				price = rs.getInt(4);

//				System.out.println("1. 변수 출력");
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
				
//				System.out.println("3. 객체 출력");
//				book.printBook(); //1권씩 출력
				
				//4.객체 배열
				bookArr[index].setBookid(rs.getInt(1));
				bookArr[index].setBookname(rs.getString(2));
				bookArr[index].setPublisher(rs.getString(3));
				bookArr[index].setPrice(rs.getInt(4));
				
//				bookArr[index].printBook(); //1권씩 출력
				
				//5.객체배열(템플릿-ArrayList)
				Book b1 = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				bookArrayList.add(b1);
				
//				bookArrayList.get(index).printBook();//1권씩 출력
				
				index++;
						
			}
			con.close(); // close는 반드시 해줘야 함
			
//			System.out.println("2. 배열 출력 - 1번");
//			printBookList();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getCustomerList() {
		String query = "SELECT custid,name,address,phone FROM CUSTOMER";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("고객ID \t고객명 \t\t주소 \t\t\t전화번호");
			while (rs.next()) {
				System.out.print("\t" + rs.getInt("CUSTID"));
				System.out.print("\t" + rs.getString("NAME"));
				System.out.print("\t\t\t" + rs.getString("ADDRESS"));
				System.out.println("\t\t\t\t" + rs.getString("PHONE"));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
