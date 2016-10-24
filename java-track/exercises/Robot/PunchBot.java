package Robot;

public class PunchBot extends Robot{
	
	private int force;
	private String location;
	
	public PunchBot(String name, int speed, int xPos, int yPos, String dir, int force, String location){
		super(name, speed, xPos, yPos, dir);
		this.force = force;
		this.location = location;
	}
	
	public int getForce(){
		return this.force;
	}
	public String getLocation(){
		return this.location;
	}

	public static void main(String[] args) {
		

	}

}
