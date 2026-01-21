package test;

public abstract class Attack extends Skill {

	public Attack(String name, int manaCost, String description) {
		super(name, manaCost, description);
		
	}

	@Override
	public Object apply(Character character) {
		return ( physical - Enemy );
	}

}
