package test4;

public class Email implements PaymentNotifier{

	@Override
	public void notify(String message) {
		System.out.println("이메일 전송:"+message);
		
	}

}
