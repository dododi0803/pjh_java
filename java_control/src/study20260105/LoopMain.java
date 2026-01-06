package study20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		
		
//		
//		for(int i =1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		
		
//		for(int i =1; i<=100; i++) {
//		if(i%10==0)
//			System.out.println(i);
//		}
//		
		
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 입력: ");
//		int num =sc.nextInt();
//		
//		for(int i=1; i<=num; i++) {
//			System.out.println(i);
//		}
		
		
		
		
		
	
		// 1부터 12까지 출력하는데
	    // 4의 배수에는 four라고 출력하시오.
//		for(int i=1; i<=12; i++) {
//			if (i%4==0) {
//				System.out.println("four");
//			}else {
//				System.out.println(i);
//			}
//			
//		} 
		
		
//		int count=0;
//		//17의 배수는 몇개인가?
//		for(int i=1; i<=1000; i++) {
//			if(i%17==0) {
//				count++;
//			}
//		}
//		System.out.println("17의 배수: "+count+"개");
		
		// 문제
		// 동전 앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기
		
		
//		int  count=0;
//		for(int i=1; i<=10; i++) {
//			if(i%2==0) {
//				count++;
//			}
//		}
//		System.out.println("맞춘 횟수: "+count+"번");
		
		
//		
//		int  count=0;
//		for(int i=1; i<=10; i++) {
//			int com = (int)Math.floor(Math.random()*2)+1;
//			System.out.println("1-앞면, 2-뒷면");
//			int user = sc.nextInt();
//			
//		    System.out.println("맞춘 횟수: "+count+"번");
//		}
		
		
		
//		int ok =0; //내가 맞춘건지 누적저장 변수
//		
//		for(int i=1; i<=10; i++) {
//			int coin =(int)Math.floor(Math.random()*2)+1;
//			//1-앞면, 2- 뒷면
//			System.out.println("동전 앞면 뒷면 맞추기");
//			System.out.println("1-앞면, 2-뒷면 \n 입력: ");
//		    int user = sc.nextInt();
//		    
//		    if(user == coin) {
//		    	System.out.println("맞추기 성공!!!");
//		    	
//		    	ok++;
//		    }else
//		    	System.out.println("맞추기 실패...");
//		}
//		System.out.println("내가 맞춘 횟수: "+ok);
//		
		
		
		
		
		
		//무한루프 - 반복문은 조건식이 참인경우에 계속 반복 수행을 한다.
		// 무조건 참이 되게 조건식을 설정하면 무한 반복을 할수 있다.
		// 무한루프는 지정된 횟수가 없기에 멈추지 않고 계속 동작한다.
		// 그래서 무한루프 구현시 특정 조건을 걸얻 둔다.
//		
//		for( ; true ;) {
//			
//		}
//		
//		for(;;) {
//			;
//		}
//		
//		while(true) {
//			System.out.println("나는 무한루프이다.");
//		}
//		
//		int i=10;
//		while
//		
		
		
		

			
			
			
	
		    
		
		
		
		
		
		
		
		
		
		
		
		
//		int com =(int)Math.floor(Math.random()*50)+1;
//		while(true) {
//			System.out.println("1~50중 입력: ");
//			int user = sc.nextInt();
//	
//		    if(user > com) {
//		    	System.out.println("DOWN");
//		    }
//		    if(user < com) {
//		    	System.out.println("UP");
//		}
//		    if(user == com) {
//		    	System.out.println("정답!");
//	          break;	   
//		}
//		}
	
		
		
		
		
		
		
		
		/*
		 1월5일 과제
		 
		 가위 바위 보 게임을 총 15판 진행
		 게임을 진행하면서 한판 끝날때마다 
		 몇승,몇패,몇무 출력하기
		
	
		 int winCount=0, loseCount=0, drawCount =0;
		 
		 for(int i=1; i<15; i++) {
		 int com =(int)Math.floor(Math.random()*3)+1;
		 System.out.println("1-가위,2-바위,3-보: ");
		 int user = sc.nextInt();
		
         System.out.println("컴퓨터: "+com+"나:"+user);
         
         int res= user-com;
         if(res == 0) {
         System.out.println("비김");
               drawCount++;
        }else if(res==-2||res==1) {
         System.out.println("나의 승리");
           winCount++;
           }else {
            System.out.println("나의 패배");
             loseCount++
		 }
		  System.out.println("승:"+winCount+"패:"+loseCount+"무:"+drawCount);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
	
		
//		
//     	int com =(int)Math.floor(Math.random()*3)+1;
//		System.out.println("1-가위,2-바위,3-보: ");
//		int user = sc.nextInt();
//		
//        System.out.println("컴퓨터: "+com+"나:"+user);
//		
//		
//        if(user>com || (user ==1 && com==2)) {
// 		   if(user ==2 && com ==1) {
// 				System.out.println("나의 승");
// 		   }else if(user ==1 && com ==2)
// 			System.out.println("나의 패");
// 		}else if(user ==2 && com ==3) {
// 			System.out.println("나 승");
// 		}else if(user ==3 && com ==2){
// 			System.out.println("나의 패배...");
// 		}
//		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		/*
		반복문-for,while,do~while
		반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정이다. 또는 횟수의 제한없이 동작 시킬 수 있다.
		
		
		for문
		for(초기값; 조건식; 즈감식) {
		반복 실행할 내용;
		반복 길행 할 내용;
		}
		for(int i ==1; i<=5; i++){
		
		}
		
		
		for( Member m :  MemberList){
		
		}
		
		
		
		 */

	}

}
