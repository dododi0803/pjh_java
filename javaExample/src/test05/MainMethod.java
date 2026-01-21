package test05;

public class MainMethod {

	public static void main(String[] args) {
     		
     Storage file = new FileStorage();
     Storage data = new DatabaseStorage();
     Storage cloud = new CloudStorage();
     
     file.save("김지유");
     data.save("고라니");
     cloud.save("김치");
     
	}

}
