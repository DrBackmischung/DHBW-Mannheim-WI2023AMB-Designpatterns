package src.memento.cart;

import java.util.List;
import java.util.ArrayList;

public class CartMemento {
    private final List<String> items;

    public CartMemento(List<String> items) {
        this.items = new ArrayList<>(items);
    }

    public List<String> getSavedItems() {
        return new ArrayList<>(items);
    }
}
