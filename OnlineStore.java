/* 


I certify, that this computer program submitted by me is all of my own work, Wyatt Fredrickson.

Wyatt Fredrickson

05-19-2024

CSC 322 


Assigment Description: 
Program will simulate an online store with limited capabilites. 
Program will allow users to browse the items. Store sells software, music CD's and Books. 
Program will allow user to display all of the inventory items in a list as well as individual items, software, music CD's and books.


Sources: 
https://www.geeksforgeeks.org/java-io-bufferedreader-class-java/
https://www.geeksforgeeks.org/file-handling-java-using-filewriter-filereader/
https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
https://dzone.com/articles/java-string-format-examples
https://www.w3schools.com/
https://www.geeksforgeeks.org/arraylist-in-java/
https://www.geeksforgeeks.org/read-file-into-an-array-in-java/
*/ 


// Import necessary libraries.
import java.io.IOException;
import java.util.Scanner;


/**
 * Public class to represent an online store.
 */
public class OnlineStore {
    // The "ItemInventory" object declared. 
    private ItemInventory inventory;


    /**
     * Method starts the application, loads in the inventory and interacts with user.
     */
    public void start() {
        try { // Load the inventory from file.
            inventory = ItemInventory.load("Inventory.txt");
            MenuUserInterface();
        } catch (IOException e) {
            System.out.println("Failed to load the inventory from .txt file!");
        }
    }


    /**
     * Method displays the inventory in a table format.
     */
    public void displayInventory() {
        System.out.printf("%-30s %10s %10s %10s\n", "Title", "Type", "Price", "Quantity");
        System.out.println("-----------------------------------------------------------------");
        inventory.displayAllItems(); // Displays the inventory in a formatted table.
        System.out.println("-----------------------------------------------------------------");
    }


    /**
     * Method searchs for an item by title and displays its details if its found.
     * @param title The title of the items to search for.
     */
    public void searchItem(String title) {
        // Searchs for an item by title and displays its details if found.
        ItemEntry entry = inventory.findItemEntryByTitle(title);
        if (entry != null) {
            System.out.println(entry); // Print item details if found.
        } else {
            System.out.println("Item cannot be found.");
        }
    } 


    /**
     * Method displays items filtered by type.
     * @param type The type of items to display.
     */
    public void displayItemsByType(String type) {
        System.out.printf("%-30s %10s %10s %10s\n", "Title", "Type", "Price", "Quantity");
        System.out.println("-----------------------------------------------------------------");
        for (ItemEntry entry : inventory.getAllItemEntries()) {
            if (entry.getItem().getItemType().equalsIgnoreCase(type)) {
                System.out.println(entry);
            }
        }
        System.out.println("-----------------------------------------------------------------");
    }


    /**
     * Helper method to get the type of an item.
     * @param item The item to get the type of.
     * @return The type of item.
     */
    public String getType(Item item) {
        return item.getItemType();
    }


    /**
     * Method that will display the user interface to the user to interact with.
     */
    private void MenuUserInterface() {
        Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Welcome to eMart");
                System.out.println(" 1) Show all items");
                System.out.println(" 2) Show only music CDs");
                System.out.println(" 3) Show only books");
                System.out.println(" 4) Show only software");
                System.out.println(" 5) Exit program");
                System.out.println("Your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 


                switch (choice) {
                    case 1:
                        displayInventory();
                        break;
                    case 2:
                        displayItemsByType("music");
                        break;
                    case 3:
                        displayItemsByType("book");
                        break;
                    case 4:
                        displayItemsByType("software");
                        break;
                    case 5:
                        System.out.println("Exit program");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        scanner.close();
                }
            }
           
        }


    /**
     * Main Method to start the application.
     * @param args Returns arguments. 
     */
    public static void main(String[] args) {
        // Create new instance of classes.
        // Invoke method 'start' and start the application.
        new OnlineStore().start();
        }
    }