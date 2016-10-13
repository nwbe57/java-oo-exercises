package Robot;


public class Robot {
	
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	public enum Direction {

	    NORTH, SOUTH, EAST, WEST;

	    private Direction opposite;

	    static {
	        NORTH.opposite = SOUTH;
	        SOUTH.opposite = NORTH;
	        EAST.opposite = WEST;
	        WEST.opposite = EAST;
	    }

	    public Direction getOppositeDirection() {
	        return opposite;
	    }

	}
		
		public Robot (String name, int speed, int xPos, int yPos){
			this.name = name;
			this.speed = speed;
			this.xPosition = xPos;
			this.yPosition = yPos;
			
		}
		
		
		public String getName(){
			return this.name;
		}
		public int getSpeed(){
			return this.speed;
		}
		public String getPosition(){
			return this.xPosition + ", " + this.yPosition;
		}
		
		
		
	
	public static void main(String[] args) {
		
		Robot r2d2 = new Robot("r2d2", 10, 4, 3);
		
		System.out.println(r2d2.getName());
		System.out.println(r2d2.getPosition());
		System.out.println(r2d2.getSpeed());
		
		
		
	}

}
