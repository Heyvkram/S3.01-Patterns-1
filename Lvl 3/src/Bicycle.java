public class Bicycle extends Vehicle{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The Bicycle " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The Bicycle " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The Bicycle " + name + " is braking.");
    }
}
