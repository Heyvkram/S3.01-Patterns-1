public class BrakeCommand implements Command{
    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void action() {
        vehicle.brake();
    }
}
