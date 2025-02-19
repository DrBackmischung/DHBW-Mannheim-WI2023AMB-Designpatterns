package javac.factory.cheese;

import java.time.LocalDate;

public class CheeseFactory {
	private static final double GOUDA_PRICE = 1.99;
	private static final double CHEDDAR_PRICE = 2.99;

	public static Cheese create(CheeseType type) {
		return switch (type) {
			case GOUDA -> new Gouda(GOUDA_PRICE, LocalDate.now().plusMonths(6));
			case CHEDDAR -> new Cheddar(CHEDDAR_PRICE, LocalDate.now().plusMonths(6));
			default -> throw new IllegalArgumentException("Bitte wählen Sie einen gültigen Käse.");
		};
	}
}
