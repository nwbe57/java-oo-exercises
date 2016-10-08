package studio1;

public class BaseballPlayer {
	
	String name;
	Integer number; //jersey number
	String swings; //R, L, or SW
	
	Integer rbis;
	Integer runs;
	Integer hits;
	Integer games;
	
	
	public BaseballPlayer (String name, int number, String swings, int games,
			                int rbis, int runs, int hits){
		
		this.name = name;
		this.number = number;
		this.swings = swings;
		this.rbis = rbis;
		this.runs = runs;
		this.hits = hits;
		this.games = games;
		
		this.runs = 0;
		this.hits = 0;
		this.rbis = 0;
		this.games = 0;
		
	}
	
	public String getName(){
		return this.name;
	}
	public int getNumber(){
		return this.number;
	}
	public String getSwings(){
		return this.swings;
	}
	public int getRbis (){
		return this.rbis;
	}
	public int getRuns (){
		return this.runs;
	}
	public int getHits(){
		return this.hits;
	}
	public int getGames(){
		return this.games;
	}
	
	public int addRbis(int rbis){
		this.rbis += rbis;
		return this.rbis;
	}
	public int addRuns(int runs){
		this.runs += runs;
		return this.runs;
	}
	public int addHits(int hits){
		this.hits += hits;
		return this.hits;
	}
	
	
	public String CompletedGame (){
		
		this.games ++;
		return getName() + ", #" + getNumber() + ", " + getSwings() + ", " + getGames() + " games played, "
						+ "hits=" + getHits() + ", runs=" + getRuns() + ", rbis=" + getRbis();
		
	}
	
	

	public static void main(String[] args) {
		BaseballPlayer Burns = new BaseballPlayer("Burns", 13, "R", 0, 0, 0, 0);
		Burns.addHits(2);
		Burns.addRbis(1);
		Burns.addRuns(2);
		
		
		System.out.println(Burns.CompletedGame());
		
		Burns.addHits(3);
		
		System.out.println(Burns.CompletedGame());

	}

}
