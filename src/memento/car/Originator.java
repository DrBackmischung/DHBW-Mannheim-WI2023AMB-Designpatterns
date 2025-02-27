package src.memento.car;

public interface Originator {

    Memento save();
    void restore(Memento memento);

}