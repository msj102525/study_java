package ncs.test7;

public class Airplane extends Plane {
    public Airplane() {
        // 기본 생성자
    }

    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    void refuel(int fuel) {
        setFuelSize(getFuelSize() + fuel);
    }

    @Override
    void flight(int distance) {
        int fuelConsumed = distance / 10;
        setFuelSize(getFuelSize() - fuelConsumed);
    }
}
