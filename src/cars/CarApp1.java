package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Car> carLot = new ArrayList<>();
		Car c1 = new Car("Ford", "Fusion", 2008, 19500);
		Car c2 = new Car("Jeep", "Wrangler", 2018, 26000);
		Car c3 = new Car("Toyota", "Camry", 2018, 30500);

		UsedCar c4 = new UsedCar("Jeep", "Cherokee sport", 2000, 3500, 185000);
		UsedCar c5 = new UsedCar("Chevy", "Malibu", 2004, 3200, 135000);
		UsedCar c6 = new UsedCar("Chrysler", "Sebring", 2004, 800, 145000);

		carLot.add(c1);
		carLot.add(c2);
		carLot.add(c3);

		carLot.add(c4);
		carLot.add(c5);
		carLot.add(c6);
		int userCar;
		String answer = " ";
		String cont = " ";
		do {
			carMenu(carLot);

			userCar = Validator.getInt(scan, "Please enter the number of which car you would like: ");

			selectCar(carLot, userCar);
			
			System.out.println(carLot.get((userCar - 1)));

			answer = Validator.getString(scan, "Would you like to buy this car? (y/n): ");
			if (answer.equalsIgnoreCase("y")) {
				System.out.println("Excellent! you da man!");
				carLot.remove((userCar - 1));
			} else {
				System.out.println("Okay! maybe another option.");
			}
			cont = Validator.getString(scan, "Would you like to buy another car(y/n): ");
		} while (cont.equalsIgnoreCase("y")); 

		System.out.println("Thankyou, have a nice day");
	}

	public static void carMenu(ArrayList<Car> carLot) {
		System.out
				.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Make", "Model", "Year", "Price", "Milealage"));
		System.out.println("================================================================================");
		for (int i = 0; i < carLot.size(); i++) {
			System.out.println("Option " + (i + 1) + "\t" + carLot.get(i));
		}

	}

	public static Car selectCar(ArrayList<Car> carLot, int userCar) {
			switch (userCar) {
			case 1:
				return carLot.get(0);

			case 2:
				return carLot.get(1);

			case 3:
				return carLot.get(2);

			case 4:
				return carLot.get(3);

			case 5:
				return carLot.get(4);

			case 6:
				return carLot.get(5);


				
		}
		return null;
	}

}
