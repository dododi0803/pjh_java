package exam07;

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
		
	//	List<String[]>list = new ArrayList<>(); 
		List<Student>list = new ArrayList<>(); 

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
		int mat = Integer.parseInt(math_);
	
		
		Student student = new Student(name,kor,eng,mat);
	
		list.add(student);
		
		}
		for(int i=0; i<list.size(); i++) {
			list.get(i).display();
//			Student s = list.get(i);
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",s.getName()
//					,s.getKor(),s.getEng(),s.getMat());
			
			
			
			
			
		}
	}

}
