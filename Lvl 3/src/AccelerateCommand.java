public class AccelerateCommand implements Command {
    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void action() {
        vehicle.accelerate();
    }
}
