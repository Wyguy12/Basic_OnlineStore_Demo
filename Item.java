

// Import necessary libraries. 
import java.util.Objects;


/**
 * Public class that represents an object called Item. 
 */
public class Item {
    // Declare/Initialize data field attributes/properties
    private String title;
    private double price;


    /**
     * 
     * Constructor: no-args.
     * Initializes an empty Item object.
     */
    public Item() {

    }


    /**
     * Second constructor 
     * Intitializes the Item object with the given attributes title and price.
     * @param title
     * @param price
     */
    public Item(String title, double price) {
        this.title = title;
        this.price = price;
    }


    /**
     * Getter method.
     * @return title.
     */
    public String getTitle() {
        return title;
    }


    /**
     * Getter method.
     * @return price.
     */
    public double getPrice() {
        return price;
    }


    /**
     * Setter method.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Setter method.
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Method that checks if two Item objects are equal based on their title and price.
     * @param o is The object to compare with.
     * @return True if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Checks if the objects are the same instance.
        if (o == null || getClass() != o.getClass()) return false; // Checking if the other object is zero or of a different class..
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && title.equals(item.title); // Comparing the price and title.
    }

    
    /**
     * Method that will generate a hash code for the item based on its title and price.
     * @return The hash code of the item.
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, price); // Will generate a hash code using title and price objects.
    }


    /**
     * Method that will get the type of the item as a string
     * This method uses instanceof to figure out the specific subclass.
     * @return The type of the item("book,", "music", "software", "unknown").
     */
    public String getItemType() {
        if (this instanceof Book) {
            return "book";
        } else if (this instanceof MusicCD) {
            return "music";
        } else if (this instanceof Software) {
            return "software";
        } else {
            return "unknown type";
        }
    }

}