package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		//리스트 : 큰가방...
//		ArrayList<Integer> list = new ArrayList<>();
	//  제너릭
    //	Integer=정수
        List<Integer> list = new ArrayList<>(); //리스트 생성 //부모 - List / 자식 - ArrayList
	    System.out.println("list: "+list); //[]
        list.add(1);
	    System.out.println("list: "+list); //[1]
	    list.add(2);
	    System.out.println("list: "+list); //[1,2]
        list.add(300);
	    System.out.println("list: "+list); //[1,2,300]
	  
	    System.out.println("리스트의 길이: "+list.size());
	    
	    System.out.println("리스트의 0번째 인덱스의 값: "+list.get(0));
	    System.out.println("리스트의 1번째 인덱스의 값: "+list.get(1));
	    System.out.println("리스트의 2번째 인덱스의 값: "+list.get(2));
	// System.out.println("리스트의 3번째 인덱스의 값: "+list.get(3));
	    
	    System.out.println("리스트의 길이: "+list.size());
        	    
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println("리스트의"+i+"번째 인덱스의 값: "+list.get(1));
	    }
	    System.out.println("-----------------");

	    list.remove(2); //제거
	    
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println("리스트의"+i+"번째 인덱스의 값: "+list.get(1));

}
	    System.out.println("-----------------");
        
	    list.set(0, 100); //저장
        
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println("리스트의"+i+"번째 인덱스의 값: "+list.get(1));
	    
}
	    System.out.println("-----------------");
	    
	    int i=0;
	    for(Integer a :list ) {//{100,2}
	    	System.out.println("리스트의"+i+"번째 인덱스의 값: "+list.get(1));
	    	i++;
	    }
	    
}
}