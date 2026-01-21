package test3;

public class Tex implements Notifier{

	@Override
	public void send(String message) {
		System.out.println("문자 전송: "+message);
		
	}

}
