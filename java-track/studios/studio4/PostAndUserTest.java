package studio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostAndUserTest {
	
	

	@Test
	public void IsValidUsernameTest() {
		boolean ansF = false;
		boolean ansT = true; 
		assertEquals("aaaaa", ansT);
		assertEquals(" ", ansF);
	}
	
	@Test
	public void isValidPassword(){
		boolean ansF = false;
		boolean ansT = true; 
		assertEquals("aaaaa", ansT);
		assertEquals(" ", ansF);
	}

}
