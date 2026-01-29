

package test6;

import java.util.ArrayList;
import java.util.Scanner;

public class _Exec2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");
			String menu = sc.nextLine();
			if(menu.equals("0")) {
				break;
			}else if(menu.equals("1")) {
				 System.out.print("--목록--:");
				
				 
				}else if(menu.equals("2")) {
			     System.out.print("아이디");
			     System.out.print("비밀번호");
			     System.out.print("이름");
			     System.out.print("연락처");
			     System.out.print("주소");
				}else if(menu.equals("3")) {
			     System.out.print("수정");
				}else if(menu.equals("4")) {
				 System.out.print("삭제");
				 
				 
			
				 
				}
			}
	             System.out.println("---프로그램 종료---");
	             
			
	}

}
