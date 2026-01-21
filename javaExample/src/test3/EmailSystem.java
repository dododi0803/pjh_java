package test3;

public class EmailSystem implements Notifier{

	private String massage;

	@Override
	public void send(String message) {
		System.out.println("이메일 전송: "+massage);
		
	}

}
