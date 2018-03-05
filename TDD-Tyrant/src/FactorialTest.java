import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
/*
	@Test
	public void test_0���丮����_1() {
//		fail("Not yet implemented");
		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(0));
	}
	
	@Test
	public void test_1���丮����_1() {
		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(1));
	}
*/	
	//������ �����丵 ��
	//�Ʒ��� �����丵 ��
	
	Factorial fac;
	
	@Before
	public void setup() {
		fac = new Factorial();
	}
	
	@Test
	public void test_0���丮����_1() {
//		fail("Not yet implemented");
//		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(0));
	}
	
	@Test
	public void test_1���丮����_1() {
//		Factorial fac = new Factorial();
		assertEquals(1, fac.calc(1));
	}
	
	@Test
	public void test_2���丮����_2() {
//		Factorial fac = new Factorial();
		assertEquals(2, fac.calc(2));
	}
	
	@Test
	public void test_3���丮����_6() {
//		Factorial fac = new Factorial();
		assertEquals(6, fac.calc(3));
	}
	
	@Test
	public void test_10���丮����() {
//		Factorial fac = new Factorial();
		assertEquals(10*9*8*7*6*5*4*3*2*1, fac.calc(10));
	}
	
	@Test(expected=RuntimeException.class)
	public void test_�������丮�������ܹ߻�() {
//		Factorial fac = new Factorial();
		fac.calc(-10);
	}
	
	@Test
	public void test_������丮��() { //�׽�Ʈ���̽��� �����丵�� ����
//		Factorial fac = new Factorial();
		int values[][] = {
				{0,1}, {1,1}, {2,2}, {3,6}
		};
		for (int[] value : values) {
			assertEquals(value[1], fac.calc(value[0]));
		}
		
	}

}
