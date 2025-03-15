public class Plane extends Vehicle{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The Plane " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The Plane " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The Plane " + name + " is braking.");
    }
}
