package Test1;

public class Toy {

	 //장난감 이름, 가격, 브랜드명
	
	public String name;
	public int cost;
	public String brend;
	
	public Toy (String name, int cost, String brend) {
		this.name = name;
		this.cost = cost;
		this.brend = brend;
		
		
	}
	public void Toys() {
		System.out.println(name+cost+brend);
		
	}
}
