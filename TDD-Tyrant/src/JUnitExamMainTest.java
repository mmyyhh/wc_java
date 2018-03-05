import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitExamMainTest {
	JUnitExamMain jem; //멤버로 올렸다.
	
//	@Test
//	public void testJUnitExamMain() {
//		fail("Not yet implemented");
//	}
	
	@BeforeClass	
	public static void setUpClass() { //반드시 static
		System.out.println("setupclass is called");
	}
	
	@AfterClass	
	public static void teardownClass() { //반드시 static
		System.out.println("teardownClass is called");
	}
	
	@Before //beforeclass는 무조건 처음 한번만, before는 메 test 메소드마다 실행.
	public void setUp() {	//메소드 시작전 이거 먼저 실행
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
//		JUnitExamMain jem = new JUnitExamMain(10); //멤버로 올리자
//		jem = new JUnitExamMain(10); //멤버로 올렸다	//클래스로 빼자
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
