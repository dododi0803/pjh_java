package test3;

public class App implements Notifier{

	@Override
	public void send(String message) {
		System.out.println("앱 푸시 전송: "+ message);
		
	}

}
