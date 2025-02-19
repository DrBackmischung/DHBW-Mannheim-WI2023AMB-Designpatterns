package javac.builder.house;

public class HouseBuilder {
	
    protected int windows;
    protected int doors;
    protected int rooms;
    protected boolean hasGarage;
    protected boolean hasSwimmingPool;
    protected boolean hasGarden;

    public HouseBuilder(int rooms) {
        this.rooms = rooms; 
    }

    public HouseBuilder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public HouseBuilder setGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(this);
    }

}
