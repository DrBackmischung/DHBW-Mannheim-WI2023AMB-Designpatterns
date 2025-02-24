package src.decorator;

import src.decorator.coffee.ChocoSirupDecorator;
import src.decorator.coffee.Coffee;
import src.decorator.coffee.MilkDecorator;
import src.decorator.coffee.MintSirupDecorator;
import src.decorator.coffee.SimpleCoffee;
import src.decorator.coffee.VanillaSirupDecorator;

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
