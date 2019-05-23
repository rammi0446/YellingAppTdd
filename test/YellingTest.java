import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YellingTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//R1: One Person is yelling
	@Test
	public void testOneYelling() {
		Yelling y = new Yelling();
		String result = y.Scream("peter");
		assertEquals("peter is yelling",result);
	}
	@Test
	public void testNullYelling() {
		Yelling y = new Yelling();
		String result = y.Scream("NULL");
		assertEquals("NULL",result);
	}

}
