public class Ship extends Vehicle{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The Ship " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The Ship " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The Ship " + name + " is braking.");
    }
}
