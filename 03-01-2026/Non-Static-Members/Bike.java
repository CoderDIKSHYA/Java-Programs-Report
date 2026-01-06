/*
Execution priority:
1. Static Initializer Block
2. Non-static (Instance) Initializer Block
3. Constructor
*/

class Bike {

    String name;
    double price;

    // 1️⃣ Static Initializer Block (executes once)
    static {
        System.out.println("Static block executed");
    }

    // 2️⃣ Non-static Initializer Block (executes for every object)
    {
        System.out.println("Welcome to Royal Enfield");
    }

    // 3️⃣ Constructor (executes after instance block)
    Bike() {
        System.out.println("Bike constructor executed");
    }

    public void race() {
        System.out.println("1000 horse speed");
    }

    public void collect(Bike b) {
        System.out.println("Collect method called for: " + b.name);
    }

    public static void main(String[] args) {

        // First object
        Bike b1 = new Bike();
        b1.name = "Yamaha-R15 (V1)";
        b1.price = 120000;
        System.out.println(b1.name);
        System.out.println(b1.price);
        b1.race();
        b1.collect(b1);

        System.out.println("------------");

        // Second object
        Bike b2 = new Bike();
        b2.name = "Yamaha-R15";
        b2.price = 140000;
        System.out.println(b2.name);
        System.out.println(b2.price);
        b2.race();
        b2.collect(b2);
    }
}
