package src.builder.house;

public class House {
	
	private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    protected House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House [windows=" + windows + ", doors=" + doors + ", rooms=" + rooms +
               ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool +
               ", hasGarden=" + hasGarden + "]";
    }

}
