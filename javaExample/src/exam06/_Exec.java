package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	private static int arg;
	private static String imsi;
	

	public static void main(String[] args) {
		// 이름,국어,영어,수학
		// 이름,국어,영어,수학  총점 평균

		Scanner sc = new Scanner(System.in);
		
		List<String[]>list = new ArrayList<>(); 
		
		while(true) {
	    System.out.println("이름: ");
		String name = sc.nextLine();
		
		if(name.toLowerCase().equals("q")) { //if(name.toUpperCase().equals("Q"))   //if(name.equals("q")||name.equals("Q")) {
			break;
		}
		System.out.println("국어: ");
		String kor_ = sc.nextLine();
		
		System.out.println("영어: ");
		String eng_ = sc.nextLine();
		
		System.out.println("수학: ");
		String math_ = sc.nextLine();
		
		int kor = Integer.parseInt(kor_);
		int eng = Integer.parseInt(eng_);
		int math = Integer.parseInt(math_);
		int tot = kor+eng+math;
		double avg = tot/3.0; //(double)tot/3.0;//(double)tot/(double)3.0;

		// imsi= name+","+kor+","+eng+","+math+","+tot+","+avg;
	    String[]strs = new String[6];
	    strs[0]=name;
	    strs[1]=kor+"";
	    strs[2]=String.valueOf(eng)+"";
	    strs[3]=math+"";
	    strs[4]=tot+"";
	    strs[5]=avg+"";
	    
	    list.add(strs);
	 
		}  	
	  for(int i=0; i<list.size(); i++) {
		  //String[]strs = list.get(i);
		  System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", list.get(i)[0], list.get(i)[1], list.get(i)[2], list.get(i)[3], list.get(i)[4], list.get(i)[5]);
	  }
	//System.out.println("list: "+list);
	
	}

}
