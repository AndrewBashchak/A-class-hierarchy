public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2015, 5);
        Truck truck = new Truck("Volvo", "FH16", 2020, 18.0);
        Bike bike = new Bike("Yamaha", "MT-07", 2019, 689);

        Transport[] vehicles = {car, truck, bike};
        for (Transport vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
