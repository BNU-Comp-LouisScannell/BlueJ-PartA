
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
    private String dateandtime;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price, String dateandtime)
    {
        destination = destination;
        price = price;
        dateandtime = dateandtime;
    }

    /**
     * Print ticket
     */
    public void print()
    {
        System.out.println("Ticket + destination" + "Price:" + price + dateandtime);
        
    }
}
