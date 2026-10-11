import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // ArrayList operations
    static void arrayListOperations() {
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- ARRAYLIST MENU ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Update Element");
            System.out.println("4. Search Element");
            System.out.println("5. Display All Elements");
            System.out.println("6. Back to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    list.add(sc.nextLine());
                    System.out.println("Element added successfully!");
                    break;

                case 2:
                    System.out.print("Enter element to remove: ");
                    String remove = sc.nextLine();

                    if (list.remove(remove)) {
                        System.out.println("Element removed successfully!");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to update: ");
                    String oldValue = sc.nextLine();

                    int index = list.indexOf(oldValue);

                    if (index != -1) {
                        System.out.print("Enter new element: ");
                        String newValue = sc.nextLine();
                        list.set(index, newValue);
                        System.out.println("Element updated successfully!");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    String search = sc.nextLine();

                    if (list.contains(search)) {
                        System.out.println("Element found!");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 5:
                    System.out.println("ArrayList Elements: " + list);

                    for (String item : list) {
                        System.out.println(item);
                    }
                    break;

                case 6:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    // HashMap operations
    static void hashMapOperations() {
        HashMap<Integer, String> map = new HashMap<>();
        int choice;

        do {
            System.out.println("\n--- HASHMAP MENU ---");
            System.out.println("1. Insert Key-Value");
            System.out.println("2. Get Value by Key");
            System.out.println("3. Update Value");
            System.out.println("4. Check Key");
            System.out.println("5. Display All Entries");
            System.out.println("6. Back to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    int key = readInt("Enter key (ID): ");
                    System.out.print("Enter value (name): ");
                    String value = sc.nextLine();

                    map.put(key, value);
                    System.out.println("Entry inserted successfully!");
                    break;

                case 2:
                    key = readInt("Enter key to search: ");

                    if (map.containsKey(key)) {
                        System.out.println("Value: " + map.get(key));
                    } else {
                        System.out.println("Key not found!");
                    }
                    break;

                case 3:
                    key = readInt("Enter key to update: ");

                    if (map.containsKey(key)) {
                        System.out.print("Enter new value: ");
                        value = sc.nextLine();
                        map.put(key, value);
                        System.out.println("Value updated successfully!");
                    } else {
                        System.out.println("Key not found!");
                    }
                    break;

                case 4:
                    key = readInt("Enter key to check: ");

                    if (map.containsKey(key)) {
                        System.out.println("Key exists!");
                    } else {
                        System.out.println("Key does not exist!");
                    }
                    break;

                case 5:
                    System.out.println("HashMap Entries:");

                    for (Integer id : map.keySet()) {
                        System.out.println(id + " -> " + map.get(id));
                    }
                    break;

                case 6:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    // Queue operations
    static void queueOperations() {
        Queue<String> queue = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. View Front Element");
            System.out.println("4. Display Queue");
            System.out.println("5. Back to Main Menu");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    String item = sc.nextLine();

                    queue.offer(item);
                    System.out.println("Element added to queue!");
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println(
                            "Removed Element: " + queue.poll()
                        );
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println(
                            "Front Element: " + queue.peek()
                        );
                    }
                    break;

                case 4:
                    System.out.println("Queue Elements: " + queue);
                    break;

                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    // Safely read an integer
    static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a whole number.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int choice;

        System.out.println("================================");
        System.out.println(" JAVA COLLECTIONS CHALLENGE");
        System.out.println("================================");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. ArrayList Operations");
            System.out.println("2. HashMap Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Exit");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    arrayListOperations();
                    break;

                case 2:
                    hashMapOperations();
                    break;

                case 3:
                    queueOperations();
                    break;

                case 4:
                    System.out.println("Thank you! Application closed.");
                    break;

                default:
                    System.out.println("Invalid choice! Select 1 to 4.");
            }

        } while (choice != 4);

        sc.close();
    }
}