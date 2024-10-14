

// Import necessary libraries 
import java.util.Date;


/**
 * Public class that creates an object called MusicCD.
 */
public class MusicCD extends Item {

    // Declare/Initialize necessary data field attributes/properties.
    private String artists;
    private Date releaseDate;
    private String label;
    private String recordCompany;
    private int totalLength;
    private String genres;


    /**
     * No-args constructor.
     * Initializes an empty MusicCD object.
     */
    public MusicCD() {

    }


    /**
     * Constructor to initialize parameters.
     * Initializes the MusicCD object with the given attributes title, price, artist, releaseDate, label, recordCompany, totalLength, genres.
     * @param title
     * @param price
     * @param artists
     * @param releaseDate
     * @param label
     * @param recordCompany
     * @param totalLength
     * @param genres
     */
    public MusicCD(String title, double price, String artists, Date releaseDate, String label, String recordCompany, int totalLength, String genres) {
        super(title, price); // Call Base class attributes.
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.label = label;
        this.recordCompany = recordCompany;
        this.totalLength = totalLength;
        this.genres = genres;
    }


    /**
     * Getter method
     * @return
     */
    public String getArtists() {
        return artists;
    }


    /**
     * Getter method
     * @return
     */
    public Date getReleaseDate() {
        return releaseDate;
    }


    /**
     * Getter method
     * @return
     */
    public String getLabel() {
        return label;
    }


    /**
     * Getter method
     * @return
     */
    public String getRecordCompany() {
        return recordCompany;
    }


    /**
     * Getter method
     * @return
     */
    public int getTotalLength() {
        return totalLength;
    }


    /**
     * Getter method
     * @return
     */
    public String getGenres() {
        return genres;
    }


    /**
     * Setter method
     * @param artists
     */
    public void setArtists(String artists) {
        this.artists = artists;
    }


    /**
     * Setter method
     * @param releaseDate
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Setter method
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * Setter method
     * @param recordCompany
     */
    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }


    /**
     * Setter method
     * @param totalLength
     */
    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }


    /**
     * Setter method
     * @param genres
     */
    public void setGenres(String genres) {
        this.genres = genres;
    }


    /**
     * Getter method
     * @return String type format to return music objects. 
     */
    public String getMusicCDDetails() {
        return String.format("Title: %s, Artists: %s, Release Date: %s, Label: %s, Record Company: %s, Total Length: %d, Genres: %s, Price: %.2f", getTitle(), artists, releaseDate, label, recordCompany, totalLength, genres, getPrice());
    }
    
}