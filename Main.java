import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;


public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0f);
        Car bmw = new Car("BMW", "Z8", 2f);
        Car hyundai = new Car("Hyundai", "Avante", 2.2f);
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f);
        Truck kamaz = new Truck("Камаз", "6520", 9.8f);
        Truck ford = new Truck("Ford", "Cargo 25", 9.0f);
        Truck howo = new Truck("Howo", "HW76", 9.8f);
        Truck isuzu = new Truck("Isuzu", "Forward", 7.8f);
        Bus kiaBus = new Bus("Kia", "Granbird", 17.2f);
        Bus intercityBus = new Bus("Mercedes-Benz", "Tourismo", 11.5f);
        Bus touristBus = new Bus("Mercedes-Benz", "Sprinter", 3f);
        Bus paz = new Bus("ПАЗ", "Next", 4.4f);
        DriverB driverB = new DriverB("Иван Иванов", 32);
        driverB.start(audi);
        DriverC driverC = new DriverC("Петр Петров", 20);
        driverC.stop(kamaz);
        DriverD driverD = new DriverD("Сидор Сидоров", 40);
        driverD.refillCar(paz);
        driverB.printInfo(kia);
        driverC.printInfo(kamaz);
        driverD.printInfo(kiaBus);

    }
}