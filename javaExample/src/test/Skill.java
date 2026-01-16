package test;

public abstract class Skill {

	public static void main(String[] args) {
		
	}



	private String name;
	private int manaCost;
	private String description;


	public Skill(String name,int manaCost,String description) {
		this.name=name;
		this.manaCost=manaCost;
		this.description=description;
	}
	
	public abstract int apply(Character character);
}
