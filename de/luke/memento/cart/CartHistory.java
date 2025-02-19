package de.luke.memento.cart;

import java.util.Stack;

public class CartHistory {
    private Stack<CartMemento> history = new Stack<>();

    public void save(Cart cart) {
        history.push(cart.save());
    }

    public void undo(Cart cart) {
        if (!history.isEmpty()) {
            history.pop(); 
            if (!history.isEmpty()) { 
                cart.restore(history.peek()); 
            } else {
                System.out.println("No more actions to undo.");
            }
        } else {
            System.out.println("No more actions to undo.");
        }
    }
}
