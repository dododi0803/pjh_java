package test4;

public class MainMethod {

	public static void main(String[] args) {
		
//		PaymentNotifier email = new Email();
//		PaymentNotifier tex = new Tex();
//		PaymentNotifier kakao = new Kakao();
//		
//		email.notify("카드결재 완료");
//		tex.notify("계좌이체 완료");
//		kakao.notify("포인트 결제 완료");
		PaymentNotifier[] notifiers = {
			    new Email(),
			    new Tex(),
			    new Kakao()
			};

			for (PaymentNotifier notifier : notifiers) {
			    notifier.notify("결제가 완료되었습니다.");
			}
	}

}
