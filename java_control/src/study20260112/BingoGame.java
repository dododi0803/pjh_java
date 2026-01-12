package study20260112;

public class BingoGame {
 
	 // 사용자명, 레벨, 승, 패, 무
	// 저장할 수 있는 객체가 생성될 수있게 만들기
	
	//모든 인스턴스변수는 private으로 
	// 생성자메서드를 통해 사용자명, 레벨, 승, 패, 무
	// 입력받을 수 있게 하기
	// 출력메서드 만들기
	
	
	private String name;
	private int Level;
	private int win; 
    private int	loser; 
    private int	tie;
    
    public BingoGame() {}
	public BingoGame(String name,int Level,int win, int loser,int tie) {
	 this.name=name;
	 this.Level=Level;
	 this.win=win;
	 this.loser=loser;
	 this.tie=tie;
	}
	public String toString() {
		return name+" : "+Level+" : "+win+" : "+loser+" : "+tie+" : ";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		this.Level = level;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		if(win<0) {
			System.out.println("잘못된 것입니다");
			return;
		}
		this.win = win;
	}
	public int getLoser() {
		return loser;
	}
	public void setLoser(int loser) {
		this.loser = loser;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	
	// private 지정된 변수 사용법
	// private 접근제어자는 내부에서만 사용가능
	// 외부에서 사용되기 위해 변수들의 set,get 메서드롬
	// 
}