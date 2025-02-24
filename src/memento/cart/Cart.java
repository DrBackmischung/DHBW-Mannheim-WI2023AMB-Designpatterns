package src.memento.cart;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the cart.");
    }

    public void showItems() {
        System.out.println("Current cart items: " + items);
    }

    public CartMemento save() {
        return new CartMemento(items);
    }

    public void restore(CartMemento memento) {
        items = memento.getSavedItems();
        System.out.println("Cart restored to previous state.");
    }
}
