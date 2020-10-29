import java.util.Date;
/**
 * Ticket Class
 *
 * @author Louis Scannell
 * @version 12/10/2020
 */
public class Ticket
{
    // instance variables
    private String destination;
    private int price;
    private Date issueDate;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        issueDate = new Date ();
    }

    public int getPrice()
    {
        return price;
    }
}
