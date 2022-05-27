import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21031099, 27 May 2022 1:09:15 pm
 */

public class CalculatorTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 1;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 2;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 2;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 2;
		assertEquals (expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
