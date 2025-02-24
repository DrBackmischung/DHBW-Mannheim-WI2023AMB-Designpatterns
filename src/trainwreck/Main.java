package src.trainwreck;

public class Main {
	
	public static void main(String[] args) {
        TrainBookingSystem bookingSystem = new TrainBookingSystem();
        bookingSystem.getStation("Karlsruhe").getSchedule().getTrain("RE73").getSeat(5).reserve();
    }

}
