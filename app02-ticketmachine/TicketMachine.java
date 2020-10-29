/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Louis Scannell
 * 19/10/2020
 */
public class TicketMachine
{

    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Allows enum coin class to be used for coin values
    public Coin2 coin;
    
    private Ticket issuedTicket;
    //Ticket constants
    public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("High Wycombe", 330);
    public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int price)
    {
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return issuedTicket.getPrice();
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(Coin2 coin)
    {
        {
            balance = balance + coin.getValue();
        }
    }
    
    //Allows the user of the machine to choose Wycombe as a ticket
    public void chooseHighWycombe()
    {
        issuedTicket = HIGHWYCOMBE_TICKET;
    }
    //Allows the user of the machine to choose Amersham as a ticket
    public void chooseAmersham()
    {
        issuedTicket = AMERSHAM_TICKET;
    }
    //Allows the user of the machine to choose Aylesbury as a ticket
    public void chooseAylesbury()
    {
        issuedTicket = AYLESBURY_TICKET;
    }


    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= issuedTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + issuedTicket.getPrice() + " cents.");
            System.out.println("##################");
            System.out.println();


            // Reduce the balance by the price.
            balance = balance - issuedTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (issuedTicket.getPrice()- balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
