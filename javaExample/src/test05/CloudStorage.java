package test05;

public class CloudStorage implements Storage{

	@Override
	public void save(String data) {
		System.out.println("클라우드 저장: "+data);
		
	}

}
