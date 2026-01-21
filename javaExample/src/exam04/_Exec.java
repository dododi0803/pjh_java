package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	private static Student0 s1;
	private static Student0 s2;
	private static Student0 s3;

	public static void main(String[] args) {
		
  
//		Student0.s1=new Student0("홍길동",80);
//		Student0.s2=new Student0("이순대",90);
//		Student0.s3=new Student0("김자반",100);
//		
		List<Student0>list=new ArrayList<>();
		list.add(new Student0("홍길동", 80)); //[s1]
		list.add(new Student0("이순대", 90)); //[s1,s2]
		list.add(new Student0("김자반", 100)); //[s1,s2,s3]
		
		
		//람다를이용한 정렬(점수 내림차순)
		
		// list.sort((s1.s2)->s2.score-s1.score);
	
		System.out.println("성적순 정렬 결과:");
		System.out.println(list);
	}

}
