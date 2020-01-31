package restaraunt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Restaraunt;
import model.RestarauntLogic;

public class Test1 {
	
	RestarauntLogic rsLG = new RestarauntLogic();
	Restaraunt restaraunt = new Restaraunt();
	

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsRestarauntSmall() {
		restaraunt.setSize(1999);
		boolean state = rsLG.isRestarauntSmall(restaraunt);
		assertEquals(true,state);
		
	}
	@Test
	public void testIsRestarauntMedium() {
		restaraunt.setSize(2000);
		boolean state = rsLG.isResarauntMedium(restaraunt);
		assertTrue(state);
		
		
	}


}
