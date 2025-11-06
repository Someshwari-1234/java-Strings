class CarA {
    void drive() {
        System.out.println("Car is driving...");
    }
}

class ElectricCar extends CarA {   // ElectricCar IS-A Car
    void chargeBattery() {
        System.out.println("Electric car is charging...");
    }
}

public class IsARelation {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.drive();
        e.chargeBattery();
    }
}
