package Robot;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTests {

	@Test
	public void testGetPosition() {
		
		int xpos = (int)(Math.random());
		int ypos = (int)(Math.random());
		int speed = (int)(Math.random());
		
		Robot x = new Robot("x", speed, xpos, ypos, "n");
		
		assertEquals("Problem with getX()", x.getX(), xpos);
		assertEquals("Problem with getY()", x.getY(), ypos);
		assertEquals("Problem with getPosition()", x.getPosition(), "(" + xpos + "," + ypos + ")");
		
	}
	
	@Test
	public void testMove() {
		
		int xpos = (int)(Math.random());
		int ypos = (int)(Math.random());
		int speed = (int)(Math.random());
		
		Robot x = new Robot("x", speed, xpos, ypos, "n");
		
		assertEquals("Problem with getSpeed()", x.getSpeed(), speed);
		assertEquals("Problem with getDirection()", x.getDirection(), "n");
		x.move();
		assertEquals("Problem with move()" , x.getPosition(), "(" + (xpos + speed) + "," + ypos + ")");
		
	}
	
	@Test
	public void testGetDistance() {
		
		int xpos = (int)(Math.random());
		int ypos = (int)(Math.random());
		int speed = (int)(Math.random());
		
		int xpos2 = (int)(Math.random());
		int ypos2 = (int)(Math.random());
		int speed2 = (int)(Math.random());
		
		double distance = Math.sqrt(Math.pow(xpos - xpos2, 2) + Math.pow(ypos - ypos2, 2));
		
		Robot x = new Robot("x", speed, xpos, ypos, "n");
		Robot y = new Robot("y", speed2, xpos2, ypos2, "s");
		
		assertEquals("Problem with getDistance()", x.getDistance(y), distance, 0.1);
	}
	
	@Test
	public void testGetLoudness_Duration() {
		
		int xpos = (int)(Math.random());
		int ypos = (int)(Math.random());
		int speed = (int)(Math.random());
		int loudness = (int)(Math.random());
		int duration = (int)(Math.random());
		
		LaughBot x = new LaughBot("x", speed, xpos, ypos, "n", duration, loudness);
		
		assertEquals("Problem with getLoudness()", x.getLoudness(), loudness);
		assertEquals("Problem with getDuration()", x.getDuration(), duration);
	}

	@Test
	public void testGetForce_Location() {
		
		int xpos = (int)(Math.random());
		int ypos = (int)(Math.random());
		int speed = (int)(Math.random());
		int force = (int)(Math.random());
		String location = "face";
		
		PunchBot x = new PunchBot("x", speed, xpos, ypos, "n", force, location);
		
		assertEquals("Problem with getForce()", x.getForce(), force);
		assertEquals("Problem with getLocation()", x.getLocation(), location);
	}
	
}
