package test4;

public class Kakao implements PaymentNotifier{

	@Override
	public void notify(String message) {
		System.out.println("카카오 알림 전송:"+message);
		
	}

}
