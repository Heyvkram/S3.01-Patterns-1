public class CommandSets {
    CommandHandler command = new CommandHandler();
    Vehicle car = new Car("car1");
    Vehicle bicycle = new Bicycle("bicycle1");
    Vehicle plane = new Plane("plane1");
    Vehicle ship = new Ship("ship1");

    public void carSet(){
        command.setStartCommand(new StartCommand(car));
        command.setAccelerateCommand(new AccelerateCommand(car));
        command.setBrakeCommand(new BrakeCommand(car));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();
    }

    public void bicycleSet(){
        command.setStartCommand(new StartCommand(bicycle));
        command.setAccelerateCommand(new AccelerateCommand(bicycle));
        command.setBrakeCommand(new BrakeCommand(bicycle));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();
    }

    public void planeSet(){
        command.setStartCommand(new StartCommand(plane));
        command.setAccelerateCommand(new AccelerateCommand(plane));
        command.setBrakeCommand(new BrakeCommand(plane));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();
    }

    public void shipSet(){
        command.setStartCommand(new StartCommand(ship));
        command.setAccelerateCommand(new AccelerateCommand(ship));
        command.setBrakeCommand(new BrakeCommand(ship));
        command.startVehicle();
        command.accelerateVehicle();
        command.brakeVehicle();
    }

}
