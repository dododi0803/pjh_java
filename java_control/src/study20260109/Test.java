package study20260109;

public class Test {

	private static int sum;
	private static int total;

	public static void main(String[] args) {
		
//		//문제 1.
//		
//		String name = "홍길동";
//	      int age = 25;
//	      double height = 175.5;
//	      String gender = "남";
//	      boolean student = true;
//	      
//	      System.out.println("이름 : "+name);
//	      System.out.println("나이 : "+age);
//	      System.out.println("키 : "+height);
//	      System.out.println("성별 : "+gender);
//	      System.out.println("학생 여부 : "+student);
//	      
//	      
//	      //문제 2.
//	      
//	      
//		
//		
//		 //문제 3.
//	     // 사각형 넓이 공식 가로*세로
//        
//	     int width = 8;
//	     int height1 = 5;
//	     int area;
//	     
//	     System.out.println("사각형의 넓이: "+(width*height1));
//	      
//	      
//	     //문제 4.
//	     
//	     int kor=85;
//	     int eng=90;
//	     int mathe=78;
//	     int total;
//	     int average;
//	     
//	     System.out.println("total: "+(kor+eng+mathe));
//	     System.out.println("averae: "+(kor+eng+mathe)/3);
//	     
//	     
//	     //문제 5.
//	     
//	     //문제 6.
//	     
//	     int score=72;
//	     
//	     if(score>=60) {
//	    	 System.out.println("합격");
//	     }else {
//	    	 System.out.println("불합격");
//	     }
//	     
//	     //문제 7.
//	     
//	    int num=100;
//	     
//	     
//	     if(num>=90) {
//	    	 System.out.println('A');
//	     }else if(num>=80) {
//	    	 System.out.println('B');
//	     }else if(num>=70) {
//	    	 System.out.println('C');
//	     }else if(num>=60) {
//	    	 System.out.println('D');
//	     }else {
//	    	 System.out.println('F');
//	     }
//	      
//	     
//	     //문제 8.
//	     
//	     int n = 10;
//	     int sum = 0;
//	     for(int n1=1; n1<=10; n1++) {
//	    	sum+=n1;
//	     }
//	     System.out.println(sum);
//	     
         //문제 9.
		
	    int[]arr= {10,20,30,40,50};
	    
	    for(int i=0; i<arr.length; i++) {
	    	total+=arr[i];
	    
	    }
	    System.out.println("총점:"+total);
	    System.out.println("average: "+(total/5));
		
		
	     
//	     //문제 10.
//	     
//	     int[]scores = {87,65,92,100,74};
//	     
//	     
//	     int Maximum = scores[0];
//	     int Minmum =  scores[0];
//	     
//	     for(int i=0; i<scores.length; i++) {
//	    	if( scores[i]>Maximum) {
//	    		Maximum= scores[i];
//	    	
//	    	}
//	    	if( scores[i]<Minmum) {
//	    		Minmum= scores[i];
//	    	}
//	     }
//	     System.out.println(Maximum);
//	     System.out.println(Minmum);
//	     
	     
	    //문제 11.
	    
	    int[]nums = { 3,8,15,22,7,10};
	    int result=0;
	    
	    
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i]%2==0) {
	    	result+=nums[i];
			
	    	}else if(nums[i]%2==1) {
	    		result-=nums[i];
	    	}
	    	
	    }
	    System.out.println(result);	
    		
	    
	}

}
