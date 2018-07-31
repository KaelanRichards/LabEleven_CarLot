package cars;

public class UsedCar extends Car {

	private double mileage;
	
	public UsedCar(String make, String model, int year, double price, double mileage) {
		
		super(make, model, year, price);
		this.mileage = mileage;
	
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%,-5.2f miles", mileage);
		
	}
	
}
