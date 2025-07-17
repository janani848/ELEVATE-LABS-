import java.util.*;

public class NotesManagerOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> notes = new ArrayList<>();

        // Pre-added sample notes for demo in case input fails in online compiler
        notes.add("Complete Java File I/O task");
        notes.add("Learn BufferedReader vs FileReader");

        System.out.println("Welcome to Notes Manager (Simulated Version)");

        System.out.println("\nOptions:");
        System.out.println("1. View Notes");
        System.out.println("2. Add Sample Note");
        System.out.println("3. Exit");

        // Simulate menu selection (since some online compilers don’t accept input properly)
        int choice = 1; // Change this value manually if needed

        if (choice == 1) {
            System.out.println("\nYour Notes:");
            for (String note : notes) {
                System.out.println("- " + note);
            }
        } else if (choice == 2) {
            String newNote = "New sample note added";
            notes.add(newNote);
            System.out.println("Note added successfully: " + newNote);
        } else {
            System.out.println("Exiting...");
        }

        // Simulated message about real-world file handling
        System.out.println("\nNOTE: In a real Java project (local machine), these notes would be saved in a file using FileWriter/FileReader.");
    }
}
