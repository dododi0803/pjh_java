package Test1;

public class VendingMachine {

	 String itemName; //물건이름
	 int price; // 가격
	 int stock; // 재고가격
	 
	 public VendingMachine (String itemName, int price, int stock) {
		 this.itemName = itemName;
		 this.price=price;
		 this.stock=stock;
	 }
	 
	 public void VendingMachine1 () {
		 System.out.println(itemName+price+stock);
	 }
	 
	 
}
