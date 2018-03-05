import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
/*
	@Test
	public void test_0팩토리얼은_1() {
//		fail("Not yet implemented");
		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(0));
	}
	
	@Test
	public void test_1팩토리얼은_1() {
		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(1));
	}
*/	
	//위에는 리팩토링 전
	//아래는 리팩토링 후
	
	Factorial fac;
	
	@Before
	public void setup() {
		fac = new Factorial();
	}
	
	@Test
	public void test_0팩토리얼은_1() {
//		fail("Not yet implemented");
//		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(0));
	}
	
	@Test
	public void test_1팩토리얼은_1() {
//		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(1));
	}
	
	@Test
	public void test_2팩토리얼은_2() {
//		Factorial fac = new Factorial();
		assertEquals(2, fac.calc(2));
	}
	
	@Test
	public void test_3팩토리얼은_6() {
//		Factorial fac = new Factorial();
		assertEquals(6, fac.calc(3));
	}
	
	@Test
	public void test_10팩토리얼은() {
//		Factorial fac = new Factorial();
		assertEquals(10*9*8*7*6*5*4*3*2*1, fac.calc(10));
	}
	
	@Test(expected=RuntimeException.class)
	public void test_음수팩토리얼은예외발생() {
//		Factorial fac = new Factorial();
		fac.calc(-10);
	}
	
	@Test
	public void test_양수팩토리얼() { //테스트케이스도 리팩토링이 가능
//		Factorial fac = new Factorial();
		int values[][] = {
				{0,1}, {1,1}, {2,2}, {3,6}
		};
		for (int[] value : values) {
			assertEquals(value[1], fac.calc(value[0]));
		}
		
	}

}
