package study20260113;

import java.util.Scanner;

public class UserService {
	
    private Scanner sc= new Scanner(System.in);
	private User[] users;
//	private User[] users;   
//    // 아이디 찾기 메서드
//	// 이름을 입력하여 아이디 찾기 할것이다.
//	public void findId(User[]users) {
//	    System.out.println("==== 아이디 찾기 ====");	
//	    System.out.println("이름 입력 : ");
//	    String name = sc.nextLine();
//	    
//	    for(User user : users) {
//	    	if(user.getName().equals(name) ) {
//	    		System.out.println("ID : "+user.getId());
//	            break;    	
//	    	}
//	    }
//	}
	
	// 비밀번호 찾기  메서드
	// 아이디와 연락처를 입력하면 비밀번호를 변경할수있다.
	
//	public void findPasswoed(User[]users) {
//		System.out.println("==== 비밀번호 찾기 ====");
//		System.out.print("아이디 입력 : ");
//		String id=sc.nextLine();
//		System.out.println("연락처 입력 : ");
//	    String tel = sc.nextLine();
//	    
//	    
//	    boolean isDis = true;
//	    for(User user : users) {
//	    	if(user.getId().equals(id) && user.getTel().equals(tel)) {
//	    		System.out.println("변경할 비번입력: ");
//	    		String pw=sc.nextLine();
//	    	    user.setPassword(pw);
//	    	    isDis = false;
//	    	    break;
//	    	}
//	    }
//	    if(isDis) {
//	    	System.out.println("일치하는 정보가 없습니다. 다시 입력하세요.");
//	    }
//	}
//	
//	 로그인 메서드
//	 아이디와 비밀번호를 입력하여 로그인하기
//	 아이디와 비밀번호가 일치하면 "로그인성공" 출력
//	 일치하지 않으면 "아이디 또는 비밀번호가 잘못되었습니다." 출력
	
   
	public void Login(User[]user) {
		System.out.println("==== 로그인 ====");
		System.out.println("아이디 입력: ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String pw = sc.nextLine();
		
		User temp = isID(user, id); //입력한 아이디와 일치하는 User객체찾기
		if(temp.getPassword().equals(pw)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		}
		
//		boolean islogin =true;
//		for(User user1 : users) {
//			if(user1.getId().equals(id) && user1.getPassword().equals(pw)) {
//				System.out.println("로그인성공");
//				islogin=false;
//				break;
//		
//			}
//			}
//		if(islogin) System.out.println("아이디또는 비밀번호가 잘못되었습니다.");
			}
	
	private User isID(User[]users, String id) {
		for(User user:users) {
			if(user.getId().equals(id)) return user;
			//아이디가 일치하는 User 객체를 반환
		}
		
		return new User(); // 일치하는 아이디가 없다면 null반환
	}
	
}
// 데이터를 저장관리하기 위한 클래스에서
// 데이터 필터링이나, 파일저장(DB), 불러오기
// 등등을 수행하지 않는다.
// 데이터 저장 관리하기 위한 클래스에서는
// 저장에 관해 메서드를 주로 만들고
// 데이터 변환에 대해서만 만든다.