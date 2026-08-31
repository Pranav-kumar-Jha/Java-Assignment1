class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Car class inherits Vehicle
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }

    @Override
    void stop() {
        System.out.println("Car stops using brakes");
    }
}

// Bike class inherits Vehicle
class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }

    @Override
    void stop() {
        System.out.println("Bike stops using brakes");
    }
}

class VehicleDemo {
    public static void main(String args[]) {

        // Creating Car object
        Car c = new Car();

        System.out.println("Car:");
        c.start();
        c.stop();

        // Creating Bike object
        Bike b = new Bike();

        System.out.println("\nBike:");
        b.start();
        b.stop();
    }
}