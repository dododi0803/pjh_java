package study20260112;

public class Test {

	private String name;
	private String iD;
	private int Password;
	private int Phone;
	public Test(String name, String iD, int password, int phone) {
		super();
		this.name = name;
		this.iD = iD;
		Password = password;
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", iD=" + iD + ", Password=" + Password + ", Phone=" + Phone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	
	
	
	
}
