public class Main {
    public static void main(String[] args) {
        CommandSets commandSets = new CommandSets();

        System.out.println("\n--- Car Commands ---");
        commandSets.carSet();

        System.out.println("\n--- Bicycle Commands ---");
        commandSets.bicycleSet();

        System.out.println("\n--- Plane Commands ---");
        commandSets.planeSet();

        System.out.println("\n--- Ship Commands ---");
        commandSets.shipSet();
    }
}