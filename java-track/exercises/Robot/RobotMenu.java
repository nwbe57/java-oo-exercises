package Robot;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;
	
	
	public static void main(String[] args) {
		
		int x = 0;
		RobotMenu rm  = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6);

	}
	
	public RobotMenu(){
		
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
		
	}

	public int startMenu(){
		
		System.out.println("Welcome to the Robot Menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please select an option: ");
		
		int selection = s.nextInt();
		while(selection < 0 || selection > 6){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
		
	}
	
	public void processInput(int selection){
		
		if(selection == 1){ ///////////Create a robot
			createRobot();
		}
		else if(selection == 2){ //////////Display all created robots
			displayRobots();
		}
		else if(selection == 3){ //////////Move a robot
			displayRobots();
			Robot r = selectRobot();
			r.move();
		}
		else if(selection == 4){ /////////////Rotate a robot
			displayRobots();
			Robot r = selectRobot();
			rotateRobot(r);
		}
		else if(selection == 5){ ////////////Distance between 2 robots
			displayRobots();
			Robot r = selectRobot();
			Robot r2 = selectRobot();
			System.out.println(r.getDistance(r2));
		}
		
	}
	
	private void displayRobots(){
		for(int i = 0; i < robots.size(); i ++){
			System.out.println((i + 1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void rotateRobot(Robot r){
		if(r.getDirection().equalsIgnoreCase("n")){
			r.setDirection("e");
		}  
		else if(r.getDirection().equalsIgnoreCase("e")){
			r.setDirection("s");
		} 
		else if(r.getDirection().equalsIgnoreCase("s")){
			r.setDirection("w");
		} 
		else if(r.getDirection().equalsIgnoreCase("w")){
			r.setDirection("n");
		} else {
			
		}
		
	}
	
	private void createRobot(){
		System.out.println("Please enter a name for the robot: ");
		String name = s.next();
		
		System.out.println("Please enter an x position for the robot: ");
		int x = s.nextInt();
		
		System.out.println("Please enter a y position for the robot: ");
		int y = s.nextInt();
		
		System.out.println("Please enter a speed for the robot: ");
		int speed = s.nextInt();
		
		System.out.println("Please enter an orientation for the robot (n, e, s, or w): ");
		String direction = s.next();
		robots.add(new Robot(name, speed, x, y, direction));
	}
}
