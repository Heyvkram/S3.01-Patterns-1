import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            menu();

            try {
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("\n Insert command: \n >");
                        String command = sc.nextLine();
                        undo.addCommand(command);
                        break;
                    case 2:
                        undo.removeLastCommand();
                        break;
                    case 3:
                        undo.listCommands();
                        break;
                    case 4:
                        System.out.println("\n PROCESS FINISHED");
                        sc.close();
                        break;
                    default:
                        System.out.println("\n ERROR, you must to insert a valid option!.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n ERROR! you need to insert a number!.");
                sc.nextLine(); //
            }
        }
    }

    private static void menu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. INSERT");
        System.out.println("2. UNDO");
        System.out.println("3. SHOW HISTORY");
        System.out.println("4. EXIT");
        System.out.print("CHOOSE AN OPTION: \n >");
    }
}