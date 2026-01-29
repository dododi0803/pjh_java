package teamproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BooksDAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dbUrl= "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
	    String dbUsr= "library";
	    String dbPwd= "1234";
		
	    Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
	    }catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
        while (true) {
            System.out.print("선택(1.등록 2.수정 3.삭제 4.목록 5.종료)");
            String menu =sc.nextLine();
            
            if(menu.equals("1"))
            		ProjectInsert.insert(conn,sc);
            else if(menu.equals("2"))
            	ProjectUpdate.update(conn, sc);
            else if(menu.equals("3"))
            	ProjectDelete.delete(conn,sc);
            else if (menu.equals("4"))
            	BookList.list(conn );
            else if(menu.equals("5"))
            	break;
            	
        }
	    
	}
	
}
	


