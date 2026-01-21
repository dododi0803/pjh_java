package test2;

public abstract class Transaction {

	
	private int amount;
	private String date;
	private String memo;
	
	
	public Transaction(int amount, String date, String memo) {
		super();
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}
	public abstract int apply (int balance);

}
