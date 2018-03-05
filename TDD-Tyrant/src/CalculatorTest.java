import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		Calculator c = new Calculator();
		assertEquals(c.sum(10, 20), 30); //�ʷϺ��� ���;� �Ѵ�
	}

	@Test(timeout=3000)
	public void testFac() {
		Calculator c = new Calculator();
		assertEquals(c.fac(1), 1);
		assertEquals(c.fac(2), 2);
		assertEquals(c.fac(10), 3628800);
	}
}
