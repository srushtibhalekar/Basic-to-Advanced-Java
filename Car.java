class Car {

    void run() {
        System.out.println("Car is running");
    }

    void run(int speed) {
        System.out.println("Car is running at " + speed + " km/h");
    }

    void run(String mode) {
        System.out.println("Car is running in " + mode + " mode");
    }

    public static void main(String[] args) {

        Car c = new Car();

        c.run();
        c.run(80);
        c.run("Sports");
    }
}