package test05;

public class FileStorage implements Storage{


	@Override
	public void save(String data) {
		System.out.println("파일로 저장: "+data);
		
	}

}
