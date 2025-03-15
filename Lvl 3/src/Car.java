public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("The car " + name + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car " + name + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("The car " + name + " is braking.");
    }
}
