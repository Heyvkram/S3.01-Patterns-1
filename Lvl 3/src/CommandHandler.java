public class CommandHandler {
    private Command startCommand, accelerateCommand, brakeCommand;

    public void setStartCommand(Command startCommand) {
        this.startCommand = startCommand;
    }

    public void setAccelerateCommand(Command accelerateCommand) {
        this.accelerateCommand = accelerateCommand;
    }

    public void setBrakeCommand(Command brakeCommand) {
        this.brakeCommand = brakeCommand;
    }

    public void startVehicle() {
        startCommand.action();
    }

    public void accelerateVehicle() {
        accelerateCommand.action();
    }

    public void brakeVehicle() {
        brakeCommand.action();
    }
}
