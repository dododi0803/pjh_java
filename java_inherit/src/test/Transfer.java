package test;

public class Transfer extends Transaction{

	 private boolean isIncoming; //입,출금
	
	public Transfer(int amount, String days, String memo,boolean isIncoming) {
		super(amount, days, memo);
		this.isIncoming=isIncoming;
	}

	@Override
	public int apply(int balance) {
		if(isIncoming) {
			return balance + amount;
		}else {
			return balance - amount;
		}
	}

}
