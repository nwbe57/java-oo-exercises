package studio2;

import static org.junit.Assert.*;

import org.junit.Test;

import studio1.Fraction;

public class FractionTest {

	@Test
	public void testGetNum() {
		Fraction testFrac0 = new Fraction(4, 4);
		Fraction testFrac1 = new Fraction(5, 4);
		assertTrue("problem with testGetNum" , testFrac0.getNum() == 4);
		assertTrue("problem with testGetNum" , testFrac1.getNum() == 5);
	}
	
	@Test
	public void testGetDenom() {
		Fraction testFrac0 = new Fraction(4, 4);
		Fraction testFrac1 = new Fraction(4, 5);
		assertTrue("problem with testGetDenom" , testFrac0.getDenom() == 4);
		assertTrue("problem with testGetDenom" , testFrac1.getDenom() == 5);
	}

	@Test
	public void testGetSum() {
		Fraction testFrac0 = new Fraction(4, 4);
		Fraction testFrac1 = new Fraction(4, 5);
		Fraction testFrac2 = new Fraction(8, 13);
		String ans1 = testFrac0.getSum(testFrac1);
		String ans2 = testFrac1.getSum(testFrac2);
		String ans3 = testFrac0.getSum(testFrac2);
		assertEquals("problem with testGetSum", "9/5" , ans1);
		assertEquals("problem with testGetSum", "92/65" , ans2);
		assertEquals("problem with testGetSum", "21/13" , ans3);
	}
	
	@Test
	public void testGetProduct() {
		Fraction testFrac0 = new Fraction(4, 4);
		Fraction testFrac1 = new Fraction(4, 5);
		Fraction testFrac2 = new Fraction(8, 13);
		String expectedResult = testFrac0.getProduct(testFrac1);
		String expectedResult1 = testFrac1.getProduct(testFrac2);
		String expectedResult2 = testFrac0.getProduct(testFrac2);
		assertEquals("problem with testGetProduct" , "4/5", expectedResult);
		assertEquals("problem with testGetProduct" , "32/65", expectedResult1);
		assertEquals("problem with testGetProduct" , "8/13", expectedResult2);
	}
	
	@Test
	public void testGetReciproc() {
		Fraction testFrac0 = new Fraction(10, 4);
		Fraction testFrac1 = new Fraction(4, 5);
		Fraction testFrac2 = new Fraction(8, 13);
		String ans1 = testFrac0.getReciproc();
		String ans2 = testFrac1.getReciproc();
		String ans3 = testFrac2.getReciproc();
		assertEquals("problem with testGetReciproc" , "2/5", ans1);
		assertEquals("problem with testGetReciproc" , "5/4", ans2);
		assertEquals("problem with testGetReciproc" , "13/8", ans3);
	}
	
	@Test
	public void testSimplify() {
		Fraction testFrac0 = new Fraction(24, 92);
		Fraction testFrac1 = new Fraction(4, 160);
		Fraction testFrac2 = new Fraction(8, 248);
		String ans1 = testFrac0.Simplify();
		String ans2 = testFrac1.Simplify();
		String ans3 = testFrac2.Simplify();
		assertEquals("problem with testSimplify" , "6/23", ans1);
		assertEquals("problem with testSimplify" , "1/40", ans2);
		assertEquals("problem with testSimplify" , "1/31", ans3);
		
	}
}
