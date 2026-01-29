package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	private static Object strs;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); //입력받기 위해 스캐너 써주기
		while (true) {
			System.out.println("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타: 종료)");
		   String menu = sc.nextLine(); // Line은 무조건 String 문자열로 받기
		   switch (menu) {
		   case "1" :
			   System.out.println("--목록--");
			   break;
		   case "2" :
			   System.out.println("--상세보기--");
			   break;
		   case "3" :
			//   StudentDTO dto = new StudentDTO();
			  String name = "이상순";
			  String ssn = "123456-1234567";
			  String phone = "010-1111-1111";
			  String address = "서울";
			  
			 Map<String, String>map
			  
			   
			   
			   StudentDAO dao = new StudentDAO();
			   int result = dao.setInsert(strs);
			   System.out.println("result:"+result);
			   break;
		   case "4" :
			   System.out.println("--수정--");
			   break;   
		   case "5" :
			   System.out.println("--삭제--");
			   break;
			   default:
				   System.out.println("프로그램 종료");
				   return;
			   
			   
			   
		   }
		
		}

	}

}
