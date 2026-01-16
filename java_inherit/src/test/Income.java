package test;

public class Income extends Transaction {

	public Income(int amount, String days, String memo) {
		super(amount, days, memo);
		
	}

	@Override
	public int apply(int balance) {
		return balance+amount;
	}

}
