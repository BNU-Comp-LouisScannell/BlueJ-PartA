
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
    private int cost;
    private String dateandtime;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        this.destination = destination;
        this.cost = cost;
        this.dateandtime = dateandtime;
    }

    /**
     * Print ticket
     */
    public void print()
    {
        System.out.println("Ticket + destination" + "Price:" + cost + dateandtime);
        
    }
}
