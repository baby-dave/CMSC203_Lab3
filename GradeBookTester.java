import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1=new GradeBook(5);
	private GradeBook g2=new GradeBook(5);
	@BeforeEach
	
	void setUp() throws Exception {
		
		
		g1.addScore(50.0);
		g1.addScore(45.0);
		g1.addScore(60.0);
		g1.addScore(20.0);
		g1.addScore(10.0);
		g2.addScore(65.0);
		g2.addScore(35.0);
		g2.addScore(40.0);
		g2.addScore(50.0);
		g2.addScore(25.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		
		assertTrue(g1.toString().equals("50.0 45.0 60.0 20.0 10.0 "));
		assertTrue(g2.toString().equals("65.0 35.0 40.0 50.0 25.0 "));
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		
		assertEquals(185.0, g1.sum());
		assertEquals(215.0, g2.sum());
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals(10.0, g1.minimum());
		assertEquals(25.0, g2.minimum());
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		
		assertEquals(175.0, g1.finalScore());
		assertEquals(190.0, g2.finalScore());
	}


}
