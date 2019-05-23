import static org.junit.Assert.*;

import java.util.Arrays;

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
	
		String[] result = { "peter" };
		String output = y.Scream(result);
		assertEquals("peter is yelling", output);
	}
//	R2: Null Person is Yelling
	@Test
	public void testNullYelling() {
		Yelling y = new Yelling();
		String[] result = { "NULL" };
		String output = y.Scream(result);
		assertEquals("Nobody is yelling", output);
	}
	//R3: upercase
	@Test
	public void testUpperYelling() {
		Yelling y = new Yelling();
		String[] result = { "PETER" };
		String output = y.Scream(result);
		assertEquals("PETER IS YELLING", output);
	}
//	
	//R4: two people are yelling
		@Test
		public void testTwoYelling() {
			Yelling y = new Yelling();
			String[] result = { "sagar" , "raman" };
			String output = y.Scream(result);
			assertEquals("sagar and raman is yelling", output);
		}

		//R5: more than two people are yelling
				@Test
				public void testmoreYelling() {
					Yelling y = new Yelling();
					String[] result = { "sagar" , "raman", "deep" , "you" , "yes"};
					String output = y.Scream(result);
					assertEquals("sagar , raman , deep , you and yes is yelling", output);
				}

}
