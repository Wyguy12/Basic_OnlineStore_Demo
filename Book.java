

/**
 * Public class that creates an object called book.
 */
public class Book extends Item {
    // Declare/Initialize data fields attributes/properties.
    private String authors;
    private String edition;
    private String publisher;
    private int pubYear;


    /**
     * No-args constructor.
     * Initializes an empty Book object.
     */
    public Book() {
    }


    /**
     * Constructor to initialize parameters.
     * Initializes the Book object with the given attributes title, price, authors, edition, publisher, pubYear.
     * @param title
     * @param price
     * @param authors
     * @param edition
     * @param publisher
     * @param pubYear
     */
    public Book(String title, double price, String authors, String edition, String publisher, int pubYear) {
        super(title, price);  // Call Base class attributes.
        this.authors = authors;
        this.edition = edition;
        this.publisher = publisher;
        this.pubYear = pubYear;
    }


    /**
     * Getter method
     * @return
     */
    public String getAuthors() {
        return authors;
    }


    /**
     * Getter method
     * @return
     */
    public String getEdition() {
        return edition;
    }


    /**
     * Getter method
     * @return
     */
    public String getPublisher() {
        return publisher;
    }


    /**
     * Getter method
     * @return
     */
    public int getPubYear() {
        return pubYear;
    }


    /**
     * Setter method
     * @param authors
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }


    /**
     * Setter method
     * @param edition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }


    /**
     * Setter method
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    /**
     * Setter method
     * @param pubYear
     */
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }


    /**
     * Getter method.
     * @return String type format to return book objects. 
     */
    public String getBookDetails() {
       return String.format("Title: %s, Authors: %s, Edition: %s, Publisher: %s, Year: %d, Price: %.2f", getTitle(), getAuthors(), getEdition(), getPublisher(), getPubYear(), getPrice());
    }

}