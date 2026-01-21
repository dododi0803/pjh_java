package test4;

public class Tex implements PaymentNotifier{

	@Override
	public void notify(String message) {
		System.out.println("문자전송: "+message);
		
	}

}
