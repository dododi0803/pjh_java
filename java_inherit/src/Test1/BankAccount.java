package Test1;

public class BankAccount {

	
	String owner; //계좌 소유자 이름
	int balance; // 현재 잔액
	
	public BankAccount(String owner,int balance) {
		this.owner=owner;
		this.balance=balance;
	}
	public void printAccountInfo() {
		System.out.println("소유자: "+owner);
		System.out.println("잔액: "+balance+"원");
	}
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance-=amount;
		}
	}
	
	
	
}
