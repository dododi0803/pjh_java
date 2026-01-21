package test3;

public class MainMethod {

	public static void main(String[] args) {
		Notifier email = new EmailSystem();
		Notifier sms = new Tex();
		Notifier app = new App();
		
		String message = "원가입이 완료되었습니다";
		
		email.send(message);
		sms.send(message);
		app.send(message);
		

	}

}
