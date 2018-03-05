import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringCalculator() {
//		int add(String numbers)
		
		assertEquals(5,StringCalculator.add("2,3")); //���� return 0�̹Ƿ� ������ //���ø��ڵ带 �߰��غ��� //�����̴�
		assertEquals(2+3+6,StringCalculator.add("2,3,6")); //�ٸ��ڵ嵵 ������
		
		assertEquals(2,StringCalculator.add("2")); //2�ϰ�� 2��ȯ
		assertEquals(0,StringCalculator.add("0")); //0�ϰ�� 0��ȯ
	}
	
	@Test
	public void test_���ڿ�0��ȯ() {
		assertEquals(0,StringCalculator.add("")); //�����ϰ�� 0�� ��ȯ
		assertEquals(0,StringCalculator.add(" ")); //���鹮���ϰ�� 0�� ��ȯ
		assertEquals(0,StringCalculator.add("	")); //�ǹ����ϰ�� 0�� ��ȯ
	}
	
	@Test
	public void test_�����ڷ�_���๮�ڵ�_���(){
		assertEquals(2+3,StringCalculator.add("2\n3"));
		assertEquals(2+3,StringCalculator.add("2,3"));
	}
	
	@Test
	public void test_�����ڷ�_�پ��ѹ���_���(){
		assertEquals(2+3,StringCalculator.add("//;\n2;3"));
		assertEquals(2+3+6,StringCalculator.add("//#\n2#3#6"));
		assertEquals(2+3+6,StringCalculator.add("//#:#\n2#:#3#:#6"));
	}
	
	@Test(expected=RuntimeException.class)
	public void test_�������Խ�_���ܹ߻�(){
		StringCalculator.add("-1");
	}
	
	@Test
	public void test_�������Խ�_���ܸ޼�������(){
		RuntimeException re = null;
		try {
			StringCalculator.add("3,-1,6,30,-19");
		} catch (RuntimeException e) {
			e.getMessage();
			re = e;
		}
		assertNotNull(re);
		assertEquals("������[-1, -19]", re.getMessage());
	}
	
	@Test
	public void test_1000�̻���_�������(){
		assertEquals(0,StringCalculator.add("1000,1001,1002"));
	}
	
}
