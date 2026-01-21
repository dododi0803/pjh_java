package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberList2 {
     public static void main(String[] args) {
    
 	    List<MemberDTO> list = new ArrayList<>();
 	    
 	    String dbUrl= "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
 	    String dbUsr= "javaUser";
 	    String dbPwd= "1234";
 	    
 	    Connection conn = null;
 	    PreparedStatement pstmt = null;
 	    ResultSet rs = null;
 	    
 	    //예외처리
 	    try {
 	    	Class.forName("com.mysql.cj.jdbc.Driver");
 	    	conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
 	    	//-------------------------------------------------------
 	    	
 	    	String sql = "select * from member order by no desc";
 	    	pstmt = conn.prepareStatement(sql);
 	        rs = pstmt.executeQuery();
 	        while(rs.next()) {
 	        	int no = rs.getInt("no");
 	        	String id = rs.getString("id");
 	        	String password = rs.getString("password");
 	        	String name = rs.getString("name");
 	        	String phone = rs.getString("phone");
 	        	Date createdDate = rs.getDate("createdDate");
 	        	
// 	            MemberDTO memberDTO = new MemberDTO();
// 	            memberDTO.setNo(no);
// 	            memberDTO.setId(id);
// 	            memberDTO.setPassword(password);
// 	            memberDTO.setName(name);
// 	            memberDTO.setPhone(phone);
// 	            memberDTO.setCreatedDate(createdDate);
 	            
// 	        	String[] strs = new String[6];
// 	        	strs[0] =no+"";
// 	        	strs[1] =id;
// 	        	strs[2] =password;
// 	        	strs[3] =name;
// 	        	strs[4] =phone;
// 	        	strs[5] =createdDate+"";
// 	        	
// 	        	
// 	        	
// 	        	strs=no+",";
// 	        	strs+=id+",";
// 	        	strs+=password+",";
// 	        	strs+=name+",";
// 	        	strs+=phone+",";
// 	        	strs+=createdDate+",";
// 	        	
 	        	MemberDTO memberDTO
 	        	=new MemberDTO(no,id,password,name,phone,createdDate);
 	        	
 	        	
 	        	
 	        	
 	        	
 	        	String sql1= "select * from member where id = ?";
		    	pstmt = conn.prepareStatement(sql1);
		    	pstmt.setString(1, id);
		        rs= pstmt.executeQuery(); //0,1
		        while(rs.next()) {
		        	MemberDTO memberDTO1=new MemberDTO();
		        }
	 	        	memberDTO.setNo(rs.getInt("no"));
	 	        	memberDTO.setId (rs.getString("id"));
	 	        	memberDTO.setPassword (rs.getString("password"));
	 	        	memberDTO.setName(rs.getString("name"));
	 	        	memberDTO.setPhone(rs.getString("phone"));
	 	        	memberDTO.setCreatedDate (rs.getDate("createdDate"));
 	        	list.add(memberDTO);
 	        }
 	    	//-------------------------------------------------------
 	    }catch(Exception e) {
 	    	System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
 	    }finally {
 	    	try {
 	    		if(rs!= null) { rs.close();}
 	    		if(pstmt!= null) { pstmt.close();}
 	    		if(conn!= null) {conn.close();}
 	    	}catch(Exception e) {
 	    		e.printStackTrace();
 	    	}
 	    }
 	   for(int i=0; i<list.size(); i++) {
 		//MemberDTO dto =  list.get(i);
 		
 		 // System.out.printf("%s \t %s \t %s \t %s \t %s\n",list.get(i).getNo() dto.getNo(), dto.getId(), dto.getName(), dto.getPhone(), dto.getCreatedDate() );
 	    System.out.println(i+"."+list.get(i));
 	   }
 	}

 


	}


