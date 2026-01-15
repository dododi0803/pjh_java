package Test1;

public class Food {

	// 음식이름, 칼로리, 맵기 (1~5단계)
	
	String name;
	int kcal;
	int num;
	
	public Food (String name,int kcal, int num) {
		this.name =name;
		this.kcal =kcal;
		this.num = num;
		
	}
	public void Foods() {
		System.out.println(name+kcal+num);
	}
}
