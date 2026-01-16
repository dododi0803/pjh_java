package test;


import java.util.ArrayList;
import java.util.List;


public class MainMethod {

	public static void main(String[] args) {
		
		int balance =0; //잔액 0

		List<Transaction>transactions=new ArrayList<>();
		
		transactions.add(new Income (500000,"2026--01-10","월급"));
		transactions.add(new Expense(300000,"2026--01-31","한달 점심 값"));
		transactions.add(new Transfer(200000,"2026--01-25","동생 용돈",false));
		
		for (Transaction t : transactions) {
		    balance = t.apply(balance);
		}
		System.out.println("죄종 잔액: "+ balance + "원");
	}

}
