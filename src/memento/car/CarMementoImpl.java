package src.memento.car;

public class CarMementoImpl implements Memento {

    private String color;
    private String licensePlate;
    private String ownerName;
    private int horsePower;
    private int seats;
    private int doors;

    public CarMementoImpl(String color, String licensePlate, String ownerName, int horsePower, int seats, int doors) {
        this.color = color;
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.horsePower = horsePower;
        this.seats = seats;
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

}