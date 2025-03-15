public class Plane extends Vehicle{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The plane " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The plane " + name + " is braking.");
    }
}
