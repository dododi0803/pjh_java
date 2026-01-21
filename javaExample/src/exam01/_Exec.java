package exam01;

import java.util.Scanner;

public class _Exec {
       public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("주민번호: ");
		String ssn = scanner.nextLine();
		System.out.print("나이: ");
		String age = scanner.nextLine();
        //scanner.close();
		System.out.println(name+"\t"+ssn+"\t"+age);
		
		System.out.print("이름: ");
		String name1 = scanner.nextLine();
		System.out.print("주민번호: ");
		String ssn1 = scanner.nextLine();
		System.out.print("나이: ");
		String age1 = scanner.nextLine();
		
		
		
		System.out.println(name1+"\t"+ssn1+"\t"+age1);
       
       
       
       
       }

}
