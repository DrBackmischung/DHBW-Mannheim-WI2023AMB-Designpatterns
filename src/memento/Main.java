package src.memento;

import src.memento.car.CarHistory;
import src.memento.car.CarImpl;
import src.memento.car.Originator;
import src.memento.cart.Cart;
import src.memento.cart.CartHistory;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        CartHistory history = new CartHistory();

        cart.addItem("Apples");
        history.save(cart);  

        cart.addItem("Bananas");
        history.save(cart);  

        cart.addItem("Chips");
        cart.addItem("Doritos");
        history.save(cart);

        cart.showItems();

        history.undo(cart);
        cart.showItems();

        history.undo(cart);
        cart.showItems();
        testCarMemento();
    }

    private static void testCarMemento() {

        System.out.println("################################");

        CarHistory carHistory = new CarHistory();
        CarImpl car = new CarImpl("red", "HD-MN 420", "Mathis Neunzig", 420, 2, 3);
        Originator encapsulatedOriginator = car;
        System.out.println(car);

        carHistory.save(encapsulatedOriginator);

        car.setOwnerName("Matze Neunzig");
        System.out.println(car);

        carHistory.undo(encapsulatedOriginator);
        System.out.println(car);
    }


}