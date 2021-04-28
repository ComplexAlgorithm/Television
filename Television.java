public class Television {
	//instance variables
	private String brand;
	private boolean power;
	
	//first constructor
	public Television(String brand, int power) {
		this.brand = brand;
		if(power == 1) {
			this.power = true;
		}
		else {
			this.power = false;
		}
	}
	
	//default constructor
	public Television() {
		brand = "";   //OR this("",0);
		power = false;
	}
	
	//third constructor
	public Television(String newBrand) {
		brand = newBrand;   //OR this(newBrand,1);
		power = true;
	}
	
	//non-static methods
	public void setBrand(String newBrand) {
		brand = newBrand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPower(int newPower) {
		if(newPower == 0) {
			power = false;
		}
		else if (newPower == 1) {
			power = true;
		}
	}
	//overload the setPower method
	public void setPower(boolean newPower) {
		power = newPower;
	}
	
	public int getPower() {
		int powerAsInt;
		if(power == true) {
			powerAsInt = 1;
		}
		else {
			powerAsInt = 0;
		}
		return powerAsInt;
	}
	
}