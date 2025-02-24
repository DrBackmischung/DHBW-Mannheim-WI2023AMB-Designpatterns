package src.memento.car;

public interface Memento {

    default void restore(Originator originator) {
        originator.restore(this);
    }

}