import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		Calculator c = new Calculator();
		assertEquals(c.sum(10, 20), 30); //초록불이 나와야 한다
	}

	@Test(timeout=3000)
	public void testFac() {
		Calculator c = new Calculator();
		assertEquals(c.fac(1), 1);
		assertEquals(c.fac(2), 2);
		assertEquals(c.fac(10), 3628800);
	}
}
