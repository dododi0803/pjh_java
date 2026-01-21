package exam04;

public class Student0 {

	public static Student0 student0;
	public static Student0 s1;
	public static Student0 s2;
	public static Student0 s3;
	String name;
	int score;
	
	Student0(String name, int score){
		this.name=name;
		this.score=score;
	}

	@Override
	public String toString() {
		return name + "(" + score + ")";
	}
	
}
