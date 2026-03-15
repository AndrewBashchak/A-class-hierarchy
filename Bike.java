public class Bike extends Transport {

    private int engineVolume;

    public Bike(String brand, String model, int year, int engineVolume) {
        super(brand, model, year);
        this.engineVolume = engineVolume;
    }

    public String getInfo() {
        return super.getInfo() + ", Engine volume: " + engineVolume + " cc";
    }
}
