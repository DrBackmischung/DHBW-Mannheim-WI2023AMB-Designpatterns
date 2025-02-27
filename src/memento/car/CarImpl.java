package src.memento.car;

public class CarImpl implements Originator {

    private String color;
    private String licensePlate;
    private String ownerName;
    private int horsePower;
    private int seats;
    private int doors;

    public CarImpl(String color, String licensePlate, String ownerName, int horsePower, int seats, int doors) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.horsePower = horsePower;
        this.seats = seats;
        this.doors = doors;
    }

    @Override
    public Memento save() {
        return new CarMementoImpl(this.color, this.licensePlate, this.ownerName, this.horsePower, this.seats, this.doors);
    }

    @Override
    public void restore(Memento memento) {
        CarMementoImpl carMemento = (CarMementoImpl) memento;

        this.color = carMemento.getColor();
        this.licensePlate = carMemento.getLicensePlate();
        this.ownerName = carMemento.getOwnerName();
        this.horsePower = carMemento.getHorsePower();
        this.seats = carMemento.getSeats();
        this.doors = carMemento.getDoors();

        System.out.println("Car recovered to previous state.");
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "CarImpl{" +
                "color='" + color + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", horsePower=" + horsePower +
                ", seats=" + seats +
                ", doors=" + doors +
                '}';
    }
}