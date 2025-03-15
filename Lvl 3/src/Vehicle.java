abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void start();
    public abstract void accelerate();
    public abstract void brake();
}
