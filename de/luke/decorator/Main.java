package de.luke.decorator;

import de.luke.decorator.coffee.ChocoSirupDecorator;
import de.luke.decorator.coffee.Coffee;
import de.luke.decorator.coffee.MilkDecorator;
import de.luke.decorator.coffee.MintSirupDecorator;
import de.luke.decorator.coffee.SimpleCoffee;
import de.luke.decorator.coffee.VanillaSirupDecorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new MilkDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new VanillaSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new ChocoSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
		
		c = new MintSirupDecorator(c);
		System.out.println(c.getCost() + "€ ("+ c.getDescription() +")");
	}

}
