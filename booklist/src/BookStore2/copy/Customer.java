package BookStore2.copy;

public class Customer {

	//1.멤버변수
	private int custid;
	private String name;
	private String address;
	private String phone;
	
	//2.생성자
	public Customer() {
		this.custid = 0;
		this.name = "";
		this.address = "";
		this.phone = "";
	}
	
	public Customer(int custid, String name, String address, String phone) {
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	//3.세터/게터 메소드
	public int getCustid() {
		return custid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	//4.메소드
	public void printCustomer() {
		System.out.print(custid + "\t ");
		System.out.print(name + "\t\t ");
		System.out.print(address + "\t\t ");
		System.out.println(phone + " ");
	}
	
}
