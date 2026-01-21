package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {

	private static Object name;

	public static void main(String[] args) {
	    //이름,주민번호,나이,성별
		
		/*
		   123456-1234567
		   이름
		   주민번호
		   나이
		   성별
		  */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = scanner.nextLine();
		
		System.out.println("주민번호: ");
		String ssn = scanner.nextLine();
		
		
		
		
		
		
		
//		String strs ="";
		
//		String name ="홍길동";
//		String ssn="020803-4262014";
		String imsi = ssn.substring(7,8);
		
		String gender="여자";
		if(imsi.equals("1")|| imsi.equals("3")) {
			gender="남자";
		}
		String temp = ssn.substring(0,2);
		
		int birthYaer;
		if(imsi.equals("1")|| imsi.equals("2")) {
			birthYaer=1900+ Integer.parseInt(temp);
		}else { //2000
			birthYaer=2000+ Integer.parseInt(temp);
		}
		int age = 2026-birthYaer;
		System.out.println("age: "+age);
		System.out.println("birthYaer: "+birthYaer);
		System.out.println("temp: "+temp);
		System.out.println("gender: "+gender);
		System.out.println("imsi: "+imsi);
		
        //현재 날짜 정보 가져오기
		int year = LocalDate.now().getYear();
		int age1 = year - birthYaer;
		
		
		System.out.printf("이름: %s\n",name);
		System.out.printf("주민번호: %s\n",ssn);
		System.out.printf("나이: %s\n",age);
		System.out.printf("성별: %s\n",gender);
		
		
	}

}
