package Test1;

public class Account {

	String accountNumber; //계좌번호
	String owner; // 계좌주 이름
	int balance; // 잔액
	
	public Account (String accountNumber,String owner, int balance) {
		this.accountNumber=accountNumber;
		this.owner=owner;
		this.balance=balance;
	}
	public void Account2() {
		System.out.println(accountNumber+" "+owner+" "+balance+" ");
	}
	 public void showAccount() {
	        System.out.println(accountNumber + " " + owner + " " + balance + "원");
	    }
	public void deposit(int amount) {
		balance += amount;
		System.out.println(owner+"님"+amount+"원 출금완료.잔액: "+balance+"원");
	}
	public void withdraw(int amount) {
		if(balance>= amount) {
			balance -= amount;
		System.out.println(owner+"님"+amount+"원 출금 완료.잔액: "+balance+"원");
	}else {
		System.out.println("잔액이 부족합니다.");
	}
	
			
		}
}
