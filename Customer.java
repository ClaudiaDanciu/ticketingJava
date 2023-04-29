import java.util.ArrayList;

/**
 * The Customer Class represents a type of user in ticket reservation system
 *
 * @ClaudiaDanciu
 * @29.04.2023
 */
public abstract class Customer
{
    // instance variables - replace the example below with your own
    protected String customerAddress;
    protected String customerName;
    protected String customerUsername;
    protected String customerEmail;
    protected String customerPassword;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String customerAddress, String customerName, String customerUsername, 
    String customerEmail, String customerPassword)
    {
        // initialise instance variables
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.customerUsername = customerUsername;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
    }
    
        // methods for class Customer
        public abstract void selectSeat(Seat seat);
        public abstract void login(String customerUsername, String customerPassword);
        public abstract void selectEvent(Event event);
        public abstract void selectShow(Show show);
        public abstract void register();
        public abstract void purchaseTickets(ArrayList<Ticket> tickets);
        public abstract void updateProfile(String customerAddress, 
        String customerName, String customerUsername, String customerEmail, 
        String customerPassword);
    }

