/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Book
{
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean rented;

    /**
     * Constructs a Book object
     *
     * @param t - title of the book
     * @param a - author of the book
     * @param g - genre
     * @param y - year book was published
     */
    public Book(String t, String a, String g, int y)
    {
        
    }


    /**
     * This Book is marked as rented.
     */
    public void rentBook()
    {
        
    }

    /**
     * This Book is set as not rented.
     */
    public void returnBook()
    {
        
    }


    /**
     * Returns true if this Book is currently rented.
     *
     * @return returns true if this Book is rented, false otherwise.
     */
    public boolean isBorrowed()
    {
        
    }


    /**
     * Returns the title of this Book 
     *
     * @return title of this Book
     */
    public String getTitle()
    {
        
    }


    /**
     * Returns the author of this Book
     *
     * @return author of this Book
     */
    public String getAuthor() 
    {
        
    }


    /**
     * Returns the year this Book was published. 
     *
     * @return year of publication of this Book
     */
    public int getYear()
    {
        
    }
    


    
    
    /* DO NOT EDIT ANYTHING BELOW HERE */
   
    
    /**
     * Returns the String representation of this Book.
     * 
     * @return String representation of this Book.
     */
    @Override
    public String toString()
    {
        return getTitle() + " by " + getAuthor() + " (" + getYear() + ")";
    }
}
