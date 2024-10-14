

// Import necessary libraries.
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * Class to manage the inventory of items in a store.
 */
public class ItemInventory {
    // Declare/Initialize properties/attributes
    private ArrayList<ItemEntry> entries = new ArrayList<>(); // List of item entries..
    private String file; // File that contains the inventory data.


    /**
     * First no-args constructor.
     * Initializes an empty ItemInventory object.
     */
    private ItemInventory() {
    }


    /**
     * Second constructor.
     * Initializes the ItemInventory object with the given attribute file. 
     */
    private ItemInventory(String file) {
        this.file = file;
    }


    /**
     * Method loads inventory data from a file and returns an ItemInventory object.
     * Uses an Array to parse through the data as its read line by line to get the total length.
     * Uses a variable called 'line' to read line by line the data in file.
     * @param file The file containing inventory data.
     * @return An ItemInventory object populated with data from the file.
     * @throws IOException IOException If an error occurs while reading the file.
     */
    public static ItemInventory load(String file) throws IOException {
        // Create a new ItemInventory object. 
        ItemInventory inventory = new ItemInventory(file); // 
        inventory.entries = new ArrayList<>(); // initialize the arraylist with 'entries'.
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); // Create instance of SimpleDateFormat for parsing dates.

        // Use BufferedReader to read the file line by line.
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) { 
                // Split the line into parts using '|' symbol.
                String[] parts = line.split("\\|");
                Item item = null; // Initialize the item variable to zero.
                int quantity = Integer.parseInt(parts[parts.length - 1]); // Parsing the quantity.

                // Switch statement to determine the item type and create corresponding Item object.
                switch (parts[0].toLowerCase()) { 

                case "music": 
                        Date releaseDate = null;
                    try {
                        releaseDate = dateFormat.parse(parts[3]); // Parse the release date.
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }    
                    item = new MusicCD(parts[1], Double.parseDouble(parts[8]), parts[2], releaseDate, parts[4], parts[5], Integer.parseInt(parts[6]), parts[7]); 
                    break;
                case "software": 
                    item = new Software(parts[1], Double.parseDouble(parts[2]), parts[3]);
                    break;
                case "book":
                    item = new Book(parts[1], Double.parseDouble(parts[6]), parts[2], parts[3], parts[4], Integer.parseInt(parts[5]));
                    break;
                }
                // If the item was created, add it to the entries list.
                if (item != null) {
                    inventory.entries.add(new ItemEntry(item, quantity));
                }
            }
        }
        return inventory; // Returns a populated ItemInventory object from the file.
    }


    /**
     * Method adds a new item entry to the inventory.
     * @param itemEntry The item entry to add.
     */
    public void addItemEntry(ItemEntry itemEntry) {
        entries.add(itemEntry);
    }


    /**
     * Method removes an item entry from the inventory.
     * @param itemEntry itemEntry The item entry to remove.
     */
    public void removeItemEntry(ItemEntry itemEntry) {
        entries.remove(itemEntry);
    }


    /**
     * Method finds an item entry by item title.
     * @param title The title of the item to find.
     * @return The ItemEntry if found, or null if not found.
     */
    public ItemEntry findItemEntryByTitle(String title) {
        for (ItemEntry entry : entries) {
            if (entry.getItem().getTitle().equalsIgnoreCase(title)) {
                return entry;
            }
        }
        return null;
    } 


    /**
     * Method returns an Arraylist of all item entries. 
     * @return A ArrayList of all item entries.
     */
    public ArrayList<ItemEntry> getAllItemEntries() {
        return entries; 
    }


    /**
     * Method displays all items in the inventory.
     */
    public void displayAllItems() {
        for (ItemEntry entry : entries) {
            System.out.println(entry);
        }
    }
    
}