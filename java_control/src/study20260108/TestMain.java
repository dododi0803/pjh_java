package study20260108;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// 이정도 까지는 해야 된다 - 배열 실습
		// 문제 1. 10개의 무작위 정수 값 저장하기 (배열에)
		// 랜덤 범위는 1~50
//		 Scanner sc= new Scanner(System.in);
//         System.out.println(" ");
          
         
         
         
         
//	   int[]num1 = new int[10];
//	   
//	   for(int i=0; i<num1.length; i++) {
//		   num1[i]=(int)Math.floor(Math.random()*50)+1;
//	   }
//	   for(int k=0; k<num1.length; k++) {
//		   System.out.println(num1[k]);
//	}  
// ----------------------------------------------------------------------------------	
//	
//         int[]num = new int[10];
//         for(int i=0; i<num.length; i++) {
//        	 num[i]=(int)(Math.random()*50)+1;
//         }
//         for(int n:num)
//        	 System.out.println(n);
         
         // System.out.println(Arrays.toString(num));
         
         
         
         // 문제 2.
         // int[] score = {99,66,77,56,78,98,83};
         // 1학년 3반 학생들의 성적을 배열에 저장하였다.
         // 3학년 학생들 성적의 평균값을 구하세요.
         // 반복문 이용 하세요!! 반드시
         
//         Scanner sc= new Scanner(System.in);
//         
//     
//         int[] score = {99,66,77,56,78,98,83};
//         
//         System.out.println(score);
//         
//         
//         int  num=0; 
//         
//         for(int i=0 ; i<score.length ; i++) {
//        	num=num+score[i];
//         }
//         
//         double average = (double) num / score.length;
//         System.out.println("평균값: " + average);
//         
//         ==========================================================
		
//		
//		int[] score = {99,66,77,56,78,98,83};
//		int total = 0; //성적의 총합을 저장 할 변수
//		
//		for (int i=0; i< score.length; i++) {
//			total= total+score[i];
//			
//		}
//	 
//		int avg = total/ score.length;
//		System.out.println("평균: "+avg);
	
	
	
	
	    // 문제 3. 정수 10개를 저장할수 있는 배열을 선언
		// 1~50의 무작위값 저장 하기
		// 배열의 첫번째 값과 마지막 값 출력
//		Scanner sc=new Scanner(System.in);
		
	   
	
//		int[] num = new int[10];
//		
//		for(int i=0; i<num.length; i++) {
//		  num[i]=(int)Math.floor(Math.random()*50)+1;
//		 
//		}
//		 System.out.println("첫번째 값: "+num[0]);
//		  System.out.println("마지막 값: "+num[num.length-1]);
	
	
//  ============================================================================
		
//		int a=0;
//		int[] b= new int [1];
//		Scanner aaa = new Scanner (System.in);
//		String st = new String();
		
		
//		================================================================================
		
//		int[]arr = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] =(int)(Math.random()*50)+1;
//		}
//	System.out.println("첫번째 값 : "+arr[0]+ "두번째 값 : "+arr[arr.length-1]);
//	
	// 문제4. 문제3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하세요.
	
	
	
//	for(int i=0; i<arr.length; i++) {
//	 if(arr[i]%2==0) {
//		 System.out.println(arr[i]);	 
//	 }
//		
//	}
	
//	=====================================================================
	
//	for(int n:arr) {
//		if(n%2==0) 
//			System.out.println(n);
//	}
	
	
	// 문제 5. 마지막
	// int[] temp={6,0,5,-2,0,4,6,0}
	// temp 배열은 일별 최고기온을 저장 한것이다.
	// 배열에 저장된 기온중 가장 높은 기온과 가장 낮은 기온을 찾으세요
	// 0번 인덱스의 기온은 12월 11일 데이터이다.
	// 가장 높은 기온의 날짜와 가장 낮은기온의 날짜도 출력 하세요
	// (가장 높은 기온, 가장 낮은 기온만 찾아서 출력하는 것만 해도 성공!)
	// 힌트 int max = temp[0];
	//     int min = temp[0];
	
	
	int[] temp={6,0,5,-2,0,4,8,0};
	
	
	int max=temp[0];
	int min=temp[0];
	
	
	
	for(int i=0; i<temp.length; i++) {
	  if(max<temp[i]) max = temp[i]; // 가장 높은 값 찾기

	  if(min>temp[i]) min = temp[i]; // 가장 낮은 값 찾기
	  
	}
	
	System.out.println("가장 높은 기온: "+max);
	System.out.println("가장 낮은 기온: "+min);
	
	// 0번 인덱스의 기온은 12월 11일이다.
	// 가장 높은 기온이 몇번쨰 인덱스에 있는지 찾아야 한다.
	
    for(int i=0; i<temp.length; i++) {
    	if(temp[i] ==  max) {
    		System.out.println("가장높은 기온: "+max+"날짜: 12월"+(i+11)+"일");
    	}
    	if(temp[i] ==  min) {
    		System.out.println("가장낮은 기온: "+min+"날짜: 12월"+(i+11)+"일");
    }
	
	
	}
    
    
    int maxDay = Arrays.asList(temp).indexOf(max);
    int minDay = Arrays.asList(temp).indexOf(min);
    System.out.println("가장높은 기온: "+maxDay+"날짜: 12월"+maxDay+"일");
    System.out.println("가장낮은 기온: "+minDay+"날짜: 12월"+minDay+"일");
    

}
}
