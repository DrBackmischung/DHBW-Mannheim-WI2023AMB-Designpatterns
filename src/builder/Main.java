package src.builder;

import src.builder.house.House;
import src.builder.house.HouseBuilder;

public class Main {
	
	public static void main(String[] args) {
		House simpleHouse = new HouseBuilder(3)
                .setWindows(10)
                .build();

        System.out.println(simpleHouse);
        System.out.println("Test");

        House luxuryHouse = new HouseBuilder(5)
                .setWindows(20)
                .setDoors(8)
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarden(true)
                .build();

        System.out.println(luxuryHouse);
	}

}
