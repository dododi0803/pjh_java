package study20260107;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] seats = new int[50];
		
		int[] res= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,
				                 33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		for(int i=0; i<10; i++) {
			for(int k=0; k<10; k++) {
				System.out.println("예약인원수:"+res+"연속좌석이 없습니다.");
			}
		}
	}

}
  