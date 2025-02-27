package src.memento.car;

import java.util.Stack;

public class CarHistory {

    private Stack<Memento> history = new Stack<>();

    public void save(Originator originator) {
        this.history.push(originator.save());
    }

    public void undo(Originator originator) {
        if (this.history.isEmpty()) {
            System.out.println("No more actions to undo.");
            return;
        }

        originator.restore(this.history.pop());
    }

}