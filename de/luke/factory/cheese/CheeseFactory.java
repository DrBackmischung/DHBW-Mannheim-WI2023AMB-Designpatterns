package de.luke.factory.cheese;

public class CheeseFactory {
	
	public static Cheese create(CheeseType t) {
		switch (t) {
			case GOUDA:
				return new Gouda(1.99, 20240925);
			case CHEDDAR:
				return new Cheddar(2.99, 20240929);
			default:
				throw new IllegalArgumentException("Please choose a valid cheese.");
		}
	}

}
