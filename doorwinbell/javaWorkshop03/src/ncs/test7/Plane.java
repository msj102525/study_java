package ncs.test7;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	public Plane() {
		super();
	}
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	abstract void refuel(int fuel);
	abstract void flight(int distance);
	
	public int getFuelSize() {
        return fuelSize;
    }

    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }
    
    public String getPlaneName() {
    	return this.planeName;
    }
}
