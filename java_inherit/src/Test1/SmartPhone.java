package Test1;

public class SmartPhone {

	String name; // 폰종류
	int cost; // 폰가격
	String color; // 폰색상
	
	public SmartPhone(String name, int cost, String color) {
	this.name=name;
	this.cost=cost;
	this.color=color;
	}
	public  void Phone	() {
		System.out.println(name+" "+cost+" "+color+" ");
	}
	
}
