class MethodOverloading {

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class Demo {

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        int r1 = obj.add(10, 20);
        System.out.println("Addition of two integers: " + r1);

        int r2 = obj.add(10, 20, 30);
        System.out.println("Addition of three integers: " + r2);

        double r3 = obj.add(10.5, 20.5);
        System.out.println("Addition of two doubles: " + r3);
    }
}