package test;

public abstract class Transaction {
    
	protected int amount; //금액
	protected String days; //날짜
	protected String memo; //메모
	
	public Transaction(int amount, String days, String memo) {
		
		this.amount = amount;
		this.days = days;
		this.memo = memo;

	}
	//자식 클래스가 구현해야하는 규칙
	 public abstract int apply (int balance); 

}
