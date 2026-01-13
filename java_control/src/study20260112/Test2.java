package study20260112;

public class Test2 {

	private String Productname;
	private int commodity;
	private String Category;
	private int Quantity;
	public Test2(String productname, int commodity, String category, int quantity) {
		super();
		Productname = productname;
		this.commodity = commodity;
		Category = category;
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Test2 [Productname=" + Productname + ", commodity=" + commodity + ", Category=" + Category
				+ ", Quantity=" + Quantity + "]";
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public int getCommodity() {
		return commodity;
	}
	public void setCommodity(int commodity) {
		this.commodity = commodity;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
