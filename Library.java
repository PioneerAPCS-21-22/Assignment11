import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Library here.
 *
 * @author 
 * @version 
 */

public class Library
{
    // Instance variables
    private String address;
    private final double FINE = 0.25;
    private List<Book> catalog = new ArrayList<>();

    /**
     * Constructs a new Library object with given address.
     *
     * @param a - library's address as String
     */
    // Add your implementation here



    /**
     * getAddress
     * 
     * Get the address of this Library
     *
     * @return the address of this Library 
     */
    // Add your implementation here



    





    
    /* DO NOT EDIT ANYTHING BELOW HERE */
    
    
    /**
     * Book object is added to catalog
     *
     * @param book - Book object being added
     *
     */
    public void addBook(Book book)
    {
        catalog.add(book);
    }

    /**
     * Prints to console whether book is already rented, if it is not in the catalog, or if it has been rented successfully.
     *
     * @param title - title of book
     *
     */
    public void borrowBook(String title)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equalsIgnoreCase(catalog.get(i).getTitle()))
            {
                if(catalog.get(i).isBorrowed())
                {
                    System.out.println("\"" + catalog.get(i).getTitle() + "\" is already rented from "
                            + this);

                    return;
                }

                else
                {
                    System.out.println("You successfully rented \"" + catalog.get(i).getTitle() + "\" from " + this);
                    catalog.get(i).rentBook();
                    return;
                }
            }
        }

        System.out.println("\"" + title + "\" is not in the catalog at " + this);
    }

    /**
     * Prints to console whether no books are in the catalog or prints the list of books (and says if they are currently rented).
     */
    public void printAvailableBooks()
    {
        if(catalog.size() == 0)
        {

            return;
        }

        System.out.println("List of books at " + this + ":");
        for(int i = 0; i < catalog.size(); i++)
        {
            if(catalog.get(i).isBorrowed())
            {
                System.out.println("\"" + catalog.get(i) + "\" -- OUT OF STOCK");
            }

            else
                System.out.println("\"" + catalog.get(i) + "\"");
        }
    }

    /**
     * Book with title is marked as returned and the fine amount is given, which is FINE * daysLate
     *
     * @param title - title of book being returned
     * @param daysLate - number of days late
     */
    public void returnBook(String title, int daysLate)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equalsIgnoreCase(catalog.get(i).getTitle()))
            {
                catalog.get(i).returnBook();
                System.out.println("You successfully returned \"" + catalog.get(i).getTitle() + "\" to " + this);
                System.out.println("Your book was " + daysLate + " days late. You owe $"
                        + (daysLate * FINE));
                        
                return;
            }
        }

        System.out.println("That book is not part of our catalog.");
        System.out.println("Are you sure you rented that book from this " + this + "?");
    }
    
    /**
     * Returns the String representation of this Library.
     *
     * @return The String representation of this Library.
     */
    @Override
    public String toString()
    {
        return "Library (" + getAddress() + ")";
    }
}
