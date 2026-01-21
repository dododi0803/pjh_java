package test05;

public class DatabaseStorage implements Storage{

	@Override
	public void save(String data) {
		System.out.println("데이터베이스 저장: "+data);
		
	}

}
