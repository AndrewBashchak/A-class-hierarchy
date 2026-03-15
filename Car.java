public class Car extends Transport {

    private int passengerCount;

    public Car(String brand, String model, int year, int passengerCount) {
        super(brand, model, year);
        this.passengerCount = passengerCount;
    }

    public String getInfo() {
        return super.getInfo() + ", Passenger capacity: " + passengerCount;
    }
}
