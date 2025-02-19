package de.luke.factory;

import de.luke.factory.cheese.Cheese;
import de.luke.factory.cheese.CheeseFactory;
import de.luke.factory.cheese.CheeseType;

public class Main {
	
	public static void main(String[] args) {
//		Gouda g = new Gouda();
		
		Cheese c = CheeseFactory.create(CheeseType.GOUDA);
		System.out.println("I am a "+c.getName()+" and I last until "+c.getBestBeforeDate() +"!");
	}

}
