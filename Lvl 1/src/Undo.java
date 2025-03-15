import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo instance;
    private List<String> commands;

    private Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commands.add(command);
        System.out.println("\n COMMAND STORED!" );
    }

    public void removeLastCommand() {
        if (!commands.isEmpty()) {
            String removedCommand = commands.remove(commands.size() - 1);
            System.out.println("\nLAST COMMAND DELETED!: " + removedCommand);
            System.out.println("-- COMMANDS REMAINING: " + commands.size() + " --");
        } else {
            System.out.println("\n EMPTY!, INSERT MORE COMMANDS TO USE THIS FEATURE!.");
        }
    }

    public void listCommands() {
        System.out.println("\n --- " + commands.size() + " COMMANDS STORED ---\n"   );
        if (commands.isEmpty()) {
            System.out.println("\n EMPTY!.");
        } else {
            for (String command : commands) {
                System.out.println("-- " + command);
            }
        }
    }
}
