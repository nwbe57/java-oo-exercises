package studio4;

import static org.junit.Assert.*;


import org.junit.Test;


public class PostAndUserTest {
	
	

	@Test
	public void testIsValidUsername() {
		User x = new User("aaaaa", "12");
		User y = new User("aaa", "12345");
		assertTrue(x.isValidUsername(x.getUserName()));
		assertFalse(y.isValidUsername(y.getUserName()));
	}
	

}
