package BookStore2.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//import BookStore.Book;

public class BookStore {

	// ==================객체배열(템플릿-ArrayList)

	// 1)멤버변수
	private ArrayList<Book> bookArrayList;
	private ArrayList<Customer> custArrayList;

	// 1)DB관련 멤버변수
	Connection con;
	Statement stmt;
	ResultSet rs;

	// 2)생성자 - 멤버변수 초기화 담당
//	public BookStore() {
//		// TODO Auto-generated constructor stub
//	}

	public BookStore() {

		this.bookArrayList = new ArrayList<Book>();
		this.custArrayList = new ArrayList<Customer>();
	}

	// 3)메소드 - getter
	public ArrayList<Book> getBookArrayList() {
		return bookArrayList; // 객체배열을 반환함
	}

	public ArrayList<Customer> getCustArrayList() {
		return custArrayList;
	}

	// 3)메소드 - DB 연결
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
			con = DriverManager.getConnection(url, userid, pwd); // 가장 중요
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 3)메소드 - DB에서 가져오는 거
	public void getBooksDB() {
		String query = "SELECT bookid, bookname, publisher, price FROM book";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("BOOK ID \tBOOK NAME \t\tPUBLISHER \tPRICE");

			while (rs.next()) {

				// DB에서 가져와 배열에 넣음
				Book b1 = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				bookArrayList.add(b1);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 3)메소드 - DB에서 가져오는 거
	public void getCustomersDB() { // 생성자
		String query = "SELECT CUSTID, NAME, ADDRESS, PHONE FROM CUSTOMER";
		try {
			stmt = con.createStatement(); // 2
			rs = stmt.executeQuery(query); // 3
			System.out.println("고객ID \t 고객명 \t\t주소 \t\t\t 전화번호");

			while (rs.next()) {

				Customer b1 = new Customer(rs.getInt(1), 
										   rs.getString(2), 
										   rs.getString(3), 
										   rs.getString(4));
				custArrayList.add(b1);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close(); // DB에서는 반드시 닫아줘야 함, finally 구문에 넣어주는게 정석임
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
