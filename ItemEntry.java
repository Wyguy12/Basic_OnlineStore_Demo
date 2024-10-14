

// Import in necessary libraries. 
import java.util.Objects;


/**
 * Public class to represent an object called ItemEntry.
 */
public class ItemEntry {
    // Declare/Initialize data field attributes/properties.
    private Item item;
    private int quantity;


    /**
     * No-Args Constructor.
     * Initializes an empty ItemEntry object.
     */
    public ItemEntry() {
    }


    /**
     * Second constructor. 
     * Intitializes the ItemEntry object with the given attributes item and quantity.
     * @param item
     * @param quantity
     */
    public ItemEntry(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }


    /**
     * Getter method.
     * @return 
     */
    public Item getItem() {
        return item;
    }


    /**
     * Getter method.
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Setter method.
     * @param 
     */
    public void setItem(Item item) {
        this.item = item;
    }


    /**
     * Setter method
     * @param 
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Method checks if two ItemEntry objects are equal based on their item and quantity.
     * @param o The object used to compare with.
     * @return Returns True if the objects are equal, otherwise false. 
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Checking if the objects are the same instances.
        if (o == null || getClass() != o.getClass()) return false;
        ItemEntry itemEntry = (ItemEntry) o;
        return quantity == itemEntry.quantity && item.equals(itemEntry.item);
    }


    /**
     * Method generates a hash code for the ItemEntry object based on ites attributes item and quantity.
     * @return Returns the hash code of the ItemEntry object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(item, quantity);
    }


    /**
     * Getter method
     * @return String type format to return ItemEntry objects. 
     */
    public String toString() {
        return String.format("%-30s %10s %10.2f %10d", item.getTitle(), item.getItemType(), item.getPrice(), quantity);
    }

}