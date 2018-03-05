import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitExamMainTest {
	JUnitExamMain jem; //����� �÷ȴ�.
	
//	@Test
//	public void testJUnitExamMain() {
//		fail("Not yet implemented");
//	}
	
	@BeforeClass	
	public static void setUpClass() { //�ݵ�� static
		System.out.println("setupclass is called");
	}
	
	@AfterClass	
	public static void teardownClass() { //�ݵ�� static
		System.out.println("teardownClass is called");
	}
	
	@Before //beforeclass�� ������ ó�� �ѹ���, before�� �� test �޼ҵ帶�� ����.
	public void setUp() {	//�޼ҵ� ������ �̰� ���� ����
		System.out.println("setup() start");
		jem = new JUnitExamMain(10);
		System.out.println("setup() end");
	}
	
	@After
	public void tearDown() {
		System.out.println("teardown start");
		jem = null;
		System.out.println("teardown end");
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
//		JUnitExamMain jem = new JUnitExamMain(10); //����� �ø���
//		jem = new JUnitExamMain(10); //����� �÷ȴ�	//Ŭ������ ����
		System.out.println("testadd start");
		assertEquals(30, jem.add(20));
		System.out.println("testadd end");
	}
	
	@Test
	public void testAdd2() {
//		fail("Not yet implemented");
//		JUnitExamMain jem = new JUnitExamMain(10);
		System.out.println("testadd2 start");
		assertEquals(30, jem.add(20));
		System.out.println("testadd2 end");
	}
	
//	setupclass is called
//	setup() start
//	setup() end
//	testadd start
//	testadd end
//	teardown start
//	teardown end
//	setup() start
//	setup() end
//	testadd2 start
//	testadd2 end
//	teardown start
//	teardown end
//	teardownClass is called
	
	

}
