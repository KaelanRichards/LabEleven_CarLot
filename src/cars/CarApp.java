package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = Validator.getInt(scan, "Please enter a number");
		int counter = 1;
		ArrayList<Car> carList = new ArrayList<>();

		for (int i = 0; i < userInput; i++) {
			String make = Validator.getString(scan, "Enter car #" + counter + " Make: ");
			String model = Validator.getString(scan, "Enter car #" + counter + " Model: ");
			int year = Validator.getInt(scan, "Enter car #" + counter + " Year: ");
			double price = Validator.getDouble(scan, "Enter car #" + counter + " Price: ");
			counter++;
			carList.add(new Car(make, model, year, price));
		}
		
		System.out.println("Current Inventory: ");
		for (Car c : carList) {
			System.out.println(c);
		}
	}
}
