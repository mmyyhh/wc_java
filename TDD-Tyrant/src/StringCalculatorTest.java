import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringCalculator() {
//		int add(String numbers)
		
		assertEquals(5,StringCalculator.add("2,3")); //현재 return 0이므로 빨간불 //스플릿코드를 추가해보자 //정상이다
		assertEquals(2+3+6,StringCalculator.add("2,3,6")); //다른코드도 만들어보자
		
		assertEquals(2,StringCalculator.add("2")); //2일경우 2반환
		assertEquals(0,StringCalculator.add("0")); //0일경우 0반환
	}
	
	@Test
	public void test_빈문자열0반환() {
		assertEquals(0,StringCalculator.add("")); //빈문자일경우 0을 반환
		assertEquals(0,StringCalculator.add(" ")); //공백문자일경우 0을 반환
		assertEquals(0,StringCalculator.add("	")); //탭문자일경우 0을 반환
	}
	
	@Test
	public void test_구분자로_개행문자도_허용(){
		assertEquals(2+3,StringCalculator.add("2\n3"));
		assertEquals(2+3,StringCalculator.add("2,3"));
	}
	
	@Test
	public void test_구분자로_다양한문자_허용(){
		assertEquals(2+3,StringCalculator.add("//;\n2;3"));
		assertEquals(2+3+6,StringCalculator.add("//#\n2#3#6"));
		assertEquals(2+3+6,StringCalculator.add("//#:#\n2#:#3#:#6"));
	}
	
	@Test(expected=RuntimeException.class)
	public void test_음수포함시_예외발생(){
		StringCalculator.add("-1");
	}
	
	@Test
	public void test_음수포함시_예외메세지제공(){
		RuntimeException re = null;
		try {
			StringCalculator.add("3,-1,6,30,-19");
		} catch (RuntimeException e) {
			e.getMessage();
			re = e;
		}
		assertNotNull(re);
		assertEquals("에러임[-1, -19]", re.getMessage());
	}
	
	@Test
	public void test_1000이상은_계산제외(){
		assertEquals(0,StringCalculator.add("1000,1001,1002"));
	}
	
}
