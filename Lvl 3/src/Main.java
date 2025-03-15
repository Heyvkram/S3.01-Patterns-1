public class Main {
    public static void main(String[] args) {
        CommandHandler command = new CommandHandler();
        Vehicle car = new Car("Car1");
        Vehicle bicycle = new Bicycle("Bicylce1");
        Vehicle airplane = new Plane("Plan1");
        Vehicle ship = new Ship("Ship1");

        command.setStartCommand(new StartCommand(car));
        command.setAccelerateCommand(new AccelerateCommand(car));
        command.setBrakeCommand(new BrakeCommand(car));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();

        System.out.println("\n");

        command.setStartCommand(new StartCommand(bicycle));
        command.setAccelerateCommand(new AccelerateCommand(bicycle));
        command.setBrakeCommand(new BrakeCommand(bicycle));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();

        System.out.println("\n");

        command.setStartCommand(new StartCommand(airplane));
        command.setAccelerateCommand(new AccelerateCommand(airplane));
        command.setBrakeCommand(new BrakeCommand(airplane));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();

        System.out.println("\n");

        command.setStartCommand(new StartCommand(ship));
        command.setAccelerateCommand(new AccelerateCommand(ship));
        command.setBrakeCommand(new BrakeCommand(ship));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();
    }
}