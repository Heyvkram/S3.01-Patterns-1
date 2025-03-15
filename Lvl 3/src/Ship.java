public class Ship extends Vehicle{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The ship " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The ship " + name + " is braking.");
    }
}
