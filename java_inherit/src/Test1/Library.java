package Test1;

public class Library {

	
	String title; //책제목
	String author;//저자
	int booknum; //책 수량
	
	

	public  Library (String title, String author, int booknum) {
		this.title=title;
		this.author=author;
		this.booknum=booknum;
		
	}
	
	public void Books() {
		System.out.println(title+" "+author+" "+booknum+" ");
	}
	
	
}
