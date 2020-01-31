package model;

public class RestarauntLogic {
	public boolean isRestarauntLarge(Restaraunt restaraunt) {
		boolean state = false;
		if(restaraunt.getSize() > 2000) {
			state = true;
		}
		return state;
	}
	public boolean isResarauntMedium(Restaraunt restaraunt) {
		boolean state = false;
		
		if(restaraunt.getSize() == 2000) {
			state = true;
		}
		return state;
	}
	
	public boolean isRestarauntSmall(Restaraunt restaraunt) {
		boolean state = false;
		
		if(restaraunt.getSize()<2000) {
			state = true;
		}
		return state;
	}

}
