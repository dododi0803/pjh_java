package test;

public class Expense extends Transaction{

	public Expense(int amount, String days, String memo) {
		super(amount, days, memo);
		
	}

	@Override
	public int apply(int balance) {
		return balance-amount;
	}

}
