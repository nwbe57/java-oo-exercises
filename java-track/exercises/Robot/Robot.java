package Robot;


public class Robot {
	
	protected String name;
	protected int speed;
	protected int xPosition;
	protected int yPosition;
	protected String direction;
		
		public Robot (String name, int speed, int xPos, int yPos, String dir){
			this.name = name;
			this.speed = speed;
			this.xPosition = xPos;
			this.yPosition = yPos;
			this.direction = dir;
		}
		
		
		public String getName(){
			return this.name;
		}
		public int getSpeed(){
			return this.speed;
		}
		public int getX(){
			return this.xPosition;
		}
		public int getY(){
			return this.yPosition;
		}
		public String getPosition(){
			return "(" + this.xPosition + "," + this.yPosition + ")";
		}
		public String getDirection(){
			return this.direction;
		}
		public void setDirection(String dir){
			if(!dir.equalsIgnoreCase("n") &&
			   !dir.equalsIgnoreCase("s") &&
			   !dir.equalsIgnoreCase("w") &&
			   !dir.equalsIgnoreCase("e")){
				System.out.println("Orientation must be n, s, w, or e.");
			} else {
			this.direction = dir;
			}
			
		}
		
		public void move(){
			if(this.direction.equalsIgnoreCase("N")){
				this.xPosition += this.speed;
			} else if(this.direction.equalsIgnoreCase("S")){
				this.xPosition -= this.speed;
			} else if(this.direction.equalsIgnoreCase("W")){
				this.yPosition -= this.speed;
			} else if(this.direction.equalsIgnoreCase("E")){
				this.yPosition += this.speed;
			} else {
				System.out.println("Cannot move. Must be facing N, S, W, or E.");
			}
		}
		
		public double getDistance(Robot other){
			double dist = 
		       Math.sqrt(Math.pow(other.getX() - this.xPosition, 2) + Math.pow(other.getY() - this.yPosition, 2));
			return dist;
		}
		
		public String toString(){
			return this.name + ", position: " + getPosition() + 
					", speed: " + this.speed + ", facing: " + this.direction;  
		}
		
		
		
	
	public static void main(String[] args) {
		
		Robot r2d2 = new Robot("r2d2", 10, 4, 3, "e");
		Robot c3po = new Robot("c3po", 5, 7, 12, "s");
		
		System.out.println(r2d2.toString());
		System.out.println(c3po.toString());
		
		r2d2.move();
		
		System.out.println(r2d2.getName());
		System.out.println(r2d2.getPosition());
		System.out.println(r2d2.getSpeed());
		
		System.out.println(c3po.getDistance(r2d2));
		
		r2d2.setDirection("n");
		System.out.println(r2d2.getDirection());
		
		System.out.println(r2d2.toString());
		
		
	}

}
