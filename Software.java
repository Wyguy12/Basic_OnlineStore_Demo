

/**
 * Public class that creates an object called software.
 */
public class Software extends Item {
    // Declare/Initialize data attributes properties/attributes.
    private String version;


    /**
     * No-args constructor.
     * Initializes an empty Software object.
     */
    public Software() {
    }


    /**
     * Constructor to initialize parameters.
     * Initializes the Software object with the given attributes title, price, version.
     * @param title 
     * @param price
     * @param version
     */
    public Software(String title, double price, String version) {
        super(title, price); // Call Base class attributes.
        this.version = version;
    }


    /**
     * Getter method
     * @return
     */
    public String getVersion() {
        return version;
    }


    /**
     * Setter method
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * Getter method
     * @return String type format to return software objects. 
     */
    public String getSoftwareDetails() {
      return String.format("Title: %s, Version: %s, Price: %.2f", getTitle(), version, getPrice());
    }

}