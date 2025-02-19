package de.luke.builder;

import de.luke.builder.house.House;
import de.luke.builder.house.HouseBuilder;

public class Main {
	
	public static void main(String[] args) {
		House simpleHouse = new HouseBuilder(3)
                .setWindows(10)
                .build();

        System.out.println(simpleHouse);

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
