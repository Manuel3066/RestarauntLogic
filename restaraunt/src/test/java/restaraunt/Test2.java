package restaraunt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Restaraunt;
import model.RestarauntLogic;

public class Test2 {

	RestarauntLogic rsLG = new RestarauntLogic();
	Restaraunt restaraunt = new Restaraunt();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsNotRestarauntLarge() {
		restaraunt.setSize(5);
		boolean state = rsLG.isRestarauntLarge(restaraunt);
		assertFalse(state);
	}

}
