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
	public void test_생성하면_평균등급0을리턴() {
//		Movie movie = new Movie();	//setUp 함수로 인해 삭제가능
		assertEquals(0, movie.averageRate());
	}
	
	@Test
	public void test_1줬을때_평균등급1을리턴() {
//		Movie movie = new Movie();	//setUp 함수로 인해 삭제가능
		movie.rate(1);
		assertEquals(1, movie.averageRate());
	}
	
	@Test
	public void test_등급으로3과5를줬을때평균등급() {
//		Movie movie = new Movie();	//setUp 함수로 인해 삭제가능
		movie.rate(3);
		movie.rate(5);
		assertEquals(4, movie.averageRate());
	}

}
