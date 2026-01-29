package test6;

import java.util.ArrayList;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");
			String menu = sc.nextLine();
			if(menu.equals("0")) {
				break;
			}else if(menu.equals("1")) {
				 System.out.print("--목록--:"+productList);
				 
				 
				 
				 
				 
				 
				 
				 
				}else if(menu.equals("2")) {
			     System.out.print("상품이름");
				}else if(menu.equals("3")) {
			     System.out.print("상품가격");
				}else if(menu.equals("4")) {
				 System.out.print("구매수량");
				 
				 
			
				 
				}
			}
	             System.out.println("---프로그램 종료---");
	             
			}else if(menu.equals("1")) {
			 System.out.println("--목록--");
			}else if(menu.equals("2")) {
		     System.out.println("--등록--");
			}else if(menu.equals("3")) {
		     System.out.println("--수정--");
			}else if(menu.equals("4")) {
			 System.out.println("--삭제--");
			}
		}
             System.out.println("---프로그램 종료---");
	}

}
