package model;

public class Restaraunt {
	private String foodType = "";
	private int Size = 0;
	
	public Restaraunt() {
		
	}

	public Restaraunt(String foodType) {
		super();
		this.foodType = foodType;
	}


	public Restaraunt(String foodType, int size) {
		this.foodType = foodType;
		Size = size;
	}







	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}
	
	
	

}
