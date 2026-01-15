package Test1;

public class Tv {

	String name; //tv 이름
	int cost;  // 가격
	String color; // 색상
	
	public Tv (String name,int cost, String color) {
		this.name=name;
		this.cost=cost;
		this.color=color;
	}
	
	public void control () {
		System.out.println(name+" "+cost+" "+color+" ");
	}

	public void changeChannel(int newChannel) {
		System.out.println();
	}
	
	
	
}
