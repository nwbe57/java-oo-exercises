package Robot;

public class LaughBot extends Robot{
	
		private int loudness;
		private int duration;
	
	public LaughBot(String name, int speed, int xPos, int yPos, String dir, int duration, int loudness){
		super(name, speed, xPos, yPos, dir);
		this.loudness = loudness;
		this.duration = duration;
	}
	
	public int getLoudness(){
		return this.loudness;
	}
	public int getDuration(){
		return this.duration;
	}
	
	public static void main(String[] args) {
		

	}

}
