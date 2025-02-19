package javac.decorator;

import javac.decorator.coffee.ChocoSirupDecorator;
import javac.decorator.coffee.Coffee;
import javac.decorator.coffee.MilkDecorator;
import javac.decorator.coffee.MintSirupDecorator;
import javac.decorator.coffee.SimpleCoffee;
import javac.decorator.coffee.VanillaSirupDecorator;

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
