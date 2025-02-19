package javac.trainwreck;

public class TrainBookingSystem {
    public Station getStation(String name) {
        return new Station(name);
    }
}

class Station {
    @SuppressWarnings("unused")
	private String name;

    public Station(String name) {
        this.name = name;
    }

    public Schedule getSchedule() {
        return new Schedule();
    }
}

class Schedule {
    public Train getTrain(String name) {
        return new Train(name);
    }
}

class Train {
    @SuppressWarnings("unused")
	private String name;

    public Train(String name) {
        this.name = name;
    }

    public Seat getSeat(int seatNumber) {
        return new Seat(seatNumber);
    }
}

class Seat {
    private int seatNumber;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void reserve() {
        System.out.println("Seat " + seatNumber + " reserved.");
    }
}

