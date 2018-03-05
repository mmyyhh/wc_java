import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MovieTest {
	
	private Movie movie;
	
	@Before
	public void setUp() {
		movie = new Movie();
	}
	
	@Test
	public void test_�����ϸ�_��յ��0������() {
//		Movie movie = new Movie();	//setUp �Լ��� ���� ��������
		assertEquals(0, movie.averageRate());
	}
	
	@Test
	public void test_1������_��յ��1������() {
//		Movie movie = new Movie();	//setUp �Լ��� ���� ��������
		movie.rate(1);
		assertEquals(1, movie.averageRate());
	}
	
	@Test
	public void test_�������3��5����������յ��() {
//		Movie movie = new Movie();	//setUp �Լ��� ���� ��������
		movie.rate(3);
		movie.rate(5);
		assertEquals(4, movie.averageRate());
	}

}
